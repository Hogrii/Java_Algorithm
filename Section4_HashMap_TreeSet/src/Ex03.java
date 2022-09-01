import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	public static ArrayList<Integer> solution(int K, int[] take) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> takeMap = new HashMap<>();

		// 연속된 K-1일 동안의 매출액 입력
		for(int i=0; i<K-1; i++) {
			takeMap.put(take[i], takeMap.getOrDefault(take[i], 0)+1);
		}
		
		int lt = 0;
		for(int i=K-1; i<take.length; i++) {
			// 연속된 K일 동안의 매출액들을 K로 저장, 중복이면 값만 +1 증가
			takeMap.put(take[i], takeMap.getOrDefault(take[i], 0)+1);
			// 저장되어 있는 키들의 수를 answer에 저장
			answer.add(takeMap.size());
			// 저장된 키의 맨 앞의 키의 값을 -1 감소
			takeMap.put(take[lt], takeMap.get(take[lt])-1);
			// 만약 감소된 키의 값이 0이라면 키 값을 제거
			if(takeMap.get(take[lt]) == 0) takeMap.remove(take[lt]);
			// 키의 최소값 증가
			lt++;
		}
		// 출력
		return answer;
	}

	public static void main(String[] args) {
		// 매출액의 종류
		// N일 동안의 매출기록
		// 연속된 K일 동안의 매출액 종류(다른 매출액) 출력
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
