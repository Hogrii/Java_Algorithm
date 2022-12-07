import java.util.LinkedList;
import java.util.Queue;

public class Ex07 {
	Node root;
	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		// offer 메소드는 값을 추가할 때 사용
		// Queue가 가득차서 더이상 추가할 수 없는 경우 false를 반환하고 요소가 추가되면 true를 반환한다.
		int L = 0;
		while(!Q.isEmpty()) { // Queue에 값이 있으면 참
			int len = Q.size();
			System.out.print(L + " : ");
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data + " ");
				if(cur.lt != null) Q.offer(cur.lt); // 왼쪽 자식이 있으면 Queue에 입력
				if(cur.rt != null) Q.offer(cur.rt); // 오른쪽 자식이 있으면 Queue에 입력
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// 이진트리 순회(넓이우선탐색 ㅣ 레벨탐색)
		//    1    -> 0 레벨
		//  2   3  -> 1 레벨
		// 4 5 6 7 -> 2 레벨
		// 레벨탐색 : 1 2 3 4 5 6 7
		
		Ex07 tree = new Ex07();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root);
	}
}
