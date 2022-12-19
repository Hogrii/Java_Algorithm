import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex14 {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	public void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int cv = queue.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					queue.offer(nv);
					// 다음 노드의 최소 거리는 현재 최소거리에 +1
					dis[nv] = dis[cv] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// 그래프 최단거리(BFS)
		
		// 1  ←  2  →  5
		// ↓  ↘    ↗ ↖ ↑
		// 3  →  4  →  6
		
		// 방법 1
		// Lv0 : 1
		// Lv1 : 3 4
		// Lv2 : 5 6
		// Lv3 : 2
		
		// 방법 2
		// 배열 이용하기
		// 각 배열의 인덱스에 이동 거리를 저장
		// dis[v]는 v까지 가는 최소거리
		//          1  2  3  4  5  6 -> 인덱스 0은 사용하지 않음
		// dis[] = {0, 3, 1, 1, 2, 2} | dis[nv] = dis[v] + 1
	
		Ex14 T = new Ex14();
		Scanner sc = new Scanner(System.in);
		// 노드의 수
		n = sc.nextInt();
		// 간선의 수
		m = sc.nextInt();
		// graph의 인덱스는 노드를 의미
		// graph의 인덱스에 들어가는 List는 다음으로 이동하는 노드의 숫자를 의미
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		// 거쳐간 노드 확인 배열
		ch = new int[n+1];
		// 최소 이동 거리 저장 배열
		dis = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);;
		for(int i=2; i<=n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}
}
