package Creational.Factory;

public class OracleSQLDriver extends DatabaseDriver {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle Database");
    }
    @Override
    public DatabaseDriver createDriver(){
        return new OracleSQLDriver();
    }
    }
