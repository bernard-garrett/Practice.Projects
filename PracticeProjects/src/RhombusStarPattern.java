import java.util.*;

public class RhombusStarPattern {
	
	public static void main(String[] args) {
		
		int r, i, j, k, l, s;
		Scanner rowObj = new Scanner(System.in);
		System.out.println("How many rows in your Rhombus");
		
		r = rowObj.nextInt();
		
		for (i = r; i > 0; i--) {
			
			for (s = r; s > i; s--) {
				
				System.out.print(" ");
				
			}
			
			for (j = 0; j < r; j++) {
				
				if (i == 0) {
					
					System.out.print("*");
					
				}
				
				System.out.print("*");
				
			}
			
			System.out.println();

		}
	}

}
