/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class ZebraTest {
    Zebra z;

    @Before
    public void setUp() throws Exception {
        z = new Zebra();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Yahooo!", z.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(2, z.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        z.upgradeSpeed();
        assertEquals(3, z.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        z.downgradeSpeed();
        assertEquals(1, z.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(15, z.getPrice());
    }

}