import java.util.Scanner;

public class HalfDiamondStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,l,m,r;
		Scanner rowObj = new Scanner(System.in);
		System.out.println("How many karots would you prefer?");
		r = rowObj.nextInt();
		
		for (i = 0; i < r; i++) 
		{
			
			if(i <= r/2 ) 
			{
				
				for (j = r/2; j > i; j--) {
					
					System.out.print(" ");
					
				}
				
				for (k = 0; k <= i; k++) {
					
					System.out.print("*");
					
				}
				
			} else 
			{
				for (l = r/2; l < i; l++) {
					
					System.out.print(" ");
					
				}
				
				for (m = i; m < r; m++) {
					
					System.out.print("*");

				}
			}
			
			System.out.println();
			
		}
		
	}

}
