import java.util.*;

public class StarStairs {
	
	public static void main(String[] args) {
		int i,j,k,l,r;
		Scanner rowObj = new Scanner(System.in);
		System.out.println("How many stairs in your staircase?");
		r = rowObj.nextInt();
		
		for (i=0; i<r; i++) {
			
			for (j=0; j<i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
	}

}
