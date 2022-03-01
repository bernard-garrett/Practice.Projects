import java.util.Scanner;

public class DiamondStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k,l,m,r,s;
		Scanner rowObj = new Scanner(System.in);
		System.out.println("How many rows?");
		r = rowObj.nextInt();
		
		for (i = 0; i < r; i++) 
		{
			
			if(i <= r/2 ) 
			{
				
				for (j = r/2; j > i; j--) {
					
					System.out.print(" ");
					
				}
				
				for (k = 0; k <= i*2; k++) {
					
					System.out.print("*");
					
				}
				
			} else 
			{
				for (l = r/2; l < i; l++) {
					
					System.out.print(" ");
					
				}
				
				for (m = 0; m < ((r-i)*2)-1; m++) {
					
					System.out.print("*");

				}
			}
			
			System.out.println();
			
		}
		
	}

}
