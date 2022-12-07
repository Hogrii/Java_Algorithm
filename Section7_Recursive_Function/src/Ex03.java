
public class Ex03 {
	public int DFS(int n) {
		if(n==1) return 1;
		
		return n * DFS(n-1);
		// D(5)
		// -> 5 * D(4)
		// -> 5 * 4 * D(3)
		// -> 5 * 4 * 3 * D(2)
		// -> 5 * 4 * 3 * 2 * D(1)
		// -> 5 * 4 * 3 * 2 * 1
	}
	
	public static void main(String[] args) {
		// 팩토리얼
		// 입력값부터 1까지 곱한다.
		Ex03 T = new Ex03();
		
		System.out.println(T.DFS(5));
	}
}
