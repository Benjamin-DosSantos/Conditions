import java.util.Scanner;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: ASCII Art
 *	Project Description: a.	This program is 
 *  intended to display a menu in the console 
 *  until a pre-defined number is entered to 
 *  end the adding. The console then sends a 
 *  message to the user showing them the ASCII art.
 *  If a correct option number is not entered then 
 *  the console will display an error message to the 
 *  user. If a correct number is entered the console
 *  will display another menu. If all of the menus 
 *  complete their function a piece of ASCII art 
 *  will be displayed to the user.
 * 
 **/

public class ASCIIArt{
	
	static Scanner input = new Scanner(System.in);
	static int option;
	
	public static void main(String[] args){
		System.out.println("Welcome to the selector menu.");
		System.out.println("0: Exit Menu");
		System.out.println("1: Food");
		System.out.println("2: Animals");
		System.out.println("3: Faces");
		
		option = input.nextInt();
		
		if(option == 0){
			System.exit(0);
		}else if(option == 1){
			Food();
		}else if(option == 2){
			Animals();
		}else if(option == 3){
			Faces();
		}else{
			Error();
		}
	}
	
	public static void Food(){
		System.out.println("Welcome to the food selector menu.");
		System.out.println("0: Exit Menu");
		System.out.println("1: Hot Dog");
		System.out.println("2: Pizza");
		System.out.println("3: Cake");
		
		option = input.nextInt();
		
		if(option == 0){
			System.exit(0);
		}else if(option == 1){
			HotDog();
		}else if(option == 2){
			Pizza();
		}else if(option == 3){
			Cake();
		}else{
			Error();
		}
	}
	
	public static void Animals(){
		System.out.println("Welcome to the animal selector menu.");
		System.out.println("0: Exit Menu");
		System.out.println("1: Dog");
		System.out.println("2: Cat");
		System.out.println("3: Fish");
		
		option = input.nextInt();
		
		if(option == 0){
			System.exit(0);
		}else if(option == 1){
			Dog();
		}else if(option == 2){
			Cat();
		}else if(option == 3){
			Fish();
		}else{
			Error();
		}
	}
	
	public static void Faces(){
		System.out.println("Welcome to the Faces selector menu.");
		System.out.println("0: Exit Menu");
		System.out.println("1: Happy");
		System.out.println("2: Sad");
		System.out.println("3: Mad");
		
		option = input.nextInt();
		
		if(option == 0){
			System.exit(0);
		}else if(option == 1){
			Happy();
		}else if(option == 2){
			Sad();
		}else if(option == 3){
			Mad();
		}else{
			Error();
		}
	}
	
	
	public static void HotDog(){
		
		System.out.println("    ______________     " );
		System.out.println(" .-\'              `-.  " );
		System.out.println("(____________________) " );
		System.out.println(" (                  )  " );
		System.out.println("( `----------------\\' )" );
		System.out.println(" `------------------\\' " );
         
	}
	
	public static void Pizza(){
		
		System.out.println("              _....._                    ");
		System.out.println("          _.:`.--|--.`:._	             ");
		System.out.println("       .: .\\'\\o  | o /\\'. \\'.        ");
		System.out.println("      // \\'.  \\ o|  /  o \\'.\\        ");
		System.out.println("    //\\'._o\\'. \\ |o/ o_.-\\'o\\\\     ");
		System.out.println("    || o \\'-.\\'.\\|/.-\\' o   ||       ");
		System.out.println("    ||  --o--o-->|< :===    ||           ");
		
	}
	
	public static void Cake(){
		
		System.out.println("        \'   \'   \'   \'                    ");
		System.out.println("        \' |_\'_|_\'_|_\'_| \'                ");  
		System.out.println("    _\'-=|;  |\'  |\'  |\'  |;=-_            ");  
		System.out.println("  .-_| \' | \' | \' | \' | \' |  _-.          ");
		System.out.println("  |:  -|:._|___|___|__.|:=-  :|          ");
		System.out.println("  ||*:  :    .     .    :  |*||          ");
		System.out.println("  || |  | *  |  *  |  * |  | ||          "); 
		System.out.println("_.-=|:*|  |    |     |    |  |*:|=-._    ");
		System.out.println("-    `._:  | *  |  *  |  * |  :_.'    -	 ");
		System.out.println("=_      -=:.___:_____|___.: =-     _=    ");
		System.out.println(" - . _ __ ___  ___  ___ __ _ . -         ");

	}
	
	
	public static void Dog(){
		
		System.out.println("	         __			    ");
		System.out.println("	        /  \\           ");
		System.out.println("	       / ..|\\          ");
		System.out.println("	      (_\\  |_)         ");
		System.out.println("	      /  \\@'           ");
		System.out.println("	     /     \\           ");
		System.out.println("	 _  /  `   |            ");
		System.out.println("	\\\\/  \\  | _\\        ");
		System.out.println("	 \\   /_ || \\\\_       ");
		System.out.println("	  \\____)|_) \\_)       ");
		
	}
	
