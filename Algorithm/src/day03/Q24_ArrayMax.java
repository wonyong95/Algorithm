package day03;

import java.util.Scanner;

public class Q24_ArrayMax {
	
	public static int solution(int n, int[][] arr) {
		int max=-9999;
		int row_sum=0;//행들의 합
		int col_sum=0;//열들의 합
		for(int i=0;i<n;i++) {
			row_sum=0;
			col_sum=0;
			
			for(int j=0;j<n;j++) {
				//System.out.print(arr[j][i]+", ");
				row_sum+=arr[i][j];
				col_sum+=arr[j][i];
			}
			//System.out.println("의 합: "+col_sum);
			if(row_sum>max) {
				max=row_sum;
			}
			if(col_sum>max) {
				max=col_sum;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("배열 크기 입력: ");
		int n=sc.nextInt();
		System.out.printf("%d행 %d열 배열에 저장할 값 입력: %n" ,n,n);
		
		int [][] arr=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int max=solution(n, arr);
		System.out.println("최대합계: "+max);
	}
}
