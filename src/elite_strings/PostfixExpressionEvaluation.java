package elite_strings;

import java.util.Scanner;

public class PostfixExpressionEvaluation {

    	public static void main(String[] args) {
    	Scanner Sc = new Scanner(System.in);
    	System.out.println("Enter String :");
		String str=Sc.nextLine();
		int out= str.charAt(0) -'0';
	    int val = str.length()/2;  // for iterate operators
	    for(int i=val + 1;i<str.length();i++){
                int num = str.charAt(i - val) - '0';  //for iterate number by minus the length/2 from the current index to move the pointer leftside
                switch (str.charAt(i)) {
                    case '-' -> out -= num;
                    case '+' -> out += num;
                    case '*' -> out *= num;
                    case '/' -> out /= num;
                    case '%' -> out %= num;
                    default -> System.out.println("Invalid operator");
            }
        }
        System.out.println(out);
    }
}
