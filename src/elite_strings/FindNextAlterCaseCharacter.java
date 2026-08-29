package elite_strings;

import java.util.Scanner;

public class FindNextAlterCaseCharacter {
	static String findnextCharacter(String str) {
		String empStr = "";
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(Character.isLetter(ch)){
			if(ch == 'z') {
				empStr += 'A';
			}else if(ch =='Z') {
				empStr += 'a';
			}else if(Character.isUpperCase(ch)) {
				empStr += Character.toLowerCase((char)(ch+1));
			}
			else {
				empStr += Character.toUpperCase((char)(ch+1));
			}
			
		}else {
			empStr+=ch;
		}
		}
		return empStr;
	}
	
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = Sc.nextLine();	
		System.out.println(FindNextAlterCaseCharacter.findnextCharacter(str));
		Sc.close();
	}
}
