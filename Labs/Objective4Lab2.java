import java.util.Scanner;

public class Objective4Lab2 {
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
        int num1 = 3;
        int num2 = 5;
        int num3 = 7;
        double dub1 = 3.3;
        double dub2 = 5.5;
        double dub3 = 7.7;
        int numThree = num1 + num2 + num3;
        double dubThree = dub1 + dub2 + dub3;

        System.out.println("Please enter the first whole number you would like to add.");
        System.out.println(num1);
        System.out.println("Please enter the second whole number you would like to add.");
        System.out.println(num2);
        System.out.println("Please enter the third whole number you would like to add.");
        System.out.println(num3);
        System.out.println("Please enter the first decimal number you would like to add.");
        System.out.println(dub1);
        System.out.println("Please enter the second deciaml number you would like to add");
        System.out.println(dub2);
        System.out.println("Please enter the third deciaml number you would like to add.");
        System.out.println(dub3);
        System.out.println("The sum of " + "num1" + " + " + "num2" + " + " + "num3" + " = " + numThree);
        System.out.println("The sum of " + "dub1" + " + " + "dub2" + " + " + "dub3" + " = " + dubThree);




	}
}