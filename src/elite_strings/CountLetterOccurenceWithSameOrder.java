package elite_strings;
import java.util.Scanner;
public class CountLetterOccurenceWithSameOrder {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = in.nextLine();
		int[] count = new int[26];
	
		for(int i=0;i<str.length();i++){
		    int val = str.charAt(i) - 97;
		    count[val]++;
		}
		System.out.println();

		for(int i=0;i<str.length();i++){
		    int val = str.charAt(i) - 97;    //for example  a means we want to access 0th index so minus by 97 , for example a mens 97 , so97 -97 = 0 , so we access 0
		    if(count[val]>0){   // for first time it print and below for loop ,if the count more than 1 means again it changed to count 0 , so next time it is not print
		        System.out.println(str.charAt(i)+" "+count[val]);
		    }
		    if(count[val]>1){    
		        count[val]=0;
		    }
		}
	}
}
