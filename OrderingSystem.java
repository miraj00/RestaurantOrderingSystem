package co.grandcircus;

import java.util.*;

public class OrderingSystem {

	//	2pt - In the same class, create an additional public static method named calculateSubtotal( ) that accepts two int parameters corresponding to the number of burgers and sodas ordered. It returns a double value representing the order subtotal (that is, the order total without tax). When calculating the subtotal, each burger costs $2.50 and each soda costs $1.25.
//	Call this method, pass it the number of burgers and sodas, and store the result in a variable.
	public static double calculateSubtotal(int numBurgers, int numSodas) {
		double orderSubtotal = 0;
		orderSubtotal = (numBurgers*2.5)+(numSodas*1.25);
		return orderSubtotal;
	}

	
//	1pt - Next create another method that accepts the double subtotal as a parameter and returns nothing. This method named addTaxDisplayTotal( ) should print the total by adding 7% to the subtotal. It MUST be printed on a line along with the word “Total”.
//	Call this method and pass it the subtotal.
	public static void addTaxDisplayTotal(double subtotal ) {
		System.out.println("Total: $"+(subtotal*1.07));
	}


	public static void main(String[] args) {
//		1pt - In your main method, write a loop that repeatedly presents the user with a menu of the following numbered options. 
		//The output must be formatted with each option on its own line exactly like this.
//		1. Burger
//		2. Soda
//		3. Exit
		
//		1pt - Continue looping until the user enters 3. (3 for Exit)
		
//		Each time through the loop…
//		If the selection is 1, add a burger to the order.
//		If the selection is 2, add a soda to the order.
//		If the selection is 3, the loop ends.
//		1pt - If any other number is entered, print "Sorry I didn't understand, let's try again.". The loop then continues to the next run
		
//		1pt - Print the subtotal. It MUST be printed on a line along with the word “Subtotal”. 
//		(Note: the number formatting is not important as long as the value is correct. For example, 
//		an order of 3 burgers and 0 sodas can simply print 7.5 for the subtotal.)
		
		int userEnteredNumber = 0;
		int burgersOrdered = 0;
		int sodasOrdered = 0;
		
		while (userEnteredNumber != 3) {
			System.out.println("1. Burger");
			System.out.println("2. Soda");
			System.out.println("3. Exit");
			System.out.print("Enter your selection: ");
			Scanner scan = new Scanner(System.in);
			userEnteredNumber = scan.nextInt();
			
			if (userEnteredNumber == 1) {
				burgersOrdered++;
				System.out.println(burgersOrdered);
			}
			else if (userEnteredNumber == 2) {
				sodasOrdered++;
				System.out.println(sodasOrdered);
			}
			else if (userEnteredNumber != 3) {
				System.out.println("Sorry I didn't understand, let's try again.");
			}
			else {
				double orderSubtotal = calculateSubtotal(burgersOrdered, sodasOrdered);
				System.out.println("Subtotal: $"+ orderSubtotal);
				addTaxDisplayTotal(orderSubtotal);
				
				System.out.print("Burgers: ");
				for (int i = 0; i < burgersOrdered; i++) {
				   System.out.print("*");
				}
				System.out.println();
				System.out.print("Sodas: ");
				for (int i = 0; i < sodasOrdered; i++) {
				   System.out.print("*");
				}
			}
		}
	}
}




























/*
 PRACTICE ASSESSMENT 1
OVERVIEW
Create a Java console application that utilizes loops. The application simulates the idea of a customer ordering from a restaurant that serves only burgers and soda. It takes the customer’s order one item at a time, then prints the subtotal and total with tax. Write your code inside the provided Assessment class in the starter project.
BUILD SPECIFICATIONS
The assignment is worth ten points, one for each of the test cases below. Pay special attention to the spelling and capitalization of the items in bold.

1pt - In your main method, write a loop that repeatedly presents the user with a menu of the following numbered options. The output must be formatted with each option on its own line exactly like this.
1. Burger
2. Soda
3. Exit
1pt - Continue looping until the user enters 3. (3 for Exit)
Each time through the loop…
If the selection is 1, add a burger to the order.
If the selection is 2, add a soda to the order.
If the selection is 3, the loop ends.
1pt - If any other number is entered, print "Sorry I didn't understand, let's try again.". The loop then continues to the next run
2pt - In the same class, create an additional public static method named calculateSubtotal( ) that accepts two int parameters corresponding to the number of burgers and sodas ordered. It returns a double value representing the order subtotal (that is, the order total without tax). When calculating the subtotal, each burger costs $2.50 and each soda costs $1.25.
Call this method, pass it the number of burgers and sodas, and store the result in a variable.
1pt - Print the subtotal. It MUST be printed on a line along with the word “Subtotal”. (Note: the number formatting is not important as long as the value is correct. For example, an order of 3 burgers and 0 sodas can simply print 7.5 for the subtotal.)
1pt - Next create another method that accepts the double subtotal as a parameter and returns nothing. This method named addTaxDisplayTotal( ) should print the total by adding 7% to the subtotal. It MUST be printed on a line along with the word “Total”.
Call this method and pass it the subtotal.
2pt - Next print a line with one asterisk for each burger purchased. It MUST be printed on a line along with the word “Burger”. For example, if 4 burgers were added to the order:
Burgers: ****
1pt - Next print a line with one asterisk for each soda purchased. It MUST be printed on a line along with the word “Soda”. For example, if 2 sodas were added to the order:
Sodas: **

EXAMPLE RUN
1. Burger
2. Soda
3. Exit
Select an option: {User enters 1}
1. Burger
2. Soda
3. Exit
Select an option: {User enters 1}
1. Burger
2. Soda
3. Exit
Select an option: {User enters 2}
1. Burger
2. Soda
3. Exit
Select an option: {User enters 7}
Sorry I didn’t understand, let’s try again.
1. Burger
2. Soda
3. Exit
Select an option: {User enters 3}
Subtotal: $6.25         ← Note: calculateSubtotal used to get this number
Total: $6.6875          ← Note: this line printed in addTaxDisplayTotal
Burgers: **
Sodas: *
 
 
 */





