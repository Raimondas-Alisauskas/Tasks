import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.*;

public class ClockTest {

    @Test
    public void calculateAcuteAngleBetweenArrows() {
        Clock clock = new Clock();

        LocalTime time = LocalTime.parse("00:00");
        LocalTime time1 = LocalTime.parse("18:00");
        LocalTime time2 = LocalTime.parse("03:10");

        assertEquals(0,clock.calculateAcuteAngleBetweenArrows(time),0);
        assertEquals(180,clock.calculateAcuteAngleBetweenArrows(time1),0);
        assertEquals(35,clock.calculateAcuteAngleBetweenArrows(time2),0);

    }
}