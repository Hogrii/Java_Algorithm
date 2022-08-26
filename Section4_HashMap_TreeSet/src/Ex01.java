import java.util.HashMap;
import java.util.Scanner;

public class Ex01 {
	public static char solution(int n, String votes) {
		char answer = ' ';
		HashMap<Character, Integer> voteMap = new HashMap<>();
		
		/*
		// Key는 Char, Value는 int
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('A', 3);
		 */
		
		for(char vote : votes.toCharArray()) {
			// .getOrDefault()는 값이 있으면 vote값을 가져오고 없으면 0값을 가져온다.
			// 카운팅에 아주 중요!
			voteMap.put(vote, voteMap.getOrDefault(vote, 0)+1);
		}
		
		// Integer.MIN_VALUE는 정수 중 가장 작은 값을 가져온다.
		// 최대값을 갱신하기 위해 가장 작은 값을 가져오는 것
		int max = Integer.MIN_VALUE;
		
		// .ketSet()은 HashMap 타입으로 선언된 객체의 키들을 탐색한다.
		for(char key : voteMap.keySet()) {
			// .get(key)은 HashMap에 저장되어 있는 key에 해당하는 value를 가져온다.
			// System.out.println(key + " " + voteMap.get(key));
			if(voteMap.get(key)>max) {
				max = voteMap.get(key);
				answer = key;
			}
		}
		
		// .containsKey()는 해당하는 key에 대한 value가 있는지 확인하는 것
		// 키가 존재하면 true, 존재하지 않으면 false를 출력
		// System.out.println(voteMap.containsKey('A'));
		
		// .size()는 현재 HashMap에 등록되어 있는 key의 수를 가져온다.
		// System.out.println(voteMap.size());
		
		// .remove()는 key를 삭제한다.
		// System.out.println(voteMap.remove());
		
		// 출력
		return answer;
	}
	
	public static void main(String[] args) {
		// 학급 회장(해쉬)
		// 학생 수 N 입력
		// N개의 투표용지 입력(A~E)
		// 회장으로 선출된 학생 출력
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String votes = sc.next();
		
		System.out.println(solution(n, votes));		
	}
}
