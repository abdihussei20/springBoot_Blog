import java.util.*;
public class controlFlow {
	public static void main(String[] Args) {
	//Calling methods created//
		AsciiChars.printNumbers();
		AsciiChars.printLowerCase();
		AsciiChars.printUpperCase();
	//Making scanner to take inputs	
	Scanner userInput = new Scanner(System.in);
	String finalContinue;
	System.out.println("\nPlease enter your name: ");
	//Asking questions and taking in input for questions//
	String userName = userInput.next();
	System.out.printf("Hello, %s \n", userName);
	
	System.out.println("Do you want to continue?");
	String toContinue = userInput.next();
	
	if (toContinue.equalsIgnoreCase("yes") || toContinue.equalsIgnoreCase("y") ) {
		do {
 			System.out.println("Let's continue!"); 
 			System.out.println("Do you have a red car? (yes or no)");
	 		 String redCar = userInput.next();
	 			 
	 		 System.out.println("What is the name of your favorite pet?");
	 		 String favoritePet = userInput.next();
	 		 
	 		 System.out.printf("What is the age of %s? \n", favoritePet);
	 		 int petAge = userInput.nextInt();
	 		 
	 		 System.out.println("What is your lucky number?");
	 		 int luckyNum = userInput.nextInt();
	 		 
	 		 System.out.println("Do you have a favorite quarterback? (yes or no)");
	 		 	String favQB = userInput.next();
	 		 	/*creating int outside of if/else to be able to access later
	 		 	 *As well as setting to 1 if the user says doesn't have favorite
	 		 	 *QB number.
	 		 	 */
	 		 	int favQBNum = 1;
	 		 	
	 		 	if (favQB.equalsIgnoreCase("yes")) {
	 		 		System.out.println("What is your favorite quarterback's jersey number?");
	 		 		favQBNum = userInput.nextInt();
	 		 	} else {
	 		 		System.out.println("Thats okay, next question!");
	 		 	}
	 		 System.out.println("What is the two-digit model year of your car?");
	 		 int carModel = userInput.nextInt();
	 		 
	 		 System.out.println("What is the first name of your favorite actor or actress?");
	 		 String firstName = userInput.next();
	 		 
	 		 System.out.println("Enter a random number between 1 and 50.");
	 		 int randomNum = userInput.nextInt();
	 		 
	 		//random  int generator //
	 		 Random rnd = new Random();
	 		 int magicBall;
	 		 int max = 75;
	 		 //Generate 3 random numbers within the range 0-10//
	 		int rand_1 = rnd.nextInt(10);
	 		int rand_2 = rnd.nextInt(10);
	 		int rand_3 = rnd.nextInt(10);
	 		if (favQBNum != 0 ) {
	 			magicBall =  favQBNum * rand_1;
	 		} else {
	 			magicBall = luckyNum * rand_1;
	 		}
	 		//Making sure magicBall is within range of 75//
	 		if (magicBall > max) {
	 			//used modulo b/c division is just repeated subtraction//
	 			magicBall = magicBall %= max;
	 		} 
	 		
	 		int Num1;
	 		int Num2;
	 		int Num3;
	 		int Num4;
	 		int Num5;
	 		int maximum = 65;
	 		
	 		int min = 1;
	 		Num1 = petAge + carModel;
	 			if (Num1 > maximum) {
	 				Num1 = Num1 - maximum;
	 			} else if  (Num1 < min) {
	 				Num1 = Num1 + maximum;
	 			}
	 		Num2 = randomNum - rand_3;
	 		if (Num2 > maximum) {
				Num2 = Num2 - maximum;
			} else if  (Num2 < min) {
				Num2 = Num2 + maximum;
			}
	 		Num3 = favQBNum + petAge + luckyNum;
	 		if (Num3 > maximum) {
				Num3 = Num3 - maximum;
			} else if  (Num3 < min) {
				Num3 = Num3 + maximum;
			}
	 		Num4 = (int)(firstName.charAt(0));
	 		if (Num4 > maximum) {
				Num4 = Num4 - maximum;
			} else if  (Num4 < min) {
				Num4 = Num4 + maximum;
			}
	 		//charAt() method takes character index as argument and returns its value in string//
	 		Num5 =  (int)(favoritePet.charAt(2));
	 		if (Num5 > maximum) {
				Num5 = Num5 - maximum;
			} else if  (Num5 < min) {
				Num5 = Num5 + maximum;
			}
	 		System.out.printf("\nLottery numbers: %d, %d, %d, %d, %d Magic ball: %d \n",
	 				Num1, Num2, Num3, Num4, Num5, magicBall);
	 		
	 		System.out.printf("\nWould you like to answer questions to generate another set of numbers? (yes or no)");
	 		
	 			finalContinue = userInput.next();
 		
 		}while(finalContinue.equalsIgnoreCase("yes"));
				finalContinue = userInput.next();
			 if (finalContinue.equalsIgnoreCase("no"))	 {
				 System.out.println("\nThank you for playing, Bye"); 
			 }
		}else {
            System.out.println("\nPlease return later to complete the survey");
        }
	 	System.out.println();
	 }
}
	

	
	
	 class AsciiChars 
{
	  public static void printNumbers()
	  {
		// TODO: print valid numeric input
		  System.out.printf("The valid numeric inputs are: "); 
		 for(int i = 0; i < 10; i++) {
			 //Adding empty double quotes to space out printed numbers//
			System.out.print(i + " ");
		 }
	  }

	  public static void printLowerCase()
	  {
	    // TODO: print valid lowercase alphabetic input
		  System.out.printf("\nThe valid lowercase alphabetic inputs are: "); 
			 for(char lowerCase = 'a'; lowerCase < 'z'; lowerCase++) {
				System.out.print(lowerCase + " ");
			 }
	  }

	  public static void printUpperCase()
	  {
		  
	    // TODO: print valid uppercase alphabetic input
		  System.out.printf("\nThe valid uppercase alphabetic inputs are: "); 
			 for(char upperCase = 'A'; upperCase < 'Z'; upperCase++) {
				System.out.print(upperCase + " ");
			 }
	  }
	}

