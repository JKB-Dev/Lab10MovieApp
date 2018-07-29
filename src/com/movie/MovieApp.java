package com.movie;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// create and populate ArrayList
		ArrayList<Movie> Movies = new ArrayList<>();
		Movies = fillArrayList(Movies);
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("There are " + Movies.size() + " movies in this list. \n");

		String cont = "y";
		
		// loop this menu until user exits
		while (cont.equalsIgnoreCase("y")) {

			System.out.println("The categories are: \n1) Animated \n2) Drama \n3) Horror \n4) Sci Fi \n");
			System.out.println("What category are you interested in? (please enter a number 1 - 4): ");
			
			// match number selections with categories
			String category = chooseCategory(scan);
			
			System.out.println("\nMovies in the " + category + " category are:\n");
			
			//search ArrayList for matches and print to console
			searchMovie(Movies, category);
			
			System.out.println("\nWould you like to check other categories? y/n: ");
			
			cont = scan.nextLine();
		}
		
		// exit program
		System.out.println("\nGoodbye!");
		scan.close();
	}
	
	public static ArrayList<Movie> fillArrayList (ArrayList<Movie> movies) {
		
		// populate ArrayList with 100 movies from MovieIO class
		for (int i = 1; i <= 100; i++) {
			movies.add(MovieIO.getMovie(i));
			// FIXME some kind of alphabetization method here?
		}
		
		return movies;
	}
	
	public static String chooseCategory (Scanner scan) {
		
		String userNum = scan.nextLine();
		
		String userCategory = "";
		
		// match numbers to movie categories, invalid numbers trigger re-prompt
		while (userCategory.equals("")) {
			if (userNum.equals("1")) {
				userCategory = "animated";
			}
			else if (userNum.equals("2")) {
				userCategory = "drama";
			}
			else if (userNum.equals("3")) {
				userCategory = "horror";
			}
			else if (userNum.equals("4")) {
				userCategory = "scifi";
			} else {
				System.out.println("Please choose a number between 1 and 4: ");
				userNum = scan.nextLine();
			}
		}
		return userCategory;
	}

	public static void searchMovie(ArrayList<Movie> movies, String userCategory) {
		
		// search ArrayList and print matches to console
		for (Movie i : movies) {
			if (userCategory.equals(i.getCategory())) {
				System.out.println(i.getTitle());
			}
		}
	}
}

