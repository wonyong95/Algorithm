package day05;

import java.util.LinkedList;
import java.util.Queue;

//BFS (Breath First Search): 너비우선 탐색. 레벨탑색
//최단거리 구할때 많이 사용
//DFS(스택or재귀함수) BFS(큐)
public class BinaryTreeBFS {

	class Node{
		int data;
		Node left, right;//왼쪽 자식. 오른쪽 자식 노드를 참조할 변수
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeBFS app=new BinaryTreeBFS();
		Node root=app.makeTree();
		app.makeBFS(root);
	}

	private void makeBFS(Node root) {
		Queue<Node> q=new LinkedList<>();
		//삽입 : offer(), add()
		//삭제 : poll(), remove()
		//검삭 : peek()
		q.offer(root);//루트노드저장
		int level=0;
		while(!q.isEmpty()) {
			System.out.println("Level "+level+": ");
			int size=q.size();
			for(int i=0;i<size;i++) {
				Node item=q.poll();
				System.out.println(item.data+"->");
				if(item.left!=null) q.offer(item.left);//왼쪽 자식노드를 큐에추가
				if(item.right!=null) q.offer(item.right);//오른쪽 자식 노드 추가
			}
			level++;
			System.out.println();
		}
	}

	private Node makeTree() {
		Node root=new Node(1);
		
		root.left=new Node(2);
		root.right=new Node(3);
		
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		return root;
	}

}
