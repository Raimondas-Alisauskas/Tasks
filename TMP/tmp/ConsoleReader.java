import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleReader {

    public void readConsole() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String");
        String s = br.readLine();
        System.out.print("Enter Integer:");
        try {
            int i = Integer.parseInt(br.readLine());
        } catch (NumberFormatException nfe) {
            System.err.println("Invalid Format!");
        }
    }


    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print((prompt + " "));
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            inputLine = br.readLine();
            if (inputLine.length() == 0) return null;

        } catch (IOException e) {
            System.out.println("IOExeption: " + e);
        }
        return inputLine;
    }

    public void buffer() throws IOException {
        //Enter data using BufferReader
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String name = reader.readLine();

        // Printing the read line
        System.out.println(name);
    }


    public void scaner() {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("You entered string " + s);

        int a = in.nextInt();
        System.out.println("You entered integer " + a);

        float b = in.nextFloat();
        System.out.println("You entered float " + b);
    }

/*     Java program to demonstrate working of System.console()
     Note that this program does not work on IDEs as
     System.console() may require console */

    public void console() {
        // Using Console to input data from user
        String name = System.console().readLine();

        System.out.println(name);
    }


//    private final TextDevice io
//    private int readNumber() {
//        while (true) {
//            try {
//                return Integer.parseInt(io.readLine());
//            } catch (NumberFormatException e) {}
//        }
//    }
}
