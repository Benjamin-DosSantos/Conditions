import java.util.Scanner;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Adding In Console
 *	Project Description: a.	This program is 
 *  intended to add all of the numbers entered 
 *  into the console until a pre-defined number 
 *  is entered to end the adding. The console 
 *  then displays the final total to the user. 
 * 
 **/

public class Sum {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		int total_value = 0;
		int end_value = 0;
		int option;
		
		System.out.println("Enter the numbers you want to add");
		System.out.println("When you are done enter " + end_value + " to end the inputs.");
		
		do{
			option = input.nextInt();
			total_value += option;
		}while(option != end_value);
		
		System.out.println("The final total is: " + total_value);
	}
}