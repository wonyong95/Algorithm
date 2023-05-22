package day05;

import java.util.Scanner;
import java.util.Stack;
/*
6
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(
* */
public class Q27_Bracket {

	static String solution(String str) {
		String result="";//no or yes
		char[] ch=str.toCharArray();
		
		Stack<Character> sk=new Stack<>();
		//(()()) ==>yes
		//(()()  ==>no
		//(()))  ==>no
		for(char c:ch) {
			if(c=='(') {//여는 괄호일때 push
				sk.push(c);
			}else if(c==')') {//닫는 괄호일때 pop. 이때 꺼낼때 짝이 맞는 여는 괄호가 있는지 체크, 없다면No
				if(sk.isEmpty()) {
					result="No";
					return result;
				}
				sk.pop();
			}
		}
		result=(sk.isEmpty())?"Yes":"No";
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("몇개의 문자열을 입력하겠습니까?");
		int n=sc.nextInt();
		System.out.println("소괄호를 입력하세요: ");
		String[] arr=new String[n];
		for(int i=0;i<n;i++) {
		String str=sc.next();
		arr[i]=str;
		}
		for(String str: arr) {
			System.out.println(solution(str));
		}
	}

}