	public static void Cat(){
		
		System.out.println("          A_A               ");
		System.out.println("         (-.-)              ");
		System.out.println("          |-|               ");
		System.out.println("         /   \\             ");
		System.out.println("        |     |   __        ");
		System.out.println("        |  || |  |  \\__    ");
		System.out.println("         \\_||_/_/          ");

		
	}
	
	public static void Fish(){
		
		System.out.println("	        ,-.-,-,				     ");
		System.out.println("	      _/ / / /       /)		     ");
		System.out.println("	    ,'        `.   ,'')		     ");
		System.out.println("	  _/(@) `.      `./ ,')		     ");
		System.out.println("	 (____,`  \\:`-.   \\ ,')		 ");
		System.out.println("	  (_      /::::}  / `.)		     ");
		System.out.println("	   \\    ,' :,-' ,)\\ `.)		 ");
		System.out.println("	    `.        ,')  `..)		     ");
		System.out.println("	      \\-....-'\\      \\) 	     ");
		System.out.println("	       `-`-`-`-`			     ");
		
	}
	
	
	public static void Happy(){
		
		System.out.println("                       MMM88&&&,              ");
		System.out.println(",MMM8&&&.              `\'MMM88&&&,            ");
		System.out.println("MMMMM88&&&&                \'MMM88&&&,         ");
		System.out.println("MMMMM88&&&&&&                 \'MMM88&&&,      ");
		System.out.println("MMMMM88&&&&&&                   \'MMM88&&&     ");
		System.out.println("MMMMM88&&&&&&                    \'MMM88&&&    ");
		System.out.println("MMMMM88&&&&                       MMM88&&&    ");
		System.out.println("\'MMM8&&&\'     MMMM888&&&&         \'MM88&&&    ");
		System.out.println("              MMMM88&&&&&          MM88&&&    ");
		System.out.println("              MMMM88&&&&&          MM88&&&    ");
		System.out.println(",MMM8&&&.                          MM88&&&    ");
		System.out.println("MMMMM88&&&&                        ,MM88&&&   ");
		System.out.println("MMMMM88&&&&&&                      MMM88&&&\'  ");
		System.out.println("MMMMM88&&&&&&                     MMM88&&&\'   ");
		System.out.println("MMMMM88&&&&&&                   MMM88&&&\'     ");
		System.out.println("MMMMM88&&&&                  MMM88&&&\'        ");
		System.out.println("\'MMM8&&&\'                MMM88&&&\'            ");
		System.out.println("                      MMM88&&&\'               ");

		
	}
	
	public static void Sad(){
		
		System.out.println(":\'(");
		
	}
	
	public static void Mad(){
		
		System.out.println("0\'_\'0");
		
	}
	
	public static void Error(){
		
		System.out.println(" ______   ______   ______   ______   ______   ______   ______");  
		System.out.println("/_____/  /_____/  /_____/  /_____/  /_____/  /_____/  /_____/ ");  
		System.out.println("/_____/  /_____/  /_____/  /_____/  /_____/  /_____/  /_____/  ");  
		System.out.println("");  
		System.out.println("");  
		System.out.println("             ___________                                        ");  
		System.out.println("  /\\|\\/\\     \\_   _____/_____________  ___________     /\\|\\/\\   ");  
		System.out.println(" _)    (__    |    __)_\\_  __ \\_  __ \\/  _ \\_  __ \\   _)    (__ ");  
		System.out.println(" \\_     _/    |        \\|  | \\/|  | \\(  <_> )  | \\/   \\_     _/ ");  
		System.out.println("   )    \\    /_______  /|__|   |__|   \\____/|__|        )    \\  ");  
		System.out.println("   \\/\\|\\/            \\/                                 \\/\\|\\/  ");  
		System.out.println("");           
		System.out.println("");  
		System.out.println("  ______   ______   ______   ______   ______   ______   ______      ");
		System.out.println(" /_____/  /_____/  /_____/  /_____/  /_____/  /_____/  /_____/  ");  
		System.out.println(" /_____/  /_____/  /_____/  /_____/  /_____/  /_____/  /_____/  ");  
		                                                                 
		
	}
}
