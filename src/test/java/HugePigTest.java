import org.junit.*;

import static org.junit.Assert.*;


public class HugePigTest {
    HugePig h;

    @Before
    public void setUp() throws Exception {
        h = new HugePig();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Oink!", h.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(2, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(0, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, h.getPrice());
    }

}