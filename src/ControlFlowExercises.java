import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        for (int x=0; x<=100; x++);{
//            System.out.println("x is " + x);
//        }
//        for (long y=2; y < 1000000L; y*=y){
//            System.out.println(y);
//        }
//        for (int x = 1; x <=100; x++){
//            if (x % 15 == 0){
//                System.out.println("FizzBuzz");
//            } else if (x % 5 == 0){
//                System.out.println("Buzz");
//            } else if(x % 3 == 0){
//                System.out.println("Fuzz");
//            } else {
//                System.out.println(x);
//            }
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String integer = scanner.nextLine();
        System.out.println("number  |  squared  |  cubed \n");
        System.out.println("------  |  -------  |  ----- \n");
        System.out.println(integer +"|");

    }
}
