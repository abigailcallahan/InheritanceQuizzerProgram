import java.util.Scanner;


public class InheritanceQuizzerProgram
	{

		static Scanner input = new Scanner(System.in);
		static String enter;
		
		public static void main(String[] args)
			{
				Food x = new Food( );
				//Food x = new Pasta( );
				//Pasta x = new Food( );
				//Pasta x = new Pasta( );
				
				intro();
				
				quiz1();
//				quiz2();
//				quiz3();
//				quiz4();
//				quiz5();
//				quiz6();
//				quiz7();
//				quiz8();
//				quiz9();
//				quiz10();
//				quiz11();
//				quiz12();

			}
		
		public static void intro()
		{
			System.out.println("Welcome to the Quizzer Program!");
			System.out.println("Press enter to start the game");
			enter = input.nextLine();
		}
		
		public static void quiz1()
		{
			
		}

	}
