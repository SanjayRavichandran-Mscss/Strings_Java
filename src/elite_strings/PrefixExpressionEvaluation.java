package elite_strings;

import java.util.Scanner;

public class PrefixExpressionEvaluation {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = Sc.nextLine();

        int out = str.charAt(str.length() - 1) - '0';
        int val = str.length() / 2;  // for iterate operators

        for (int i = str.length() - val - 2; i >= 0; i--) {
            int num = str.charAt(i + val + 1) - '0';

            switch (str.charAt(i)) {
                case '-' -> out = num - out;
                case '+' -> out += num;
                case '*' -> out *= num;
                case '/' -> out = num / out;
                case '%' -> out = num % out;
                default -> System.out.println("Invalid operator");
            }
        }

        System.out.println(out);
    }
}