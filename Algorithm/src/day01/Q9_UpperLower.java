package day01;

import java.util.Scanner;

public class Q9_UpperLower {

	public String solution(String str) {

		char[] ch=str.toCharArray();
		StringBuffer buf=new StringBuffer();
		for(char c: ch) {
			if(Character.isUpperCase(c)) {
				buf.append(Character.toLowerCase(c));
			}else {
				buf.append(Character.toUpperCase(c));
			}
		}
		String answer=buf.toString();
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Q9_UpperLower app=new Q9_UpperLower();
		System.out.println("알파벳 문자열을 입력하세요");
		String str=sc.next();
		String result=app.solution(str);
		
		System.out.println(str);
		System.out.println(result);
	}

}
