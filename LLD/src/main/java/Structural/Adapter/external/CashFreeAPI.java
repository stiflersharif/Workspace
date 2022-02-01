package Structural.Adapter.external;

public class CashFreeAPI {
    public String createURl(){
        return "Cash Free";
    }

    public void pay(int amount){
        System.out.println("Cashfree payment" +amount);
    }
    public  CashFreeStatus checkStatus(){
        return CashFreeStatus.OK;
    }
}
