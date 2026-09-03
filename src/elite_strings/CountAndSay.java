package elite_strings;
import java.util.Scanner;
public class CountAndSay {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter String :");
	int n = in.nextInt();//3
	if(n==1){
	    System.out.println("1");
	}
	else{
	    String str = "1";
	    
	    String emt="";
	    for(int k=1;k<n;k++){
	    	emt ="";
	        System.out.println(str);
	        
	        for(int i=0;i<str.length();){
	        	int j;
	            int count = 1;
	            for(j=i+1;j<str.length();j++){
	                if(str.charAt(i)==str.charAt(j)){
	                    count++;
	                }
	                else{
	                    break;
	                }
	            }
	            emt+=count;
	           
	            emt+=str.charAt(i); 
	            i=j;
                
	        }
	        str=emt;
	    }
	    System.out.println(str);
	}
}
}
