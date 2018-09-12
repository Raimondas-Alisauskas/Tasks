import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.*;

public class ClockTest {

    @Test
    public void calculateAcuteAngleBetweenArrows() {
        Clock clock = new Clock();
        LocalTime time;
        time = LocalTime.parse("18:00");

        assertEquals(180,clock.calculateAcuteAngleBetweenArrows(time),0);
    }
}