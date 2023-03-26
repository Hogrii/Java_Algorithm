import java.util.Scanner;

public class Ex12 {
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;
	public void DFS(int v) {
		if(v==n) answer++;
		else {
			for(int i=1; i<n; i++) {
				// v�� ���� ��� ��ġ
				// graph[v][i] : ���� ���� v���� i�� �̵��� �����Ѱ�?
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					// ���� ������ �� ��ȯ�ϰ� ���� ���� ��� ���� 0���� �ʱ�ȭ ���ش�.
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// ��� Ž��(�������)
		// �ѹ� �湮�� ��δ� �湮���� �ʴ´�.
		
		// �Է�����
		// ù° �ٿ��� ������ �� N(1<=N<=20)�� ������ �� M�� �־�����.
		// �ι�° �ٺ��� M�ٿ� ���� ���������� �־�����.
		
		// �������
		// �� �������� ����Ѵ�.
		
		// for�� i=1 ���� ����� ������ŭ ��ȯ�Ѵ�.
		// ������ ����Ͽ��� �Ѵ�. �̶�, �ش� ��忡 �湮�ϸ� üũ�Ѵ�. 1 -> 2�� �̵��ϸ� 2�� üũ���ش�.
		// �̹� üũ�Ǿ� �ִ� ���� �湮���� �ʴ´�.
		// ���������� �����ϸ� ���� ��Ʈ�� ��ȯ�� �� üũ�� �������־�� �Ѵ�.
		
		// 1 �� �� 2  ��  5
		// �� �� �� ��  ��
		// 3  ��  4
		
		Ex12 T = new Ex12();
		Scanner sc = new Scanner(System.in);
		// ��� ��
		n = sc.nextInt();
		// ���� ��
		m = sc.nextInt();
		// ���� ��ȣ 0�� ������� �ʱ� ������ n+1�� ����
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for(int i=0; i<m; i++) {
			// ���� a -> b�� �̵�
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
		}
		// 1�� ��� üũ
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
