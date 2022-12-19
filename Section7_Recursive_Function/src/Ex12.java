import java.util.Scanner;

public class Ex12 {
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;
	public void DFS(int v) {
		if(v==n) answer++;
		else {
			for(int i=1; i<n; i++) {
				// v는 현재 노드 위치
				// graph[v][i] : 현재 지점 v에서 i로 이동이 가능한가?
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					// 다음 노드까지 다 순환하고 나면 현재 노드 값을 0으로 초기화 해준다.
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// 경로 탐색(인접행렬)
		// 한번 방문한 경로는 방문하지 않는다.
		
		// 입력정보
		// 첫째 줄에는 정점의 수 N(1<=N<=20)과 간선의 수 M이 주어진다.
		// 두번째 줄부터 M줄에 걸쳐 연결정보가 주어진다.
		
		// 출력정보
		// 총 가지수를 출력한다.
		
		// for문 i=1 부터 노드의 개수만큼 순환한다.
		// 방향을 고려하여야 한다. 이때, 해당 노드에 방문하면 체크한다. 1 -> 2로 이동하면 2를 체크해준다.
		// 이미 체크되어 있는 노드는 방문하지 않는다.
		// 목적지까지 도달하면 다음 루트를 순환할 때 체크를 해제해주어야 한다.
		
		// 1 ← → 2  →  5
		// ↓ ↘ ↙ ↑  ↗
		// 3  →  4
		
		Ex12 T = new Ex12();
		Scanner sc = new Scanner(System.in);
		// 노드 수
		n = sc.nextInt();
		// 간선 수
		m = sc.nextInt();
		// 정점 번호 0을 사용하지 않기 때문에 n+1로 선언
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for(int i=0; i<m; i++) {
			// 방향 a -> b로 이동
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
		}
		// 1번 노드 체크
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
