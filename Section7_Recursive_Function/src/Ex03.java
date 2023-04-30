
public class Ex03 {
	public int DFS(int n) {
		if(n==1) return 1;
		else return n*DFS(n-1);
	}
	
	public static void main(String[] args) {
		// 팩토리얼
		// 입력값부터 1까지 곱한다.
		Ex03 T = new Ex03();
		
		System.out.println(T.DFS(5));
	}
}
