import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class Input {


    private LocalTime time;
    private int maxNumTries = 5;

    /**
     * Asks time input from console in HH:mm format. Sets default time to 00:00 in case of time was entered in a wrong format
     * @return time in LocalTime format.
     */
    public LocalTime putTimeFromConsole() {

        int i = 0;

        while (true) {
            if (i++ == maxNumTries) {
                manageWrongInputs();
                break;
            }

            try {
                String readData = getInputFromConsole("Please enter the time (HH:mm):");
                time = LocalTime.parse(readData);
                break;

            } catch (NullPointerException e) {
                System.out.println("Please do not leave empty spaces");

            } catch (DateTimeParseException e) {
                System.out.println("The right time format is hours:minutes");
            }

        }
        return time;
    }


    private void manageWrongInputs() {
        System.out.println();
        System.out.println("I have tried " + maxNumTries + " times. Unsuccessfully.  Time is set to 00:00. It's time to sleep.");
        time = LocalTime.MIDNIGHT;
    }


    private String getInputFromConsole(String prompt) {

        String inputLine = null;

        try {
            System.out.print((prompt + " "));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            inputLine = br.readLine();
            if (inputLine.length() == 0) return null;

        } catch (IOException e) {
            System.out.println("IOExeption: " + e);
        }
        return inputLine;
    }

}
