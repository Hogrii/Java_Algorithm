import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	public static ArrayList<Integer> solution(int K, int[] take) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> takeMap = new HashMap<>();

		for(int i=0; i<K-1; i++) {
			takeMap.put(take[i], takeMap.getOrDefault(take[i], 0)+1);
		}
		
		int lt = 0;
		for(int i=K-1; i<take.length; i++) {
			takeMap.put(take[i], takeMap.getOrDefault(take[i], 0)+1);
			answer.add(takeMap.size());
			takeMap.put(take[lt], takeMap.get(take[lt])-1);
			if(takeMap.get(take[lt]) == 0) takeMap.remove(take[lt]);
			lt++;
		}
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
