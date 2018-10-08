import java.time.LocalTime;

public class AngleCalculator {


    /**
     * Calculates acute angle between clock's arrows.
     * @param timeInput LocalTime format.
     * @return angle is in degrees.
     */
    public double calculateAcuteAngleBetweenClocksArrows(LocalTime timeInput) {

        double hourCastTo12 = timeInput.getHour();
        if (hourCastTo12 > 12) {
            hourCastTo12 = (hourCastTo12 - 12);
        }
        double minute = timeInput.getMinute();

        return calculateAcuteAngleBetweenClocksArrows(minute, hourCastTo12);
    }


    /**
     * @param hourCastTo12 hours have to be casted to 12 hour format.
     * @return  returns angle is in degrees.
     */
    public double calculateAcuteAngleBetweenClocksArrows(double minute, double hourCastTo12) {

        double minuteArrowAngle;
        minuteArrowAngle = 360 * minute / 60;

        double hourArrowAngle;
        hourArrowAngle = (360 * hourCastTo12 / 12) + minuteArrowAngle / 12;

        return Math.abs(hourArrowAngle - minuteArrowAngle);
    }

}
