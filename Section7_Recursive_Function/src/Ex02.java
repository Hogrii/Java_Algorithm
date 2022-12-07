
public class Ex02 {
	public void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n/2);
			System.out.print(n%2); // 맨 마지막에 나온 값부터 적어야하기 때문에 백트래킹을 이용한다.
		}
	}
	
	public static void main(String[] args) {
		// 이진수 출력(재귀)
		// 값을 2로 나눈다.
		// 몫이 0 또는 1이 될때까지 계속 나눈다.
		// 나온 나머지를 순서대로 출력한다.
		
		Ex02 T = new Ex02();
		T.DFS(11);
	}
}
