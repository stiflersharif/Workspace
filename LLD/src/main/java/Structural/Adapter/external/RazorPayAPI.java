package Structural.Adapter.external;

public class RazorPayAPI {
    public String makeLink(){
       return "RazorPay";
    }
    public void makePayment(String name, int amount){
        System.out.println("Razorpay payment" +name);
    }
    public RazorPayStatus checkStatus(){
        return RazorPayStatus.Pass;
    }
}
