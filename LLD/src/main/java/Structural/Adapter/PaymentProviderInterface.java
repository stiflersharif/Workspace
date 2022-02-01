package Structural.Adapter;

import Structural.Adapter.external.PaymentStatus;

// create common adapter Interface
public interface PaymentProviderInterface {
    public String generateLink();
    public void pay(PaymentRequest paymentRequest);
    public PaymentStatus checkStatus();
}
