import java.util.Scanner;

public class ConsoleAdventureGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc = sc.useDelimiter("\n");

        System.out.println("Please enter your hero name");
        String heroName = sc.nextLine();
        System.out.printf("Welcome %s and thanks for joining up with us!", heroName);
        System.out.println("Are you ready to start your adventure? Type Yes to start or No to quit");

        String confirm = sc.nextLine();

        //click yes to start
        boolean confirmation = confirm.equals ("yes");


        //If yes is clicked game will start. If not it ends
        if (confirmation) {
            System.out.println("Let us begin our quest! Onward we go!");
        } else {
            System.out.println("You are a coward and shall be decapitated");
        }

        //Enemy Stats
        String enemyName = "Harambe";
        int enemyHealth = 50;
        int enemyAP = 5;
        int enemyPotion = 3;

        //Hero Stats
        int heroHealth = 100;
        int heroAP = 6;





    }
}
