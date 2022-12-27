import java.util.Scanner;

public class Objective4Lab1 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is your first name?");
		String fname = "Eric";
		System.out.println(fname);
		System.out.println("What is your last name?");
		String lname = "Huettel";
		System.out.println(lname);
		System.out.println("What is your favorite animal?");
		String favoriteAnimal = "Cheetah";
		System.out.println(favoriteAnimal);
		System.out.println("What is your favorite food?");
		String favoriteFood = "Chicken";
		System.out.println(favoriteFood);
		System.out.println("What is your favorite song?");
		String favoriteSong = "The Morning";
		System.out.println(favoriteSong);
		System.out.println("My name is " + fname + " " + lname + ".");
		System.out.println("My favorite animal is the " + favoriteAnimal + ".");
		System.out.println("My favorite food is " + favoriteFood + ".");
	 	System.out.println("My favorite song is " + favoriteSong + ".");
	}
}
