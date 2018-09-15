import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.*;

public class AngleCalculatorTest {

    @Test
    public void calculateAcuteAngleBetweenArrows() {
        AngleCalculator angleCalculator = new AngleCalculator();

        LocalTime time = LocalTime.parse("00:00");
        LocalTime time1 = LocalTime.parse("18:00");
        LocalTime time2 = LocalTime.parse("03:10");

        assertEquals(0, angleCalculator.calculateAcuteAngleBetweenClocksArrows(time),0);
        assertEquals(180, angleCalculator.calculateAcuteAngleBetweenClocksArrows(time1),0);
        assertEquals(35, angleCalculator.calculateAcuteAngleBetweenClocksArrows(time2),0);

    }
}