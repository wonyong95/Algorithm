package day05;

import java.util.Scanner;

public class BinaryTreeTest {

	
	static void menu() {
		System.out.println("------------------------------------");
		System.out.println("1. 삽입 2. 삭제 3. 검색 4. 출력 9. 종료");
		System.out.println("------------------------------------");
		System.out.println("메뉴 번호를 선택하세요=>");
		System.out.println("------------------------------------");
	}//-------------------------------
	
	public static void main(String[] args) {
		int num=0;
		Scanner sc=new Scanner(System.in);
		BinaryTree<Integer,User> tree=new BinaryTree<>();
		do {
			menu();
			num=sc.nextInt();
			switch(num) {
			case 1:
				User user=new User();
				user.input();
				tree.add(user.getNo(), user);
				break;
			case 2://삭제
				System.out.println("삭제할 회원번호 입력: ");
				int no=sc.nextInt();
				boolean isDel=tree.remove(no);
				if(isDel) {
					System.out.println(no+"번 회원정보를 삭제했습니다");
				}else {
					System.out.println("해당 회원 데이터는 없습니다");
				}
				break;
			case 3://검색
				System.out.println("검색할 회원번호 입력: ");
				no=sc.nextInt();
				User findUser=tree.search(no);
				if(findUser==null) {
					System.out.println("존재하지 않는 회원입니다");
				}else {
					System.out.println(findUser);
				}
				break;
			case 4:
				tree.print();
				break;
			}
		}while(num!=9);
		System.out.println("Bye");
	}

}
