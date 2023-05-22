package day03;

import day02.Member;

public class MyQueueTest {

	public static void main(String[] args) {
		MyQueue q=new MyQueue(5);
		q.enque("Hello");
		q.enque("Hi");
		q.enque("Good");
		System.out.println(q.size());
		System.out.println(q.peek());
		q.enque("안녕");
		q.enque("방가");
		if(q.isEmpty())
			q.enque("Bye");
		
		System.out.println(q.deque());
		System.out.println("q.size(): "+q.size());
		System.out.println(q.peek());
		q.clear();//front,end,cnt=>0
		System.out.println(q.size());
		//q.deque();
		if(!q.isEmpty())
			q.deque();
		
		//Member객체 3개이상 생성해서 큐에 저장한뒤 저장값출력해보기
		Member m1=new Member("고길동",40,180);
		Member m2=new Member("조길동",37,175);
		Member m3=new Member("김길동",20,177);
		
		q.enque(m1);
		q.enque(m2);
		q.enque(m3);
		
		q.printQueue();
		
		//고길동 검색해보기
		int i=q.indexOf(new Member("고길동",40,180));
		System.out.println("i: "+i);
		q.deque();
		q.deque();
		System.out.println("--deque후");
		i=q.indexOf(new Member("고길동",40,180));
		System.out.println("i: "+i);
		
		q.printQueue();
	}

}
