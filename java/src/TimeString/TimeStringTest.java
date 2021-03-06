package TimeString;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TimeStringTest
{
    private TimeString timeString;

    @Before
    public void setup()
    {
        timeString = new TimeString();
    }

    @Test
    public void timeString()
    {
        assertEquals("0:0:0", timeString.printSum(""));
        //assertEquals("0:0:1", timeString.printSum("0:1"));
    }

    @Test
    @Ignore
    public void allTimeString()
    {
        assertEquals("0:0:0", timeString.printSum(""));
        assertEquals("0:0:1", timeString.printSum("0:1"));
        assertEquals("0:0:2", timeString.printSum("0:2"));
        assertEquals("0:1:0", timeString.printSum("1:0"));
        assertEquals("1:0:0", timeString.printSum("60:0"));
        assertEquals("1:1:1", timeString.printSum("0:1 0:60 0:3600"));
        assertEquals("2:32:41", timeString.printSum("12:32 34:01 15:23 9:27 55:22 25:56"));
    }
}
