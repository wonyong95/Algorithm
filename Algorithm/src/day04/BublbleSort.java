package day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BublbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("배열 크기 입력: ");
		int n=sc.nextInt();
		Random ran=new Random();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			//1<=r <20
			arr[i]=ran.nextInt(20)+1;
		}
		System.out.println(Arrays.toString(arr));
		bubble2(arr);
		System.out.println("-------버블 정렬후-----------");
		System.out.println(Arrays.toString(arr));
	}
	//앞에서부터 버블정렬하기 => 1회 반복돌고 나면 가장 큰 수가 오른쪽에 위치함
	private static void bubble1(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {// arr.length-1-i
				if(arr[j] > arr[j+1]) {
					/*
					 * int tmp=arr[j]; arr[j]=arr[j+1]; arr[j+1]=tmp;
					 */
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	public static void swap(int[] arr, int m, int n) {
		int tmp=arr[m];
		arr[m]=arr[n];
		arr[n]=tmp;
		
	}
	//뒤에서부터 버블정렬하기 => 1회 반복돌고 나면 가장적은 수가 왼쪽에 위치
	public static void bubble2(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int cnt=0;
			for(int j=arr.length-1;j>i;j--) {
				if(arr[j] < arr[j-1]) {
					swap(arr,j,j-1);
					cnt++;//교환 횟수를 세보자 swap이일어나면 1씩증가
				}
				
			}
			if(cnt==0) break; // cnt가 0이라면 이미정렬을 마쳤다는 의미
			System.out.println(i+": "+Arrays.toString(arr));		
		}
		
	}

}
