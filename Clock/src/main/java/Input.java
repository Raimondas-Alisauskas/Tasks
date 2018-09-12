import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class Input {


    public LocalTime putTimeFromConsole() {
        LocalTime time = LocalTime.MIDNIGHT;
        int numTries = 0;
        while (++numTries <= 3) {
            try {
                String readData = getInputFromConsole("Enter the time (hh:mm): ");
                time = LocalTime.parse(readData);
                break;
            } catch (NullPointerException e) {
                System.out.println("Please do not leave empty spaces");
//                    throw e;

            } catch (DateTimeParseException e) {
                System.out.println("Please write right time format");
//                    throw e;
            }
        }

        System.out.println();
        System.out.println("I have tried " + (numTries - 1) + " times. Unsuccessfully.  Time is set to 00:00. Lets go to sleep.");

        return time;
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
