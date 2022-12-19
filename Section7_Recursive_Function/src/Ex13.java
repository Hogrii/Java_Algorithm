import java.util.ArrayList;
import java.util.Scanner;

public class Ex13 {
	static int n, m, answer = 0;
	// Integer�� �����ϴ� ArrayList�� �����ϴ� ArrayList
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	public void DFS(int v) {
		if(n==v) answer++;
		else {
			// v�� ��� ��ȣ�� ArrayList�� ���� �´�.
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
		// ��� Ž��(��������Ʈ)
		// 1~5������ ����Ʈ ��ü�� �����.
		// ���� ������ ���� ����Ʈ�� ���� �߰��Ѵ�.
		// 1 -> 2 - 3 - 4 : 1���� �� �� �ִ� ��常 �߰��ϱ� ������ �޸𸮰� ����ȴ�.
		// 2 -> 1 - 3 ... �߰�
		
		// �Է�����
		
		// �������
		
		// 1 �� �� 2  ��  5
		// �� �� �� ��  ��
		// 3  ��  4
		
		Ex13 T = new Ex13();
		Scanner sc = new Scanner(System.in);
		// ��� ��
		n = sc.nextInt();
		// ���� ��
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		for(int i=0; i<m; i++) {
			// ��� ��ȣ
			int a = sc.nextInt();
			// �̵� ��� ��� ��ȣ
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		// �湮 ��� üũ
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
