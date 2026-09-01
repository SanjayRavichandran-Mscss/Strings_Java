package elite_strings;
import java.util.Scanner;

public class SubstringLooping {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String 1:");
		String str = in.nextLine();
		System.out.println("Enter String 2:");
		String str2 = in.nextLine();
		for(int k=0;k<str.length();k++){
		    
    		for(int i=k;i<str.length();i++){
    		    String emp = "";
    		    for(int j=k;j<=i;j++){
    		        emp+=str.charAt(j);
    		    }
    		    if(emp.equals(str2)){
    		        System.out.println("Its a SubString");
    		    }
    		}

		}

	}
}
