package Creational.Factory;

import Creational.SimpleFactory.DatabaseDriver;
import Creational.SimpleFactory.DatabaseDriverFactory;
import Creational.SimpleFactory.MySQLDriver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DatabaseSimpleFactoryTest {
    DatabaseDriver databaseDriver = null;
    @Before
    public void setup(){
        databaseDriver = new MySQLDriver();
    }

    @Test
    public void testMysqlDriver(){
        DatabaseDriver driver = DatabaseDriverFactory.createDriver("mysql");
        Assert.assertTrue("if Mysql is the paramenter passed, then it should v mysql instance",driver instanceof MySQLDriver);
    }

}
