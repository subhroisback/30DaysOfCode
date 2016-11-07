package sock_merchant;

import java.util.Scanner;
import java.util.Arrays;

public class SockMerchant {
	
	public static void sock(){
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i=0; i < n; i++){
            arr[i] = scan.nextInt();
        }        
        scan.close();
        System.out.println(Arrays.toString(arr));
        for (int j=0; j<arr.length; j++){
        	for (int k = j+1; k<arr.length; k++){
        		if(arr[j]==arr[k]){
        			count++;
        		}
        	}
        }
        System.out.println(count);
		
	}

	public static void main(String[] args) {
		sock();
		

	}

}
