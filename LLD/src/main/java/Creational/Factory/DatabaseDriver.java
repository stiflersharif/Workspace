package Creational.Factory;

public abstract class DatabaseDriver {

    public DatabaseDriver initialise() {
        System.out.println("check1");
        DatabaseDriver driver = createDriver();
        driver.connect();
        return driver;
    }
    public abstract void connect() ;

    public abstract DatabaseDriver createDriver();
}
