import java.io.IOException;
import java.util.*;

public class SquareStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r, x, y;
		Scanner rowObj = new Scanner(System.in);
		System.out.println("How many rows would you like?"); //Prompts user for row count 
		
		r = rowObj.nextInt(); //Saves number of rows given by the user  
		
		for(x = 0; x < r; x++) { //Main for loop for rows
			
			for (y = 0; y < r; y++) { //Nested for loop for printing stars
				
					System.out.print("*");
				
			}
			
			System.out.println(); //Moves down a row
			
		}
	}

}
