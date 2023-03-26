import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex01 {	
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		// �� �迭�� �ε���
		int p1 = 0;
		int p2 = 0;
		
		// �� �迭�� �ε����� �迭�� ���̺��� ���� �� ����
		while(p1<n && p2<m) {
			// a�� ���� b���� ������ a�� �߰�
			if(a[p1]<b[p2]) answer.add(a[p1++]);
			// a�� ���� b���� ũ�ų� ������ b�� �߰�
			else answer.add(b[p2++]);
		}
		
		// a�� �ε����� �迭�� ���̸�ŭ ���� ������ ��
		while(p1<n) answer.add(a[p1++]);
		// b�� �ε����� �迭�� ���̸�ŭ ���� ������ ��
		while(p2<m) answer.add(b[p2++]);
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		// �� �迭 ��ġ��
		// ������������ ���ĵ� �� �迭�� �־����� �� �迭�� ������������ ���� ���
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Ex01 ex = new Ex01();
		
		// ù��° �迭�� ũ��
		int n = Integer.parseInt(br.readLine());

		// ù��° �迭
		int[] a = new int[n];
		
		// ù��° �迭 ���� �Է�
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		// �ι�° �迭�� ũ��
		int m = Integer.parseInt(br.readLine());
		
		// �ι�° �迭
		int[] b = new int[m];
		
		// �ι�° �迭 ���� �Է�
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<b.length; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		// ���
		for(int x : ex.solution(n, m, a, b)) System.out.print(x + " ");
	}
}