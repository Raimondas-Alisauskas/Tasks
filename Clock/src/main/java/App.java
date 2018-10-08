import java.time.LocalTime;

public class App {


    public static void main(String[] args) {

        new App().startApp();
    }


    private void startApp() {

        AngleCalculator angleCalculator;
        LocalTime timeInput;
        double acuteAngle;


        timeInput = new Input().putTimeFromConsole();

        angleCalculator = new AngleCalculator();
        acuteAngle = angleCalculator.calculateAcuteAngleBetweenClocksArrows(timeInput);

        System.out.println();
        System.out.println("The accute angle between clock's arrows is " + acuteAngle);
    }

}
