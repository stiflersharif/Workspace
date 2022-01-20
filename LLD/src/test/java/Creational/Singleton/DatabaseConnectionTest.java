package Creational.Singleton;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DatabaseConnectionTest {

    @Test
    public void test(){
        ConnectionPool pool = ConnectionPool.getInstance();
        ConnectionPool pool2 = ConnectionPool.getInstance();
        assertTrue("it will return true if the Connection is same",pool==pool2);
    }


}
