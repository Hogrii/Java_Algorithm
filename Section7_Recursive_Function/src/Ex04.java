
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
		// fibo[n]�� ����ִ� ���� 0���� ũ�ٸ� �ش� ���� �տ��� �̹� ����� �� ���̱� ������
		// ��ͷ� �Ѿ�� �ʰ� �ٷ� �ش� ���� ���Ͻ��� �ð��� �����Ų��.
		
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2) + DFS(n-1);
	}
	
	public static void main(String[] args) {
		// �Ǻ���ġ ����
		// ù° �װ� ��° ���� 1�̴�.
		// ���� �� ���� ���� ���� �� ���� ���� ���� �ȴ�.
		// ���,  array�� for������ ����°� ��ͺ��� �ξ� ����.
		// -> ��ʹ� ���� �������� ���ư��� ������ �ð��� �� �ɸ��� ���ſ�鼭 ���ɵ� �� ������.
		
		Ex04 T = new Ex04();
		int n = 5;
		
//1.	for(int i=1; i<=n; i++) System.out.print(T.DFS(i) + " ");
		
//2.	fibo = new int[n+1]; // �ε��� ��ȣ�� 1���� ����ϱ� ���� n+1����ŭ �����.
//2.	T.DFS(n); // ȣ���� 1���� �ϱ� ������ 1�� ������� �ξ� ������.
//2.	for(int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
		
		fibo = new int[n+1];
		T.DFS(n);
		for(int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
		
	}
}
