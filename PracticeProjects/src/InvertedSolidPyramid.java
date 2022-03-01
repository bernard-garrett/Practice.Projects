import java.util.Scanner;

public class InvertedSolidPyramid {

	public static void main(String[] args) {
		
		int i,j,k,l,m,r;
		Scanner rowObj = new Scanner(System.in);
		System.out.println("How many rows?");
		r = rowObj.nextInt();
		
		for (i = r; i > 0; i--) {
			
			for (j = r; j > i; j--) {
				
				System.out.print(" ");
				
			}
			
			for (k = 0; k < i*2-1; k++) {
				
				/*if (i == r || k < i*2-1) {
					System.out.print("*");

				} */
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
