import java.util.Scanner;

public class HollowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k,l,r,s;
		Scanner rowObj = new Scanner(System.in);
		System.out.println("How many rows in your pyramid?");
		r = rowObj.nextInt();
		
		for (i=0; i<r; i++) {
			
			for (s=r; s>i+1; s--) {
				
				System.out.print(" ");
				
			}
			
			for (j=0; j<=i*2; j++) {
				
				if (j == 0 || j>=i*2 || i==r-1) {
					
					System.out.print("*");

				} else {
					
					System.out.print(" ");

				} 
				
			}
			
			System.out.println();
		}
	}

}
