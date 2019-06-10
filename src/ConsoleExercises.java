import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        DecimalFormat df = new DecimalFormat("#.##");
//        System.out.print(df.format(pi));
        System.out.printf("The value of pi is approximately %f%n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner = scanner.useDelimiter("\n");

        System.out.print("Enter a number: ");
        int userInt = scanner.nextInt();

        System.out.println("You entered: \"" + userInt + "\"");

        scanner.nextLine();

        System.out.println("Please enter three words");
        String wordOne = scanner.nextLine();
        String wordTwo = scanner.nextLine();
        String wordThree = scanner.nextLine();

        System.out.printf("You have entered: %s, %s, and %s%n", wordOne, wordTwo, wordThree);

        System.out.println("Please enter a sentence");
        String userSentence = scanner.next();
        System.out.printf("The sentence you typed out was: %s%n", userSentence);

        System.out.println("Please enter a sentence");
        String userNextSentence = scanner.next();
        System.out.printf("The new sentence you typed out was: %s%n", userNextSentence);

        scanner.nextLine();

        System.out.println("What is the width of a classroom at Codeup?");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        System.out.printf("You have entered");
        System.out.println("What is the height of the classroom at Codeup?");
        System.out.printf("You have entered" + height + "as the desired width of the classroom");
        System.out.printf("The Area of your classroom is " + height * width + "and the perimeter is " + (height * 2) + (width * 2));

    }
}
