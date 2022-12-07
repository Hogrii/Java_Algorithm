class Node{
	int data; // 1, 2, 3, 4, 5, 6, 7
	Node lt, rt; 
	// lt = ����, rt = ������
	// �ν��Ͻ� ���� -> Node��� Class�� ��ü �ּҸ� �����ϴ� ����
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Ex05 {
	Node root; // Node��� Class�� ��ü �ּҸ� �����ϴ� ����
	public void DFS(Node root) {
		if(root == null) return;
		else {
			// ������ȸ
//			System.out.print(root.data + " ");
//			DFS(root.lt); 
//			DFS(root.rt);
			
			// ������ȸ
//			DFS(root.lt); 
//			System.out.print(root.data + " ");
//			DFS(root.rt);
			// 1 -> 2 -> 4 -> null -> 4 ��� -> null -> 2 ��� -> 5 -> null -> 5 ��� ->
			// null -> 1 ��� -> 3 -> 6 -> null -> 6 ��� -> null -> 3 ��� -> 7 -> null ->
			// 7 ��� -> null
			// 4 2 5 1 6 3 7
			
			// �Ŀܼ�ȸ
//			DFS(root.lt); 
//			DFS(root.rt);
//			System.out.print(root.data + " ");
		}
	}
	
	public static void main(String[] args) {
		// ����Ʈ�� ��ȸ(���̿켱Ž��)
		//    1
		//  2   3
		// 4 5 6 7
		// ������ȸ ��� : 1 2 4 5 3 6 7 -> �� - �� - ��
		// ������ȸ ��� : 4 2 5 1 6 3 7 -> �� - �� - ��
		// ������ȸ ��� : 4 5 2 6 7 3 1 -> �� - �� - ��
		// �θ��� ��ġ�� ���� �����ϸ� ����
		
		Ex05 tree = new Ex05();
		tree.root = new Node(1); // data = 1, root�� Node Class�� �ּҸ� ����Ű�� ����
								 // ó�� lt, rt���� null�� ������, 2�� 3�� �ԷµǴ� ���� lt, rt�� �ּҰ��� ����.
		tree.root.lt = new Node(2); // data = 2, root�� ������ �ִ� �ּ� �� lt��� �ּҿ� 2�� ����
		tree.root.rt = new Node(3); // data = 3, root�� ������ �ִ� �ּ� �� rt��� �ּҿ� 3�� ����
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}

}
