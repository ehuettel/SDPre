import java.util.Scanner;

public class Objective9Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selection = 0;

		while(true) {
			printMenu();

		if (selection == 3) {
			System.out.println("Goodbye");
			break;
		} else if (selection == 2) {
			System.out.println("Culvers, Chile's, Chic Fil A");
		} else if (selection == 1) {
			System.out.println("Hello World");
		}
			selection = scanner.nextInt();
			

	}
}
	public static void printMenu(){
    	System.out.println("_____Menu_____");
    	System.out.println("1: Say Hello");
    	System.out.println("2: List My favorite foods");
    	System.out.println("3: Exit");
    	System.out.println();
    
  }
	
}