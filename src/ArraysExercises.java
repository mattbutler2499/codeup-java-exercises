import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));

        Person[] people = {new Person("bob"),new Person("Phil"),new Person("Tod")};

        for (int i = 0; i <= people.length ; i+=1){
            System.out.println(people[i].getName());
        }
    }





}
