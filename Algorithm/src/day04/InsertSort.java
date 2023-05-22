package day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("배열 크기 입력: ");
		int n=sc.nextInt();
		Random ran=new Random();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ran.nextInt(20)+1; //1<= r <20
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("삽입정렬후---------------------");
		insertSort2(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void insertSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int tmp=arr[i];
			int j=i-1;
			for(;j>=0;j--) {
				if(arr[j] > tmp) {
					arr[j+1]=arr[j];
				}else {
					break;
				}
			}
			arr[j+1]=tmp;
			System.out.println(i+": arr :"+Arrays.toString(arr));
		}
	}
	
	private static void insertSort2(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int tmp=arr[i];
			int j=i-1;
			for(;j>=0&& arr[j]>tmp;j--) {
					arr[j+1]=arr[j];
				}
			arr[j+1]=tmp;
			System.out.println(i+": arr :"+Arrays.toString(arr));
		}
	}

}
