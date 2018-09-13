import java.time.LocalTime;

public class Clock {


    public double calculateAcuteAngleBetweenArrows(LocalTime timeInput) {

        double hourCastTo12 = timeInput.getHour();
        if (hourCastTo12 > 12) {
            hourCastTo12 = (hourCastTo12 - 12);
        }

        double minute = timeInput.getMinute();

        return applyAngleCalculatins(minute, hourCastTo12);
    }


    private double applyAngleCalculatins(double minute, double hourCastTo12) {

        double minuteArrowAngle;
        minuteArrowAngle = 360 * minute / 60;

        double hourArrowAngle;
        hourArrowAngle = (360 * hourCastTo12 / 12) + minuteArrowAngle / 12;

        return Math.abs(hourArrowAngle - minuteArrowAngle);
    }

}
