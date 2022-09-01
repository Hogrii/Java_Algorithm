import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex05 {
	public static int solution(int[] arr) {
		int answer = 0;
		// TreeSet�� HashSet�� �����ϰ� �ߺ� �����͸� �������� �ʰ� ���� ������ �������� �ʴ´�.
		// HashSet���� �������� ���� Ž�� Ʈ�� ������ �Ǿ��ִٴ� ���̴�.
		// Collections.reverseOrder()�� ������ ������������ �ڵ����ĵȴ�.
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int l=j+1; l<arr.length; l++) {
					// set �ڷᱸ���� �߰�
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt = 0;
		for(int x : Tset) {
			cnt++;
			System.out.println(cnt + " ~ " + x);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// K��° ū ��
		// 1~100 ������ �ڿ����� ���� ī�� N��
		// ���� ���ڰ� ������ ���� �� ����
		// �� �� 3���� �̾� ī���� ���� ���Ϸ� �� ��, 3���� ���� �� �ִ� ��� ����� �� ���
		// ����� �� �� K��°�� ū ���� ���(K��° x, K��°�� ū ��)
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr));
	}
}
