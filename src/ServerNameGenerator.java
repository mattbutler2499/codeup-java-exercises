import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String ranAdj = randomAdj();
        String ranNum = randomNoun();

        System.out.println("Here is your server name");
        System.out.println(ranAdj + "-" + ranNum );
    }

    public static String randomAdj(){
        String [] adjectives = new String[10];
        adjectives[0] = "New";
        adjectives[1] = "Awesome";
        adjectives[2] = "Fantastic";
        adjectives[3] = "Beefy";
        adjectives[4] = "Super";
        adjectives[5] = "Courageous";
        adjectives[6] = "Deviant";
        adjectives[7] = "Magnificent";
        adjectives[8] = "Opposing";
        adjectives[9] = "Pretty";

        Random random = new Random();
        int ranAdj = random.nextInt(adjectives.length);
        return (adjectives[ranAdj]);

    }

    public static String randomNoun(){
        String [] nouns = new String[10];
        nouns [0] = "Avocado";
        nouns [1] = "Walrus";
        nouns [2] = "Beast";
        nouns [3] = "Milk";
        nouns [4] = "Pikachu";
        nouns [5] = "Cow";
        nouns [6] = "Chicken";
        nouns [7] = "Flamingo";
        nouns [8] = "Carrot";
        nouns [9] = "Frappacino";

        Random random = new Random();
        int ranNoun = random.nextInt(nouns.length);
        return(nouns[ranNoun]);
    }
}
