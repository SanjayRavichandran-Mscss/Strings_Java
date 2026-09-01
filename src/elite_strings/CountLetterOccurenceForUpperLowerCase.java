package elite_strings;

import java.util.Scanner;

public class CountLetterOccurenceForUpperLowerCase {
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
			if(count[val]>0) {
				System.out.println(str.charAt(i) + " "+ count[val]);
				count[val]=0;
			}
		}

	   
	}
}
