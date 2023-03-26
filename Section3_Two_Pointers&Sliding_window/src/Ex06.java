import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex06 {
	public int solution(int k, int[] arr) {
		// �ִ� ����
		int max = 0;
		int lt = 0;
		int rt = 0;
		// ���� ����Ƚ��
		int changeCnt = 0;
		
		// �˻�
		for(rt=0; rt<arr.length; rt++) {
			// rt�� 0�� ������ ����Ƚ�� �߰�
			if(arr[rt]==0) changeCnt++;
			
			// ����Ƚ���� �ִ� ����Ƚ������ Ŀ����
			while(changeCnt>k) {
				// lt�� 0�� ������ ����Ƚ�� ����
				if(arr[lt]==0) changeCnt--;
				
				// lt ������ �̵�
				lt++;				
			}
			// rt�� ��ġ���� lt���� �Ÿ��� ���Ѵ�
			max = Math.max(max, rt-lt+1);
		}		
		
		return max;
	}
	
	public static void main(String[] args) throws IOException{
		// �ִ� ���� ���Ӻκм���
		// 0�� 1�� ������ ���� n ����
		// �ִ� k�� 0 -> 1�� ���� ����
		// 1�θ� ������ �ִ� ������ ���Ӻκм����� ���
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Ex06 ex = new Ex06();
		
		// ���� ����, ���� Ƚ��
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		// �迭 ����
		int[] arr = new int[n];
		
		// �迭�� ���� �Է�
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// ���
		System.out.println(ex.solution(k, arr));	
	}
}