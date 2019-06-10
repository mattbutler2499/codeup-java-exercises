package udemy_exercises;

public class method_exercises {
    public static void main(String[] args) {
        displayHighScorePosition("Matthew", 4);
        int ranking = calculateHighScorePosition(2000);
        checkNumber(19);
    }
    public static void displayHighScorePosition(String playerName, int rank){
        System.out.println(playerName + " managed to get into position " + rank + " on the high score table!");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore > 1000){
            return 1;
        } else if (playerScore > 500 && playerScore <1000){
            return 2;
        } else if (playerScore > 100 && playerScore < 500){
            return 3;
        } else
            return 4;
    }

    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("Positive");
        } else if (number <0){
            System.out.println("Negative");
        } else if (number == 0){
            System.out.println("Zero");
        }
    }
}
