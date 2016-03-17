import java.util.Scanner;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Menu Pt.1
 *	Project Description: a.	This program is 
 *  intended to display a menu in the console 
 *  until a pre-defined number is entered to 
 *  end the adding. The console then sends
 *  a message to the user telling them the order. 
 *  If a correct option is not picked the console 
 *  then sends an error message to the user.
 * 
 **/

public class Menu_Pt_One {
	
	static Scanner input = new Scanner(System.in);
	static int option;
	static int end_value = 0;
	static String[] order = {"", ""}; 
	
	public static void main(String[] args){
		System.out.println("Welcome to the meal selector menu.");
		
		Food();
	}
	
	public static void Food(){
		System.out.println("Please use the numbers provided to select the item.");
		System.out.println("0: Exit Menu");
		System.out.println("1: Hamburger");
		System.out.println("2: Hot Dog");
		System.out.println("3: Mac & Cheese");
		
		option = input.nextInt();
		
		if(option == end_value){
			System.exit(0);
		}else if(option == 1){
			order[0] = "Hamburger";
			System.out.println("You Ordered " + order[0]);
		}else if(option == 2){
			order[0] = "Hot Dog";
			System.out.println("You Ordered " + order[0]);
		}else if(option == 3){
			order[0] = "Mac & Cheese";
			System.out.println("You Ordered " + order[0]);
		}else{
			System.out.println(option + " Is not a valid choice");
		}
	}
	
}
