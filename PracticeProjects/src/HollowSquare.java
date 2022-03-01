import java.util.*;

public class HollowSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,i,j,k;
		Scanner rowObj = new Scanner(System.in);
		System.out.println("How many rows would you like?");
		
		r = rowObj.nextInt();
		for (i = 0; i < r; i++) {
			
			for (j = 0; j < r; j++) {

				if (i == 0 || i == r-1 || j == 0 || j == r-1) {
					
					System.out.print("*");

				} else {

					System.out.print(" ");
					
				}
			}
			
			System.out.println();
			
		}
	}

}
