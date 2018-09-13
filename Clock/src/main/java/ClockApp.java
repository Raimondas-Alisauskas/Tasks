import java.time.LocalTime;

public class ClockApp {


    public static void main(String[] args) {

        new ClockApp().startApp();
    }


    public void startApp() {

        Clock clock;
        LocalTime timeInput;
        double acuteAngle;


        timeInput = new Input().putTimeFromConsole();

        clock = new Clock();
        acuteAngle = clock.calculateAcuteAngleBetweenArrows(timeInput);

        System.out.println("The accute angle between clock's arrows is " + acuteAngle);
    }

}
