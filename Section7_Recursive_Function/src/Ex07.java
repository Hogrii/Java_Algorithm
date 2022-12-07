import java.util.LinkedList;
import java.util.Queue;

public class Ex07 {
	Node root;
	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		// offer �޼ҵ�� ���� �߰��� �� ���
		// Queue�� �������� ���̻� �߰��� �� ���� ��� false�� ��ȯ�ϰ� ��Ұ� �߰��Ǹ� true�� ��ȯ�Ѵ�.
		int L = 0;
		while(!Q.isEmpty()) { // Queue�� ���� ������ ��
			int len = Q.size();
			System.out.print(L + " : ");
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data + " ");
				if(cur.lt != null) Q.offer(cur.lt); // ���� �ڽ��� ������ Queue�� �Է�
				if(cur.rt != null) Q.offer(cur.rt); // ������ �ڽ��� ������ Queue�� �Է�
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// ����Ʈ�� ��ȸ(���̿켱Ž�� �� ����Ž��)
		//    1    -> 0 ����
		//  2   3  -> 1 ����
		// 4 5 6 7 -> 2 ����
		// ����Ž�� : 1 2 3 4 5 6 7
		
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
