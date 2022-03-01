import java.util.*;

public class RectangleStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r, c, x, y;
		Scanner rowObj = new Scanner(System.in);
		System.out.println("How many rows would you like?"); //Prompts user for row count 
		Scanner columnObj = new Scanner(System.in);
		System.out.println("How many columns would you like?");
		
		r = rowObj.nextInt(); //Saves number of rows given by the user  
		c = columnObj.nextInt();
		
		for(x = 0; x < r; x++) { //Main for loop for rows
			
			for (y = 0; y < c; y++) { //Nested for loop for printing stars
				
					System.out.print("*");
				
			}
			
			System.out.println(); //Moves down a row
			
		}
		
	}

}
