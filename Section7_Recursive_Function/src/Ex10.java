import java.util.LinkedList;
import java.util.Queue;

public class Ex10 {
	Node root;
	public int BFS(Node root) { // L : level
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty()) { // 비어있으면 거짓, 비어있지 않으면 참
			int len = Q.size();
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();
				if(cur.lt == null && cur.rt == null) return L;
				if(cur.lt!=null) Q.offer(cur.lt);
				if(cur.rt!=null) Q.offer(cur.rt);
			}
			L++;
		}
		return 0;		
	}
	
	public static void main(String[] args) {
		// Tree 말단노드까지의 가장 짧은 경로(BFS)
		//    1   : level 0
		//  2   3 : level 1
		// 4 5    : level 2
		
		Ex10 tree = new Ex10();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(tree.root));
	}
}