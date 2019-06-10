package movies;

import util.Input;


import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {
        chooseMovie();
    }

    public static void chooseMovie (){
        System.out.println("What would you like to do?");
        System.out.println("0 - Exit");
        System.out.println("1 - View All Movies");
        System.out.println("2 - View Movies In The Animated Category");
        System.out.println("3 - View Movies In The Drama Category");
        System.out.println("4 - View Movies In The Horror Category");
        System.out.println("5 - View Movies In The Sci-Fi Category\n");
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your choice: ");
        int userInput = scanner.nextInt();
        if (userInput == 1){
            showAllMovies();
            goAgain();
        } else if (userInput == 2){
           showAnimatedMovies();
           goAgain();
        } else if (userInput == 3){
            showDramaMovies();
            goAgain();
        } else if (userInput == 4){
            showHorrorMovies();
            goAgain();
        } else if (userInput == 5){
            showSciFiMovies();
            goAgain();
        } else {
            System.out.println("Sorry that is not valid. Please enter a number between 1 and 5\n \n");
            chooseMovie();
        }
    }

    public static Movie [] movies = MoviesArray.findAll();

    public static void goAgain(){
        System.out.println("\nWould you like to go again?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("yes")){
            chooseMovie();
        } else {
            System.exit(0);
        }
    }

    public static void showAllMovies(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here is a list of all the movies we have!\n");
        for (int i = 0; i <= movies.length; i++){
            System.out.println(movies[i].getName());
        }

    }

    public static void showAnimatedMovies(){
        System.out.println("Here is a list of all the Animated movies we have\n");
        for (Movie i : movies){
            if (i.getCategory().equalsIgnoreCase("animated")){
                System.out.printf(i.getName() + " ---- " + i.getCategory() + "\n");
            }
        }
    }

    public static void showDramaMovies(){
        System.out.println("Here is a list of all the Drama movies we have \n");
        for (Movie movie: movies){
            if (movie.getCategory().equals("drama")){
                System.out.println(movie.getName() + " ---- " + movie.getCategory() );
            }
        }
    }

    public static void showHorrorMovies(){
        for (Movie movie: MoviesArray.findAll()){
            if (movie.getCategory().equals("horror")){
                System.out.println(movie.getName() + " ---- " + movie.getCategory() + "\n");
            }
        }
    }

    public static void showSciFiMovies(){
        for (Movie movie: MoviesArray.findAll()){
            if (movie.getCategory().equals("scifi")){
                System.out.println(movie.getName() + " ---- " + movie.getCategory() + "\n");
            }
        }
    }

//    public interface Marker {
//    }

//    interface Marker {
//    }

//    interface Marker {
//        public void write();
//    }

//    interface Marker {
//        void write();
//    }

//    public class Marker {
////        public void write() {}
////    }

//    abstract class Marker {
//        public void write();
    }
//}






























