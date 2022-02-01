package Creational.SimpleFactory;

public class DatabaseDriverFactory {
    // create a factory method which accepts a paramenter
    public static DatabaseDriver createDriver(String type){
        if (type.equalsIgnoreCase("mysql")) {
            return new MySQLDriver();
        } else if (type.equalsIgnoreCase("oracle")) {
            return new OracleSQLDriver();
        }
        return null;
    }
}
