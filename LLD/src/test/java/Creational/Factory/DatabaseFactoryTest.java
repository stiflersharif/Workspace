package Creational.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DatabaseFactoryTest {
    public DatabaseDriver driverFactory = null;

    @Before
    public void setUp() {
        driverFactory = new OracleSQLDriver();
    }

    @Test
    public void testMySqlDriver() {
      //  driverFactory.initialise();
        Assert.assertTrue(driverFactory.initialise() instanceof OracleSQLDriver);
    }
}
