import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {
	public int solution(int n) {
		int rt, lt = 1;
		int sum = 0;
		int cnt = 0;
		
		// 1���� ����+1������ ������ -> ���� �̻��̸� ���� ���� n�� �� �� ����
		for(rt=1; rt<=(n/2)+1; rt++) {
			// sum�� rt�� �����ش�
			sum += rt;
			// sum�� n�� ������ cnt�� ����
			if(sum==n) cnt++;
			
			// sum�� n���� ũ�ų� ���� ��
			while(sum>=n) {
				// sum���� lt���� ���� lt�� ����
				sum -= lt++;
				// sum���� lt���� �� ���� n�� ������ cnt ����
				if(sum==n) cnt++;
			}
		}
		return cnt;		
	}
	
	public static void main(String[] args) throws IOException{
		// ���ӵ� �ڿ����� ��
		// N�� �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� ����� ������ ���
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Ex05 ex = new Ex05();
		
		// ���� n
		int n = Integer.parseInt(br.readLine());
		
		// ���
		System.out.println(ex.solution(n));
	}
}