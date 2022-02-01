package Structural;

import Structural.Adapter.APIAdapter.CashFreeProvider;
import Structural.Adapter.PaymentProviderInterface;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PaymentProviderTest {
    PaymentProviderInterface paymentProvider=null;

    @Before
    public void setup(){
        paymentProvider = new CashFreeProvider();
    }
    @Test
    public void testRazorPay(){
        paymentProvider.checkStatus();
        paymentProvider.pay();
        paymentProvider.generateLink();
        Assert.assertTrue("if razor pay is used, then instance should ve razor pay",paymentProvider instanceof CashFreeProvider);
    }
}
