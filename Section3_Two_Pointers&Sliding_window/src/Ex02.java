import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex02 {
	public ArrayList<Integer> solution(int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		// �� �迭 �������� ����
		Arrays.sort(a);
		Arrays.sort(b);
		
		// �� �迭�� �ε���
		int p1 = 0;
		int p2 = 0;
		
		while(p1<a.length && p2<b.length) {
			if(a[p1] == b[p2]) {
				answer.add(a[p1]);
				p1++;
				p2++;
			}else {
				if(a[p1]<b[p2]) p1++;
				else p2++;
			}
		}
		
		return answer;		
	}
	
	public static void main(String[] args) throws IOException{
		// ������� ���ϱ�
		// A, B �� ���� ������ �־����� ���� ���Ҹ� ������ ������������ ���
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Ex02 ex = new Ex02();
		
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
		
		// �ι��� �迭 ���� �Է�
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<b.length; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		// ���
		for(int x : ex.solution(a, b)) System.out.print(x + " ");
	}
}