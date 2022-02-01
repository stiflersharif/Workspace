package Structural.Adapter.APIAdapter;

import Structural.Adapter.PaymentProviderInterface;
import Structural.Adapter.PaymentRequest;
import Structural.Adapter.external.PaymentStatus;
import Structural.Adapter.external.RazorPayAPI;
import Structural.Adapter.external.RazorPayStatus;

//Step-2: create concrete adapter
public class RazorPayProvider implements PaymentProviderInterface {
    private RazorPayAPI razorPay =new RazorPayAPI();
    @Override
    public String generateLink() {
        return razorPay.makeLink();
    }

    @Override
    public void pay(PaymentRequest paymentRequest) {
        razorPay.makePayment(paymentRequest.getName(),paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus checkStatus() {
        RazorPayStatus status = razorPay.checkStatus();
        return toPaymentStatus(status);
    }

    private PaymentStatus toPaymentStatus(RazorPayStatus status) {
        if(status == RazorPayStatus.Pass){
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }
}
