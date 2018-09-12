import java.time.LocalTime;

public class Clock {


    public double calculateAcuteAngleBetweenArrows(LocalTime time) {
        // get arrows positions on Clock
        double hour = time.getHour();
        if (hour > 12) {
            hour = (hour - 12);
        }
        double minute = time.getMinute();

        //Get minute arrow angle
        double minuteArrowAngle;
//        if ( minute == 0) {
//            minuteArrowAngle = 0;
//        }
//        else {
            minuteArrowAngle = 360 * minute / 60;
//        }

        //Get hour arrow angle
        double hourArrowAngle;
//        if (hour == 0){
//            hourArrowAngle = 0;
//        }
//        else {
            hourArrowAngle = (360 * hour / 12) + minuteArrowAngle / 12;
//        }


        return Math.abs(hourArrowAngle - minuteArrowAngle);
    }


}
