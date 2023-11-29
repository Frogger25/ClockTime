

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class testClass.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testClass
{
    /**
     * Default constructor for test class testClass
     */
    public testClass()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testSame()
    {
        ClockTime Clock1 = new ClockTime(11, 01, 01);
        ClockTime Clock2 = new ClockTime(11, 01, 01);
        assertEquals(true, Clock1.equals(Clock2));
        assertEquals(11, Clock1.getHour());
        assertEquals(01, Clock1.getMinute());
        assertEquals(01, Clock1.getSecond());
    }

    @Test
    public void testDifferent()
    {
        ClockTime Clock1 = new ClockTime();
        ClockTime Clock2 = new ClockTime(11, 01, 01);
        assertEquals(false, Clock1.equals(Clock2));
        assertEquals(0, Clock1.getHour());
        assertEquals(0, Clock1.getMinute());
        assertEquals(0, Clock1.getSecond());
    }

    @Test
    public void testToString()
    {
        ClockTime Clock1 = new ClockTime();
        assertEquals("00:00:00", Clock1.toString());
    }

    @Test
    public void testToString12()
    {
        ClockTime Clock1 = new ClockTime(11, 01, 01);
        assertEquals("11:01:01 A.M.", Clock1.toString12());
        Clock1.setHour(12);
        assertEquals("00:01:01 P.M.", Clock1.toString12());
    }

    @Test
    public void testSetters()
    {
        ClockTime Clock = new ClockTime();
        assertEquals("00:00:00", Clock.toString());
        Clock.setHour(1);
        Clock.setMinute(1);
        Clock.setSecond(1);
        assertEquals("01:01:01", Clock.toString());
    }
}





