/*Given an array of N integers, can you find the sum of its elements?

Input Format

The first line contains an integer,N , denoting the size of the array. 
The second line contains  space-separated integers representing the array's elements.

Output Format

Print the sum of the array's elements as a single integer.

*/
package warmup;

import java.util.Scanner;

public class Simple_Array_Sum {
	
	public static void array_sum(){
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Sum = 0;
        for (int i=0;i<N;i++){
        	int k =scan.nextInt();
            Sum+=k;
        }
        scan.close();
        System.out.println(Sum);

	}
	public static void main(String[] args) {
		array_sum();		
	}

}
