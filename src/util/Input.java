package util;

import java.util.Scanner;

public class Input {
    public Scanner scanner = new Scanner(System.in);



    String getString(){
        return null;
    }

    boolean yesNo(String userInput){
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    int getInt(int min, int max){
        boolean correctValue;
        int userInput;

        do {
            System.out.printf("Please enter a number between %d and %d\n", min, max);
            userInput = Integer.parseInt(scanner.nextLine());
            correctValue = userInput >= min && userInput <= max;
            if (correctValue) {
                System.out.printf("Nice! You chose %d\n", userInput);
            } else {
                System.out.printf("That is not a number between %d and %d! Please try again\n", min, max);
            }
        } while (!correctValue);

        return userInput;
    }

    int getInt(){
        int userInput = Integer.parseInt(scanner.nextLine());
        return userInput;
    }

    double getDouble (double min, double max){
        double userInput = Integer.parseInt(scanner.nextLine());
        return userInput;
    }

    double getDouble() {
        double userInput = Integer.parseInt(scanner.nextLine());
        return userInput;
    }


}