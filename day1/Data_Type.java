/*Task 
Complete the code in the editor below. The variables , , and  are already declared and initialized for you. You must:

Declare  variables: one of type int, one of type double, and one of type String.
Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
Use the  operator to perform the following operations: 
Print the sum of  plus your int variable on a new line.
Print the sum of  plus your double variable to a scale of one decimal place on a new line.
Concatenate  with the string you read as input and print the result on a new line.
*/

package day1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Data_Type {
	final static int i = 4;
	final static double d = 4.0;
	final static String s = "HackerRank ";
	public static void data_type(){
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.#");
		int i1 = scan.nextInt();
		double d1 = scan.nextDouble();
		String s1 = scan.next();
		String s2 = scan.nextLine();
		scan.close();
		System.out.println(i+i1);
		System.out.printf("%.1f", d+d1);
		System.out.println("\n"+s+s1+s2);
		
	}
	public static void main(String[] args) {
		data_type();

	}

}
