package day04;

import java.util.Scanner;

public class BinaryNum {
	
	public static void solution(int num) {
		if(num<1) return;
		solution(num/2);
		System.out.print(num%2);

	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요");
		int num=sc.nextInt();
		
		solution(num);
	}

}
