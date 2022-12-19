import java.util.ArrayList;
import java.util.Scanner;

public class Ex13 {
	static int n, m, answer = 0;
	// Integer를 저장하는 ArrayList를 저장하는 ArrayList
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	public void DFS(int v) {
		if(n==v) answer++;
		else {
			// v번 노드 번호의 ArrayList를 가져 온다.
			for(int nv : graph.get(v)) {
				if(ch[v] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// 경로 탐색(인접리스트)
		// 1~5번까지 리스트 객체를 만든다.
		// 간선 정보에 따라 리스트에 값을 추가한다.
		// 1 -> 2 - 3 - 4 : 1번이 갈 수 있는 노드만 추가하기 때문에 메모리가 절약된다.
		// 2 -> 1 - 3 ... 추가
		
		// 입력정보
		
		// 출력정보
		
		// 1 ← → 2  →  5
		// ↓ ↘ ↙ ↑  ↗
		// 3  →  4
		
		Ex13 T = new Ex13();
		Scanner sc = new Scanner(System.in);
		// 노드 수
		n = sc.nextInt();
		// 간선 수
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		for(int i=0; i<m; i++) {
			// 노드 번호
			int a = sc.nextInt();
			// 이동 대상 노드 번호
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		// 방문 노드 체크
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
