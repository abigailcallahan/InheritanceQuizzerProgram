import java.util.Scanner;


public class InheritanceQuizzerProgram
	{

		static Scanner input = new Scanner(System.in);
		static String enter;
		static int answer1;
		static int counter = 0;
		
		public static void main(String[] args)
			{
				//Food x = new Food( );
				//Food x = new Pasta( );
				//Pasta x = new Food( );
				//Pasta x = new Pasta( );
				
				intro();
				
				quiz1();
				quiz2();
				quiz3();
				quiz4();
				quiz5();
				quiz6();
				quiz7();
				quiz8();
				quiz9();
				quiz10();
				quiz11();
				quiz12();

			}
		
		public static void intro()
		{
			System.out.println("Welcome to the Quizzer Program!");
			System.out.println("You have a sheet of paper with the code next to you. Use this to complete the quiz. Good luck!");
			System.out.println("Press enter to start the game");
			enter = input.nextLine();
		}
		
		public static void quiz1()
		{
			System.out.println("1) If the Code runs...\n");
			System.out.println("Food x = new Food()");
			System.out.println("x.eat()\n");
			
			System.out.println("What will the result be?");
			System.out.println("1) Yum This food is so good");
			System.out.println("2) The pasta tastes so good");
			System.out.println("3) These groceries are so expensive");
			System.out.println("4) It takes about 15 minutes to cook pasta");
			System.out.println("5) error");
			
			answer1 = input.nextInt();
			if(answer1 == 1)
				{
					System.out.println("That is correct! +1 point\n\n");
					counter++;
				}
			else
				{
					System.out.println("That is incorrect! -1 point");
					System.out.println("The correct answer is 1\n\n");
				}
			
			
		}
		
		public static void quiz2()
		{
			System.out.println("2) If the Code runs...\n");
			System.out.println("Food x = new Food()");
			System.out.println("x.buyFood()\n");
			
			System.out.println("What will the result be?");
			System.out.println("1) Yum This food is so good");
			System.out.println("2) The pasta tastes so good");
			System.out.println("3) These groceries are so expensive");
			System.out.println("4) It takes about 15 minutes to cook pasta");
			System.out.println("5) error");
			
			answer1 = input.nextInt();
			if(answer1 == 3)
				{
					System.out.println("That is correct! +1 point\n\n");
					counter++;
				}
			else
				{
					System.out.println("That is incorrect! -1 point");
					System.out.println("The correct answer is 3.\n\n");
				}
		
			
		}
		
		public static void quiz3()
			{
				System.out.println("3) If the Code runs...\n");
				System.out.println("Pasta x = new Pasta()");
				System.out.println("x.eat()\n");
				
				System.out.println("What will the result be?");
				System.out.println("1) Yum This food is so good");
				System.out.println("2) The pasta tastes so good");
				System.out.println("3) These groceries are so expensive");
				System.out.println("4) It takes about 15 minutes to cook pasta");
				System.out.println("5) error");
				
				answer1 = input.nextInt();
				if(answer1 == 2)
					{
						System.out.println("That is correct! +1 point\n\n");
						counter++;
					}
				else
					{
						System.out.println("That is incorrect! -1 point");
						System.out.println("The correct answer is 2\n\n");
					}
			}
		
		public static void quiz4()
			{
				System.out.println("4) If the Code runs...\n");
				System.out.println("Food x = new Pasta()");
				System.out.println("x.cook()\n");
				
				System.out.println("What will the result be?");
				System.out.println("1) Yum This food is so good");
				System.out.println("2) The pasta tastes so good");
				System.out.println("3) These groceries are so expensive");
				System.out.println("4) It takes about 15 minutes to cook pasta");
				System.out.println("5) error");
				
				answer1 = input.nextInt();
				if(answer1 == 5)
					{
						System.out.println("That is correct! +1 point\n\n");
						counter++;
					}
				else
					{
						System.out.println("That is incorrect! -1 point");
						System.out.println("The correct answer is 5.\n\n");
					}
			}
		
		public static void quiz5()
			{
				System.out.println("5) If the Code runs...\n");
				System.out.println("Pasta x = new Food()");
				System.out.println("x.buyFood()\n");
				
				System.out.println("What will the result be?");
				System.out.println("1) Yum This food is so good");
				System.out.println("2) The pasta tastes so good");
				System.out.println("3) These groceries are so expensive");
				System.out.println("4) It takes about 15 minutes to cook pasta");
				System.out.println("5) error");
				
				answer1 = input.nextInt();
				if(answer1 == 5)
					{
						System.out.println("That is correct! +1 point\n\n");
						counter++;
					}
				else
					{
						System.out.println("That is incorrect! -1 point");
						System.out.println("The correct answer is 5.\n\n");
					}
			}
		
		public static void quiz6()
			{
				System.out.println("6) If the Code runs...\n");
				System.out.println("Food x = new Pasta()");
				System.out.println("x.eat()\n");
				
				System.out.println("What will the result be?");
				System.out.println("1) Yum This food is so good");
				System.out.println("2) The pasta tastes so good");
				System.out.println("3) These groceries are so expensive");
				System.out.println("4) It takes about 15 minutes to cook pasta");
				System.out.println("5) error");
				
				answer1 = input.nextInt();
				if(answer1 == 2)
					{
						System.out.println("That is correct! +1 point\n\n");
						counter++;
					}
				else
					{
						System.out.println("That is incorrect! -1 point");
						System.out.println("The correct answer is 2.\n\n");
					}
			}
		
		public static void quiz7()
			{
				System.out.println("7) If the Code runs...\n");
				System.out.println("Food x = new Food()");
				System.out.println("x.cook()\n");
				
				System.out.println("What will the result be?");
				System.out.println("1) Yum This food is so good");
				System.out.println("2) The pasta tastes so good");
				System.out.println("3) These groceries are so expensive");
				System.out.println("4) It takes about 15 minutes to cook pasta");
				System.out.println("5) error");
				
				answer1 = input.nextInt();
				if(answer1 == 5)
					{
						System.out.println("That is correct! +1 point\n\n");
						counter++;
					}
				else
					{
						System.out.println("That is incorrect! -1 point");
						System.out.println("The correct answer is 5.\n\n");
					}
			}
		
		public static void quiz8()
			{
				System.out.println("8) If the Code runs...\n");
				System.out.println("Pasta x = new Food()");
				System.out.println("x.eat()\n");
				                                                                            
				System.out.println("What will the result be?");
				System.out.println("1) Yum This food is so good");
				System.out.println("2) The pasta tastes so good");
				System.out.println("3) These groceries are so expensive");
				System.out.println("4) It takes about 15 minutes to cook pasta");
				System.out.println("5) error");
				
				answer1 = input.nextInt();
				if(answer1 == 5)
					{
						System.out.println("That is correct! +1 point\n\n");
						counter++;
					}
				else
					{
						System.out.println("That is incorrect! -1 point");
						System.out.println("The correct answer is 5.\n\n");
					}
			}
		
		public static void quiz9()
			{
				
			}
		
		public static void quiz10()
			{
				
			}
		
		public static void quiz11()
			{
				
			}
		
		public static void quiz12()
			{
				
			}
		
		public static void wrapUp()
		{
			
		}

	}
