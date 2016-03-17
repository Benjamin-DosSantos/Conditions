import java.util.Scanner;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Sub Menu In Console
 *	Project Description: a.	This program 
 *  is intended to display a menu in the 
 *  console until a pre-defined number 
 *  is entered to end the adding. 
 *  The console then sends a message to 
 *  the user telling them the order. 
 *  If a correct option number is not 
 *  entered then the console will display 
 *  an error message to the user. If a correct
 *  number is entered the console will display 
 *  another menu. If all of the menus complete 
 *  their function a total order will be displayed 
 *  to the user.a.	This program is intended to 
 *  display a menu in the console until a pre-defined 
 *  number is entered to end the adding. The console 
 *  then sends a message to the user telling them the 
 *  order. If a correct option number is not entered 
 *  then the console will display an error message to 
 *  the user. If a correct number is entered the console 
 *  will display another menu. If all of the menus complete 
 *  their function a total order will be displayed to the user.
 * 
 **/

public class Menu {
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
			Drink();
		}else if(option == 2){
			order[0] = "Hot Dog";
			Drink();
		}else if(option == 3){
			order[0] = "Mac & Cheese";
			Drink();
		}else{
			System.out.println(option + " Is not a valid choice");
		}
	}
	
	public static void Drink(){
		System.out.println("Please use the numbers provided to select the item.");
		System.out.println("0: Exit Menu");
		System.out.println("1: Hot Drink");
		System.out.println("2: Cold Drink");
		
		option = input.nextInt();
		
		if(option == end_value){
			System.exit(0);
		}else if(option == 1){
			Hot();
		}else if(option == 2){
			Soda();
		}else{
			System.out.println(option + " Is not a valid choice");
		}
	}
	
	public static void Soda(){
		System.out.println("Please use the numbers provided to select the item.");
		System.out.println("0: Exit Menu");
		System.out.println("1: Sprite");
		System.out.println("2: Coke-a-Cola");
		System.out.println("3: Fanta");
		
		option = input.nextInt();
		
		if(option == end_value){
			System.exit(0);
		}else if(option == 1){
			order[1] = "Sprite";
			Final();
		}else if(option == 2){
			order[1] = "Coke-a-Cola";
			Final();
		}else if(option == 3){
			order[1] = "Fanta";
			Final();
		}else{
			System.out.println(option + " Is not a valid choice");
		}
	}
	
	public static void Hot(){
		System.out.println("Please use the numbers provided to select the item.");
		System.out.println("0: Exit Menu");
		System.out.println("1: Tea");
		System.out.println("2: Coffee");
		
		option = input.nextInt();
		
		if(option == end_value){
			System.exit(0);
		}else if(option == 1){
			order[1] = "Tea";
			Final();
		}else if(option == 2){
			order[1] = "Coffee";
			Final();
		}else{
			System.out.println(option + " Is not a valid choice");
		}
	}
	
	public static void Final(){
		System.out.println("Your Final Order Is:");
		System.out.println("1x: " + order[0]);
		System.out.println("1x: " + order[1]);
		System.exit(0);
	}
}