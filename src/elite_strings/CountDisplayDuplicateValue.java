package elite_strings;

import java.util.Scanner;

public class CountDisplayDuplicateValue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = in.nextLine();
		int[] count = new int[26];
	
		for(int i=0;i<str.length();i++){
		    int val = str.charAt(i);
		    if(val<97) {
		    	val-='A';  //'A'= 65
		    }else {
		    	val-='a';   // 'a' = 97
		    }

		    count[val]++;
		}
		for(int i=0;i<str.length();i++) {
			int val = str.charAt(i);
			

		    if(val < 97) {
		        val -= 'A';
		    } else {
		        val -= 'a';
		    }
			if(count[val]>1) {   // for duplicate elements print and count , just change the value 0 to 1 
				System.out.println(str.charAt(i) + " "+ count[val]);
				count[val]=0;
			}
		}

	   
	}
}
