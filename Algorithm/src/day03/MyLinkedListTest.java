package day03;

import day02.Emp;

public class MyLinkedListTest {

	public static void main(String[] args) {
		
		test2();
	}
	
	public static void test2() {
		//Emp객체 3개 생성해서 MyLinkedList에 저장
		//모두 출력해보기
		MyLinkedList<Emp> list=new MyLinkedList<>();
		Emp e1=new Emp("김치우",180);
		Emp e2=new Emp("숟가락",177);
		Emp e3=new Emp("도영우",190);
		list.addFirst(e1);
		list.printCurrentNode();
		list.addLast(e2);
		list.addLast(e3);
		list.print();
		list.printCurrentNode();
		
		//list.remove(list.currentN);
		//list.print();
		
		//list.removeFirst();
		//list.print();
		
		//[1] 사원검색
		//키로 검색하기 search()활용
		
		Emp findEmp=list.search(new Emp("", 177), Emp.Height_Order);
		System.out.println((findEmp==null)?"해당 키를 가진 사원은없어요":findEmp);
		System.out.println("이름으로 검색---------------");
		//[2] 이름으로 사원검색하기 ==> Emp에 Name_Order Comparator구성해서..
		findEmp=list.search(new Emp("김치우",0), Emp.Name_Order);
		System.out.println((findEmp==null)?"해당 이름의 사원은 없어요":findEmp);
		
		list.printCurrentNode();
		
		while(list.next()) {
			list.printCurrentNode();
		}
	}
	
	public static void test1()  {
		//String유형 A,B,C,D 를 MyLinkedList에 저장하세요
		//전체 출력해보기
		MyLinkedList<String> list=new MyLinkedList<>();
		list.addLast("A");
		list.addLast("B");
		list.printCurrentNode();
		list.addLast("C");
		list.addFirst("D");
		list.printCurrentNode();
		list.print();
		
		list.removeFirst();
		list.printCurrentNode();
		list.print();
		
		list.addLast("D");
		list.print();
		
		//list.remove(new MyLinkedList.Node<>("C",null)); // ->주소값이 달라서 삭제가안됨
		list.remove("C");
		list.print();
		
		list.clear();
		list.printCurrentNode();
		list.print();
	}

}
