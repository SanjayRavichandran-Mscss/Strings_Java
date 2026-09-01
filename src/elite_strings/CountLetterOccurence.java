package elite_strings;
import java.util.Scanner;
public class CountLetterOccurence {
    public static void main(String[] args) {
    	Scanner Sc = new Scanner(System.in);
    	System.out.println("Enter String :");
        String str = Sc.nextLine();

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char)(i + 'a') + "-" + count[i]);
            }
        }
    }
}














//
//
//import java.util.Scanner;
//
//public class Main
//{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();//abcd
//		int[] count = new int[26];
//		for(int i=0;i<26;i++){
//		    System.out.print(count[i]+" ");
//		}
//		for(int i=0;i<str.length();i++){
//		    int val = str.charAt(i) - 97;
//		    count[val]++;
//		}
//		System.out.println();
//		for(int i=0;i<26;i++){
//		    if(count[i]>0){
//		    System.out.println((char)(i+97)+"-"+count[i]);
//		    }
//		}
//	}
//}
