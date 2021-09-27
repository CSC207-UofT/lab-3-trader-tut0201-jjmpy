import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JonahTest {
    Jonah j;

    @Before
    public void setUp() throws Exception {
        j = new Jonah();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Hello, my name is Jonah!", j.sound());
    }

}
