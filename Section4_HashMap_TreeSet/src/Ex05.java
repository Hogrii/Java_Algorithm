import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Ex05 {
	public static int solution(int K, int[] arr) {
		int answer = 0;
		/*
		// TreeSet 사용
		// TreeSet은 HashSet과 동일하게 중복 데이터를 저장하지 않고 저장 순서를 유지하지 않는다.
		// HashSet과의 차이점은 이진 탐색 트리 구조로 되어있다는 점이다.
		// Collections.reverseOrder()를 넣으면 내림차순으로 자동정렬된다.
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int l=j+1; l<arr.length; l++) {
					// treeSet 자료구조에 추가
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

		// HashMap 사용
		HashMap<Integer, Integer> arrMap = new HashMap<>();
		ArrayList<Integer> sumRank = new ArrayList<>();

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int l=j+1; l<arr.length; l++) {
					// ArrayList sumRank에 세 수의 합이 중복되지 않으면 입력
					if(!sumRank.contains(arr[i]+arr[j]+arr[l])) {
						sumRank.add(arr[i]+arr[j]+arr[l]);
					}
				}
			}
		}
		// sumRank를 내림차순으로 정렬
		Collections.sort(sumRank, Collections.reverseOrder());
		
		// sumRank에 저장된 수를 큰 순서대로 번호 매기기
		int rank = 1;		
		for(int key : sumRank) {
			arrMap.put(key, rank);
			rank++;
		}
		
		for(int key : arrMap.keySet()) {
			// key에 해당하는 value를 value 변수에 저장
			int value = arrMap.get(key);
			// value가 만약 K와 같다면 해당 value의 key를 출력한다.
			if(value == K) answer = key;
		}
		// 만약 K번째 수가 존재하지 않으면 -1을 출력
		if(answer == 0) answer = -1;
		
		// 출력
		return answer;
	}

	public static void main(String[] args) {
		// K번째 큰 수
		// 1~100 사이의 자연수가 적힌 카드 N장
		// 같은 숫자가 여러장 있을 수 있음
		// 이 중 3장을 뽑아 카드의 수를 합하려 할 때, 3장을 뽑을 수 있는 모든 경우의 수 기록
		// 기록한 값 중 K번째로 큰 수를 출력(K번째 x, K번째로 큰 수)
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
