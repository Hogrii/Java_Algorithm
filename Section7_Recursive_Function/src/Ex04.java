
public class Ex04 {
	static int[] fibo;
	public int DFS(int n) {
//1.	if(n==1) return 1;
//1.	else if(n==2) return 1;
//1.	else return DFS(n-2) + DFS(n-1);	
		// DFS(3) + DFS(4)
		// DFS(1) + DFS(2) + DFS(2) + DFS(3)
		// DFS(1) + DFS(2) + DFS(2) + DFS(1) + DFS(2)
		
//2.	if(n==1) return fibo[n] = 1;
//2.	else if(n==2) return fibo[n] = 1;
//2.	else return fibo[n] = DFS(n-2) + DFS(n-1);
		
		if(fibo[n]>0) return fibo[n];
		// fibo[n]에 들어있는 값이 0보다 크다면 해당 값은 앞에서 이미 계산을 한 값이기 때문에
		// 재귀로 넘어가지 않고 바로 해당 값을 리턴시켜 시간을 단축시킨다.
		
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2) + DFS(n-1);
	}
	
	public static void main(String[] args) {
		// 피보나치 수열
		// 첫째 항과 둘째 항은 1이다.
		// 앞의 두 항을 더한 값이 그 다음 항의 값이 된다.
		// 사실,  array와 for문으로 만드는게 재귀보다 훨씬 낫다.
		// -> 재귀는 스택 프레임이 돌아가기 때문에 시간도 더 걸리고 무거우면서 성능도 더 안좋다.
		
		Ex04 T = new Ex04();
		int n = 5;
		
//1.	for(int i=1; i<=n; i++) System.out.print(T.DFS(i) + " ");
		
//2.	fibo = new int[n+1]; // 인덱스 번호를 1부터 사용하기 위해 n+1개만큼 만든다.
//2.	T.DFS(n); // 호출을 1번만 하기 때문에 1번 방법보다 훨씬 빠르다.
//2.	for(int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
		
		fibo = new int[n+1];
		T.DFS(n);
		for(int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
		
	}
}
