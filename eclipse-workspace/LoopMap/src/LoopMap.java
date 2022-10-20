
import java.util.*;
public class LoopMap {
	public static void main (String[] Args) {
	Scanner userInput = new Scanner(System.in);
		//Creates an ArrayList of only integers that contains 5 integers//
		ArrayList<Integer> userNumber = new ArrayList<Integer>(5);
		
		
		//Iterates through user input, up to 5 numbers 
		for (int i=0; i < 5; i++) {
			//prints a formated string with our int varaible and prints each on a new line.//
			//Ask about i + 1???
			System.out.printf("Pick a number %d \n", i+1);
			//Takes ArrayList(userNumber) adds the integer input from the user on a new line)
			userNumber.add(Integer.parseInt(userInput.nextLine()));
		}
		System.out.println(userNumber);
		int sum= 0;
		//Set product to 1 because setting to zero will return 0 after multiplying array elements
		int product = 1;
		int min = userNumber.get(0);
		int max = userNumber.get(0);
		for (int i=0; i < userNumber.size(); i++) {
			//.size() returns number of elements in ArrayList//
			sum += userNumber.get(i) ;
			product *= userNumber.get(i);	
		if (userNumber.get(i) > max) {
			max = userNumber.get(i);
		} if (userNumber.get(i) < min ||min == 0) {
			min = userNumber.get(i);
		}
		}
		System.out.printf("The sum is %d. \n", sum);
		System.out.printf("The product is %d. \n",product);
		System.out.printf("The largest number is %d. \n",max);
		System.out.printf("The smallest number is %d. \n",min); 
		
		HashMap<String, String> car = new HashMap<>();
			
		car.put("Honda", "Civic");
		
			System.out.println("What car model are you looking for?");
		String userCar = userInput.nextLine();
		         
	if(car.containsKey(userCar)) {
		System.out.println(car.get(userCar) +"s are right this way");
	} else {
		System.out.println("We do not have that car.");
	}
	                     	
	    }
	
	        }
	 
