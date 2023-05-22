package day02;

public class Q14_PrimeNum {

	public static void main(String[] args) {
		int cnt=0;
		for(int num=2;num<=1000;num++) {
			int i;
			for(i=2;i<=num;i++) {
				cnt++;
				if(num%i==0) {
					break;
				}
			}
			if(i==num)
				System.out.println(num);
		}
		System.out.println("수행횟수: "+cnt);
	}

}
