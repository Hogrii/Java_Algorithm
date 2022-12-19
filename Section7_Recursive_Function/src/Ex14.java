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
					// ���� ����� �ּ� �Ÿ��� ���� �ּҰŸ��� +1
					dis[nv] = dis[cv] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// �׷��� �ִܰŸ�(BFS)
		
		// 1  ��  2  ��  5
		// ��  ��    �� �� ��
		// 3  ��  4  ��  6
		
		// ��� 1
		// Lv0 : 1
		// Lv1 : 3 4
		// Lv2 : 5 6
		// Lv3 : 2
		
		// ��� 2
		// �迭 �̿��ϱ�
		// �� �迭�� �ε����� �̵� �Ÿ��� ����
		// dis[v]�� v���� ���� �ּҰŸ�
		//          1  2  3  4  5  6 -> �ε��� 0�� ������� ����
		// dis[] = {0, 3, 1, 1, 2, 2} | dis[nv] = dis[v] + 1
	
		Ex14 T = new Ex14();
		Scanner sc = new Scanner(System.in);
		// ����� ��
		n = sc.nextInt();
		// ������ ��
		m = sc.nextInt();
		// graph�� �ε����� ��带 �ǹ�
		// graph�� �ε����� ���� List�� �������� �̵��ϴ� ����� ���ڸ� �ǹ�
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		// ���İ� ��� Ȯ�� �迭
		ch = new int[n+1];
		// �ּ� �̵� �Ÿ� ���� �迭
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
