import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        System.out.println(add(4,7));
//        System.out.println(subtract(5, 2));
//        System.out.println(multiply(7, 3));
//        System.out.println(divide(15, 3));
//        System.out.println(remainder(7, 3));
//        System.out.println(getInteger(1, 100));
//        System.out.println(factorial(1, 10));
//        diceGame();
    }

    public static String add(int a, int b){
        int total;
        total = a + b;
        return "\nThe sum of " + a + " and " + b + " comes out to " + total + "\n";
    }

    public static String subtract(int a, int b){
        int total;
        total = a - b;
      return "When " + a + " is subtracted from " + b + " the total amount comes out to be " + total + "\n";
    }

    public static String multiply(int a, int b){
        int total;
        total = a * b;
        return "When " + a + " is multiplied by " + b + " the total comes out to " + total + "\n";
    }

    public static String divide(int a, int b){
        int total;
        total = a / b;
        return "When " + a + " is divided by " + b + " the total comes out to " + total + "\n";

    }

    public static String remainder(int a, int b){
        int total;
        total= a % b;
        return "When " + a + " is divided by " + b + " the remainder you have over is " + total + "\n";
    }

    public static void getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number between " + min + " and " + max);
        int userInput = scanner.nextInt();
        scanner.nextLine();

        if (userInput < min){
            System.out.println("Im sorry that number is to low.");
//            getInteger(min, max);
        } else if(userInput > max){
            System.out.println("Im sorry that number is to high.");
//            getInteger(min, max);
        } else {
            System.out.println("Nice choice! The number you chose was ");
//            getInteger(min, max);
        }

        getInteger(min,max);
    }

    public static int factorial(int min, int max) {
        System.out.println("Please enter a number between " + min + " and " + max);
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if(userInput >= min && userInput <= max){
            int number = 1;
            long input = userInput;
            for (int i = 1; i <=input; i++){
                number *= i;
            }
            System.out.println("Factorial of " + input + " is: " + number);
        }   return userInput;
    }

    public static void diceGame() {
        System.out.println("Please enter the number of sides for a pair of dice. \n");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int userInput = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Great Choice! You have chosen %d for your number of sides on the dice. \n", userInput);
        System.out.println("Are you ready to roll your dice? Type Yes if you are ready or No if you'd like to quit");
        String yesNo = scanner.nextLine();
        if (yesNo.equalsIgnoreCase("Yes")){
            System.out.println("Alright lets begin! Rolling the dice...");
            double diceOne = Math.floor(Math.random() * userInput + 1);
            double diceTwo = Math.floor(Math.random() * userInput + 1);
            double total = diceOne + diceTwo;
            System.out.printf("What a great roll! I see a %.0f and a %.0f! That's a total of %.0f!", diceOne, diceTwo, total);
        } else {
            System.out.println("Thanks for playing! Have a great day!");
        }
    }

}


