class Node{
	int data; // 1, 2, 3, 4, 5, 6, 7
	Node lt, rt; 
	// lt = 왼쪽, rt = 오른쪽
	// 인스턴스 변수 -> Node라는 Class의 객체 주소를 저장하는 변수
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Ex05 {
	Node root; // Node라는 Class의 객체 주소를 저장하는 변수
	public void DFS(Node root) {
		if(root == null) return;
		else {
			// 전위순회
//			System.out.print(root.data + " ");
//			DFS(root.lt); 
//			DFS(root.rt);
			
			// 중위순회
//			DFS(root.lt); 
//			System.out.print(root.data + " ");
//			DFS(root.rt);
			// 1 -> 2 -> 4 -> null -> 4 출력 -> null -> 2 출력 -> 5 -> null -> 5 출력 ->
			// null -> 1 출력 -> 3 -> 6 -> null -> 6 출력 -> null -> 3 출력 -> 7 -> null ->
			// 7 출력 -> null
			// 4 2 5 1 6 3 7
			
			// 후외순회
//			DFS(root.lt); 
//			DFS(root.rt);
//			System.out.print(root.data + " ");
		}
	}
	
	public static void main(String[] args) {
		// 이진트리 순회(깊이우선탐색)
		//    1
		//  2   3
		// 4 5 6 7
		// 전위순회 출력 : 1 2 4 5 3 6 7 -> 부 - 왼 - 오
		// 중위순회 출력 : 4 2 5 1 6 3 7 -> 왼 - 부 - 오
		// 후위순회 출력 : 4 5 2 6 7 3 1 -> 왼 - 오 - 부
		// 부모의 위치에 따라 생각하면 좋음
		
		Ex05 tree = new Ex05();
		tree.root = new Node(1); // data = 1, root는 Node Class의 주소를 가리키고 있음
								 // 처음 lt, rt에는 null이 있지만, 2와 3이 입력되는 순간 lt, rt에 주소값이 들어간다.
		tree.root.lt = new Node(2); // data = 2, root가 가지고 있는 주소 내 lt라는 주소에 2를 넣음
		tree.root.rt = new Node(3); // data = 3, root가 가지고 있는 주소 내 rt라는 주소에 3을 넣음
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}

}
