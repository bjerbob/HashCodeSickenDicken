package SickenDicken;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test of class App.
 */
public class AppTest {
    /**
     * Test for correct sum of two arguments.
     */
    @Test
    public void testApp() {
        Assert.assertEquals( 33, App.add(30, 3));
    }
}
