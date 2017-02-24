package codingtestFeb21;

import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {

		// Scanner sc =new Scanner(System.in);
		// String n=sc.nextLine();
		int number = 5;
		int product = 1;
		for (int i = 1; i <= 10; i++) {

			product = number * i;
			System.out.println("5 * " + i + " = " + product);
		}
// continue
		// sc.close();
		;
	}
}