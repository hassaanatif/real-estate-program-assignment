package com.realestate;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner;

    public static void initializeScanner () {
            scanner = new Scanner(System.in);

    }

    public static int recordInt (String promptText) {
        if (!(promptText.equals("")))
          System.out.println(promptText);
        scanner = new Scanner(System.in);
        int outputInt = scanner.nextInt();
        return outputInt;
    }
    public static String recordString (String promptText){
        if (!(promptText.equals("")))
            System.out.println(promptText);

        scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return inputString;
    }

    public static void closeScanner() {
        scanner.close();
    }

}
