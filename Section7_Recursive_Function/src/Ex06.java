
public class Ex06 {
	static int n;
	static int[] ch;
	public void DFS(int L) {
		if(L == n+1) {
			String tmp = "";
			for(int i=1; i<=n; i++) {
				if(ch[i] == 1) tmp += (i + " ");
			}
			if(tmp.length()>0) System.out.println(tmp);
		}
		else {
			ch[L] = 1; // 원소를 사용한다. 인덱스를 원소 번호라고 생각하면 된다.
			DFS(L+1); // 왼쪽(O)
			ch[L] = 0; // 원소를 사용하지 않는다.
			DFS(L+1); // 오른쪽(X)
			
			// D(1, 1) -> D(2, 1) -> D(3, 1) -> D(4) {1, 2, 3} -> D(3, 0) -> D(4) {1, 2} ->
			// D(2, 0) -> D(3, 1) -> D(4) {1, 3} -> D(3, 0) -> D(4) {1} -> D(1, 0) -> D(2, 1) ->
			// D(3, 1) -> D(4) {2, 3} -> D(3, 0) -> D(4) {2} -> D(2, 0) -> D(3, 1) -> D(4) {3} ->
			// D(3, 0) -> D(4) { }
		}
	}
	
	public static void main(String[] args) {
		// 부분집합 구하기(DFS)
		// 부분집합에 사용할지 안할지 -> O, X
		//                  D(1)
		//        D(2)                D(2)
		//   D(3)      D(3)      D(3)      D(3) 
		// D(4) D(4) D(4) D(4) D(4) D(4) D(4) D(4)
		
		Ex06 T = new Ex06();
		n = 3;
		ch = new int[n+1]; // 인덱스 0은 필요하지 않기 때문에 +1을 해준다.
		T.DFS(1); // 1부터 시작해야하기 때문에 매개변수로 1을 넣어준다.
	}
}
