import java.util.Scanner;

public class Settings {  //Preset default options:
	public static int Input_Question_1=6;   // How Many Colours would they like in the range from 6-10?
	public static int Input_Question_2=4;   // How many Colours would they like in the code 3 or 4?
	public static int input_Question_3=7;   // How many Guesses would they like Max is 12!
	public static int Guessing_Score=10;
	public static void main (String[] arg)
	{
		System.out.print(Printbanner2);
		options_Main();
		Changing_Score_System(Guessing_Score);
	}
	private static String Printbanner2= 
			"  ____          _     _     _                       \n" +
					" / ___|   __   | |_  | |_  (_)  _ __      ___    ___  \n" +
					" \\__  \\  /_'\\  | __| | __| | | | '_ \\   /'-' |  / __|  \n" +
					" ____)| |  _/  | |_  | |_  | | | | | | | (_| | \\__\\  \n" +
					" |____/  \\___| \\___| \\___| |_| |_| |_|  \\__, | |___/   \n" +
					"                                        |___/         \n" +
					"";
	public static void options_Main()
	{
		System.out.println("_______________________________________________________\n");
		System.out.println("DEFAULT OPTIONS:");
		System.out.println("Number of colours you would like in the range, between the numbers 6-10?");
		System.out.println(option1());
		System.out.println("Number of colours you would like in the Code 3 or 4?");
		System.out.println(option2());
		System.out.println("Number of guesses you would like Max is (12)?");
		System.out.println(option3());
		System.out.println("_______________________________________________________\n");
		System.out.println("COLOUR OPTIONS:");
		System.out.println("These are the colours that have been added to generate the code:");
	//	{ 'R','G','B','Y','O','P','W','C','T','N'};
		String message = "COLOURS WITHIN THE CODE:"+"R=Red,G=Green,B=Blue,Y=Yellow,O=Red,P=Purple,W=White,"+"C=Cyan,T=Turquoise,N=Navy";
		String Outline = "";
		StringBuilder Display_Output = new StringBuilder();
		for (int i = 2; i < message.length() +8; i++) 
		{
			Outline += "#";
		}
		Display_Output.append(Outline).append("\n");
		Display_Output.append(String.format("%s%" + (Outline.length() - 1) + "s%n", "|", "|"));
		Display_Output.append(String.format("%s %s%" + (Outline.length() - message.length() -2) + "s%n", "|", message, "|"));
		Display_Output.append(String.format("%s%" + (Outline.length() - 1) + "s%n", "|", "|"));
		Display_Output.append(Outline).append("\n");
		System.out.println(Display_Output);
	    String Point_System_Message="HOW DOES THE POINT SYSTEM WORK?\n"+ 
		"(:)The point system is calculated by taking the [1] number of guesses remaining,[2]adding the number of colours in the range,\n"+ 
	    "(:)then[3]adding the number of colours in the code made up by you.\n"+
		"(:)You get to decide how many points you get per a guess ranging from 0 all the way to 100.\n"+
	    "(:)The points are displayed only if you have won or lost at the end of the game.";
	    System.out.println(Point_System_Message);
		Scanner Console_input = new Scanner(System.in);
		System.out.println("_______________________________________________________\n");
		System.out.println("1: [Change Score Point System]");
		System.out.println("2: [Press '2' to Return to the Main Menu]");
		int choice=Console_input.nextInt();
		Console_input.nextLine();
		switch (choice) 
		{
		case 1: 
			System.out.println("User inputted:"+"["+choice+"]");
			System.out.println("-----------------------------------------------------");
			Confirming_Score_Change(false);
			break;
		case 2:
			System.out.println("User inputted:"+"["+choice+"]");
			System.out.println("-----------------------------------------------------");
			int Menu=2;
			if (Console_input.equals(Menu));
			{
				System.out.println("Going to the Main Menu option....");
				MasterMind_Variation_A_1945979.main(null);
			}
			break;
		default:
			if (choice!=1 || choice!=2) // Takes user input and matches it with the number 1-4 if none are chosen it will display error message 
			{
				System.out.println("\n-----------------------------------------------------");
				System.out.println("\\....\\....\\....\\....ERROR....//....//.....//....//");
				System.out.println("\nInvalid choice"+"["+choice+"]"+",please choose between the options 1-2");
				System.out.println("\n-----------------------------------------------------");
				main(null); //Prints console option method and loops back to start of method
			}
           Console_input.close();
		}
	}
	public static int option1() 
	{
		return Input_Question_1;
	}
	public static int option2() 
	{
		return Input_Question_2;
	}
	public static int option3() 
	{
		return input_Question_3;
	}
	private static int Changing_Score_System(int Change_Score) 
	{   
		System.out.println("Please enter a number of points you would like for your scoring, not exceeding 100");
		Scanner Change_Default_Score= new Scanner(System.in);
//		Change_Score= Change_Default_Score.nextInt();
//		System.out.println("User inputted:"+"["+Change_Score+"]");
		boolean NumberVal3=false;	    	
		while(NumberVal3==false) 
		{
			Change_Score= Change_Default_Score.nextInt();
			if(Change_Score<=100 || Change_Score==100)
			{  
				NumberVal3=true;
			//	Change_Score=Change_Default_Score.nextInt();
				System.out.println("User inputted:"+"["+Change_Score+"]");
				System.out.println("Confirming number of points for Score Change:"+"["+Change_Score+"]");
				Guessing_Score=Change_Score;
				Return_to_Menu(Change_Score);
			}
			else if (Change_Score>100 || Change_Score<0)
			{   
				NumberVal3=false;
				System.out.println("-----------------------------------------------------");
				System.out.println("\\....\\....ERROR....//....//");
				System.out.println("Invalid choice the maximum score point for guess is 100:");
				System.out.println("Please try again!");
				System.out.println("-----------------------------------------------------");
				Changing_Score_System(Change_Score);
			}
			Change_Default_Score.close();
		}
		return Change_Score;
	}
	public static void Return_to_Menu(int Return_to_Menu)
	{
		Scanner Setting_Menu= new Scanner(System.in);	
		System.out.println("_______________________________________________________\n");
		System.out.println("(Type in '2' if you would like to Return to the ConsoleOption:)");
		boolean NumberVal4=false;	    	
		while(NumberVal4==false) 
		{  
		    Return_to_Menu= Setting_Menu.nextInt();
			if (Return_to_Menu==2)
			{   
				NumberVal4=true;
				System.out.println("Going to the Main Menu option....");
				MasterMind_Variation_A_1945979.main(null);
			}
			else if (Return_to_Menu!=2)
			{
				NumberVal4=false;
				System.out.println("-----------------------------------------------------");
				System.out.println("\\....\\....ERROR....//....//");
				System.out.println("Invalid choice"+"("+Return_to_Menu+")"+" Please type '2' to return to the Menu!");
				System.out.println("Please try again!");
				System.out.println("-----------------------------------------------------");
				Return_to_Menu(Return_to_Menu);
			}
		}
	}
	public static boolean Confirming_Score_Change( boolean restart) 
	{
		restart = false; // Set as false so it loops
		String	Score_Validation_Entry="Would you like to change the score point system?\n"+ "Enter[Y] for Yes and [N] for No\n";
		char User_Input = MasterMind_Variation_A_1945979.Single_Character_Checker(Score_Validation_Entry, new char[] { 'y','Y', 'n','N' });
		if (User_Input == 'y'||User_Input == 'Y')
		{
			restart = true;
			System.out.println("User inputted:"+"["+User_Input+"]");
			Changing_Score_System(Guessing_Score);
		}
		else if (User_Input == 'N'||User_Input == 'n')
		{
			restart = false;
			System.out.println("User inputted:"+"["+User_Input+"]");
			System.out.println("Returning to Menu....");
			System.out.println(".//../../..//.../...");
			main(null);
		}
		return restart;
	}
}


