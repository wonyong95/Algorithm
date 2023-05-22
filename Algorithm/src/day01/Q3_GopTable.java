package day01;

public class Q3_GopTable {
	
	public static  void solution() {
		for(int i=1;i<=9;i++) {
			for(int k=1;k<=9;k++) {
				System.out.print(k+"*"+i+"="+i*k+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		solution();
	}

}
