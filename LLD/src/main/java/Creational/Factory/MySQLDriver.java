package Creational.Factory;

//Step-2 Create concrete implementation
public class MySQLDriver extends DatabaseDriver {

    @Override
    public void connect() {
        System.out.println("Connecting to SQL Database");
    }
    @Override
    public DatabaseDriver createDriver(){
        System.out.println("check2");
        return new MySQLDriver();
    }
}
