import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	public static ArrayList<Integer> solution(int K, int[] take) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> takeMap = new HashMap<>();

		// ���ӵ� K-1�� ������ ����� �Է�
		for(int i=0; i<K-1; i++) {
			takeMap.put(take[i], takeMap.getOrDefault(take[i], 0)+1);
		}
		
		int lt = 0;
		for(int i=K-1; i<take.length; i++) {
			// ���ӵ� K�� ������ ����׵��� K�� ����, �ߺ��̸� ���� +1 ����
			takeMap.put(take[i], takeMap.getOrDefault(take[i], 0)+1);
			// ����Ǿ� �ִ� Ű���� ���� answer�� ����
			answer.add(takeMap.size());
			// ����� Ű�� �� ���� Ű�� ���� -1 ����
			takeMap.put(take[lt], takeMap.get(take[lt])-1);
			// ���� ���ҵ� Ű�� ���� 0�̶�� Ű ���� ����
			if(takeMap.get(take[lt]) == 0) takeMap.remove(take[lt]);
			// Ű�� �ּҰ� ����
			lt++;
		}
		// ���
		return answer;
	}

	public static void main(String[] args) {
		// ������� ����
		// N�� ������ ������
		// ���ӵ� K�� ������ ����� ����(�ٸ� �����) ���
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] take = new int[N];
		for(int i=0; i<take.length; i++) {
			take[i] = sc.nextInt();
		}

		for(int answer : solution(K, take)) {
			System.out.print(answer + " ");
		}	
	}
}
