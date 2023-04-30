
public class Ex01 {
	public void DFS(int n) {
		if(n==0) return; // -> DFS(0) ���� -> DFS(1)
		else {
			System.out.print(n + " "); // 3 2 1
			DFS(n-1); // DFS(3) -> DFS(2) -> DFS(1) -> DFS(0) -> line4 -> DFS(1) -> DFS(2) -> DFS(3)
			System.out.print(n + " "); // 1 2 3
		}
	}
	
	public static void main(String[] args) {
		// ����Լ� (����������)
		
		Ex01 T = new Ex01();
		
		T.DFS(3);
		// D(3) -> D(2) -> D(1)
		// ����Լ��� �ݺ����� ����
		// DFS�� ����Լ��� ����
		
		// DFS(3)�� ȣ��Ǹ� ���ÿ� �������� �߻�
		// -> ���ÿ� ȣ��� �Լ��� �Ű�����, ��������, �����ּ��� ������ ��ϵȴ�.
		// -> ���� �������� ȣ��� �Լ��� ������ �ֻ�ܿ� ��ġ�ϱ� ������ ���� �������� ȣ��� �Լ����� �۵��Ѵ�.
	}
}
