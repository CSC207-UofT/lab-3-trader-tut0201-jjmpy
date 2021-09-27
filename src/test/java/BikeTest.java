import org.junit.*;

import static org.junit.Assert.*;

public class BikeTest {
    Bike b;

    @Before
    public void setUp() throws Exception {
        b = new Bike();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(40, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        b.upgradeSpeed();
        assertEquals(60, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(200, b.getPrice());
    }
}
