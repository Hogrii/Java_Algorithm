import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex08 {
	int answer = 0;
	int[] dis = { 1, -1, 5 };
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();

	public int BFS(int s, int e) {
		// 1~10000 ������ ����
		ch = new int[10001];
		// ����� ���� ��ġ�� 1�� ����
		ch[s] = 1;
		// ����� ���� ��ġ�� Queue�� �ִ´�.
		Q.offer(s);
		// ������ 0���� ����
		int L = 0;
		while (!Q.isEmpty()) {
			// ���� ������ ����
			int len = Q.size();
			// ���� ������ ���̸�ŭ Ȯ��
			for (int i = 0; i < len; i++) {
				// Queue�� �ִ� ���� ������.
				int x = Q.poll();
//				if(nx == e) return L;
					// �� ���� ������ ������ �� �ִ� ��찡 3�����̴�.
					for (int j = 0; j < 3; j++) {
						// ���� ������ ��
						int nx = x + dis[j];
						// ���� ������ �۾��� ��ġ�� �����ϸ� ����
						if(nx == e) return L+1; // �ڽ� ����� ���̱� ������ ���� ������ �ƴ� ���� ������ ���� �����ش�.
						// ���� ������ ���� ���� 1�̻� 10000����
						// �̹� ���� �ڸ���� �޸� ������ ���� �Ÿ���.
						if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
							// ���� �ڸ��� �� ��ġ�� 1�� �ٲ��ش�.
							ch[nx] = 1;
							// ���� �ڸ��� Queue�� ����
							Q.offer(nx);
						}
					}
			}
			// ���� ����
			L++;
		}

		return 0;
	}

	public static void main(String[] args) {
		// �۾��� ã�� 1 (BFS : ����Ʈ��Ž��)
		// BFS �˰����� �ִܰŸ��� ã�Ƴ��� �˰����̴�.
		// �� �� ������ ��1 or ��1 or ��5�� �̵� ����
		// 5��� ��������
		// �� ���� ������ 6, 4, 10���� �̵� ����
		// �� ���� ������ 7, 5, 11, 5, 3, 9, 9, 11, 15 -> 7, 11, 3, 9, 15(�ߺ� ����)
		// �� ���� �������� 8, 12, 15, 2, 14(�ߺ� ����)

		Ex08 T = new Ex08();
		Scanner sc = new Scanner(System.in);
		
		// ��� ��ġ
		int s = sc.nextInt();
		// �۾��� ��ġ
		int e = sc.nextInt();
		System.out.println(T.BFS(s, e));
	}
}
