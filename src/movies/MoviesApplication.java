package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication{


    public static void showAllMoviesFromCategory(Movie[] movies, String category){
        for (Movie movie : movies){
            if (movie.getCategory().equals(category)){
                System.out.printf("%s -- %s%n",movie.getName(), movie.getCategory());
            }
        }
    }
    public static void showCategory(Movie[] movies, String category) {
        for (Movie movie : movies) {
            if(movie.getCategory().equals(category)){
                System.out.printf("%s -- %s", movie.getName(), movie.getCategory());
            }
        }
    }

    private static String menu = """
               Enter a number
                                
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the sci-fi category
                6 - add a movie
                """;
    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        String userChoice = "";
        while (!userChoice.equals("0")) {
            userChoice = input.getString(menu);
            switch (userChoice) {
                case "1":
                    for (Movie movie : movies) {
                        System.out.printf("%s \n %n", movie.getName(), movie.getCategory());
                    }
                    break;
                case "2":
                    showAllMoviesFromCategory(movies, "animated");
                    break;
                case "3":
                    showAllMoviesFromCategory(movies, "drama");
                    break;
                case "4":
                    showAllMoviesFromCategory(movies, "horror");
                    break;
                case "5":
                    showAllMoviesFromCategory(movies, "scifi");
                    break;
            }

        }
}
}

