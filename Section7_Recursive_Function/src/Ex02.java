
public class Ex02 {
	public void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n/2);
			System.out.print(n%2); // �� �������� ���� ������ ������ϱ� ������ ��Ʈ��ŷ�� �̿��Ѵ�.
		}
	}
	
	public static void main(String[] args) {
		// ������ ���(���)
		// ���� 2�� ������.
		// ���� 0 �Ǵ� 1�� �ɶ����� ��� ������.
		// ���� �������� ������� ����Ѵ�.
		
		Ex02 T = new Ex02();
		T.DFS(11);
	}
}
