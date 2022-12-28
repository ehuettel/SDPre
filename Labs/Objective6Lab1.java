import java.util.Scanner;

public class Objective6Lab1 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
/* I may not have followed this lab entirely correct, however I wanted to see how this looks with a scanner. 
Works very nice. */
		System.out.println("Please enter 1-12 for the month you would like to see.");
		int month = keyboard.nextInt();

		switch (month) {
		  case 1:
			System.out.println("January");
			break;

		  case 2:
		  	System.out.println("February");
		  	break;

		  case 3:
		  	System.out.println("March");
		  	break;

		  case 4:
		  	System.out.println("April");
		  	break;

		  case 5: 
		  	System.out.println("May");
		  	break;

		  case 6:
		  	System.out.println("June");
		  	break;

		  case 7:
		  	System.out.println("July");
		  	break;

		  case 8:
		  	System.out.println("Augsust");
		  	break;

		  case 9:
		  	System.out.println("September");
		  	break;

		  case 10:
		  	System.out.println("October");
		  	break;

		  case 11:
		  	System.out.println("November");
		  	break;

		  case 12:
		  	System.out.println("December");
		  	break;

		  default:
		  	System.out.println("That is not a valid month.");
		  	break;


		}
	}
}