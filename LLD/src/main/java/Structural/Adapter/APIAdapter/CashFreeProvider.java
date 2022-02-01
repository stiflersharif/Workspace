package Structural.Adapter.APIAdapter;

import Structural.Adapter.PaymentProviderInterface;
import Structural.Adapter.PaymentRequest;
import Structural.Adapter.external.CashFreeAPI;
import Structural.Adapter.external.CashFreeStatus;
import Structural.Adapter.external.PaymentStatus;
import Structural.Adapter.external.RazorPayStatus;

public class CashFreeProvider implements PaymentProviderInterface {
    private CashFreeAPI cashfree = new CashFreeAPI();
    @Override
    public String generateLink() {
        return cashfree.createURl();
    }

    @Override
    public void pay(PaymentRequest paymentRequest) {
        cashfree.pay(paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus checkStatus() {
        CashFreeStatus status = cashfree.checkStatus();
       // cashfree.checkStatus();
        return toPaymentStatus(status);
    }

    private PaymentStatus toPaymentStatus(CashFreeStatus status) {
        if(status == CashFreeStatus.OK){
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }
}
