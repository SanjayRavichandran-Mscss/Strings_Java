package elite_strings;
import java.util.Scanner;
public class SlidingWindowIteration {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String 1 :");
	String str1 = Sc.nextLine();
	
	System.out.println("Enter String 2 :");
	String str2 = Sc.nextLine();
	int j = str2.length();
	String sub="";
	for(int k =0;k<=str1.length()-str2.length();k++) {
		sub="";
	for(int i=k;i<=(j-1)+k;i++) {		
		System.out.println(str1.charAt(i)+" ");	
		sub += str1.charAt(i);
	}
	
	
	}
	if(sub.equals(str2)) {
		System.out.println("is sub string");
		 
	}
	else {
		System.out.println("is not a sub string");

	}
	Sc.close();

}





//Optimized code :

//public static void main(String[] args) {
//	String str ="Helloworld";
//	String s ="world";
//
//	boolean flag=false;
//	 for (int i = 0; i <= str.length() - s.length(); i++) {
//            String sub = "";
//            for (int j = i; j < i + s.length(); j++) {
//                sub = sub + str.charAt(j);
//            }
//            if(sub.equals(s)) {
//            	flag=true;
//				break;
//            }
//	 }	System.out.println(flag ? "Match" : "Not");
//}
}
