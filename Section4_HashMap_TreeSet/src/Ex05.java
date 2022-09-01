import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Ex05 {
	public static int solution(int K, int[] arr) {
		int answer = 0;
		/*
		// TreeSet ���
		// TreeSet�� HashSet�� �����ϰ� �ߺ� �����͸� �������� �ʰ� ���� ������ �������� �ʴ´�.
		// HashSet���� �������� ���� Ž�� Ʈ�� ������ �Ǿ��ִٴ� ���̴�.
		// Collections.reverseOrder()�� ������ ������������ �ڵ����ĵȴ�.
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int l=j+1; l<arr.length; l++) {
					// treeSet �ڷᱸ���� �߰�
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt = 0;
		for(int x : Tset) {
			cnt++;
			System.out.println(cnt + " ~ " + x);
		}
		 */

		// HashMap ���
		HashMap<Integer, Integer> arrMap = new HashMap<>();
		ArrayList<Integer> sumRank = new ArrayList<>();

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int l=j+1; l<arr.length; l++) {
					// ArrayList sumRank�� �� ���� ���� �ߺ����� ������ �Է�
					if(!sumRank.contains(arr[i]+arr[j]+arr[l])) {
						sumRank.add(arr[i]+arr[j]+arr[l]);
					}
				}
			}
		}
		// sumRank�� ������������ ����
		Collections.sort(sumRank, Collections.reverseOrder());
		
		// sumRank�� ����� ���� ū ������� ��ȣ �ű��
		int rank = 1;		
		for(int key : sumRank) {
			arrMap.put(key, rank);
			rank++;
		}
		
		for(int key : arrMap.keySet()) {
			// key�� �ش��ϴ� value�� value ������ ����
			int value = arrMap.get(key);
			// value�� ���� K�� ���ٸ� �ش� value�� key�� ����Ѵ�.
			if(value == K) answer = key;
		}
		// ���� K��° ���� �������� ������ -1�� ���
		if(answer == 0) answer = -1;
		
		// ���
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
		System.out.println(solution(K, arr));
	}
}
