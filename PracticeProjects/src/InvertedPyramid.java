import java.io.IOException;
import java.util.*;

//This program prints an inverted hallow pyramid from a user's chosen amount of rows
public class InvertedPyramid {

	 public static void main(String[] args) throws IOException {
		 int t = 0; //test variable
		 int rows,i,j,k,s; //variables for loops
		 //System.out.println(t); testing console
		 
		 Scanner rowObj = new Scanner(System.in);
		 System.out.print("Number of rows?");

  		 rows = rowObj.nextInt();
		 
		 for (i=rows; i>0; i--) { //loop for rows 
			 
			 for (s=rows; s>i; s--) { //loop for spaces
				 
				 System.out.print(" ");
				 
			 }
			 
			 for (j=0; j<i*2-1; j++) {
				 
				 if (i==rows) { //First row of stars 
					 
					 System.out.print("*");
					 
				 } else if (j==0 || j==i*2-2) {
						 
						 System.out.print("*");
						 
				 	} else {
						 
						 System.out.print(" ");
						 
					}
			 }
			 
			 System.out.println();
			 
		}
			 
	} 
		 
}
	 

