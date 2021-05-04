import java.util.*;
import java.lang.*;
import java.io.*;

public class Myclass {

	public static void main(String[] args) {
		
		//System.out.println("hello world");
       int a[][]=new int[3][4];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the values to be added");
			for (int i = 0; i < 3; ++i) {
             for(int j = 0; j < 3; ++j) {
            	 a[i][j]=s.nextInt();
                
                
            }
            System.out.println(" ");
        }
			
			for (int i = 0; i < 3; ++i) {
	            for(int j = 0; j < 3; ++j) {
	            	if(a[i][j]==a[i][j+1]) {
	                	System.out.println("this number is already there please enter a valid number ");
	                }
	            	
	            	System.out.print(" "+a[i][j]);
	            }
	            System.out.println(" ");
	        }
	
	}
}
