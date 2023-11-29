

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class testTime.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testTime
{
    /**
     * Default constructor for test class testTime
     */
    public testTime()
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
    public void equals()
    {
        ClockTime clockTim1 = new ClockTime(11, 01, 01);
        ClockTime clockTim2 = new ClockTime(11, 01, 01);
        assertEquals(true, clockTim1.equals(clockTim2));
    }

    @Test
    public void string()
    {
        ClockTime clockTim1 = new ClockTime(11, 0, 0);
        assertEquals("11:00:00", clockTim1.toString());
    }
}


