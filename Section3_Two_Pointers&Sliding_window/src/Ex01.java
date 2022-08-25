import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	public static ArrayList<Integer> solution(int N, int M, int[] A, int[] B) {
		ArrayList<Integer> answer = new ArrayList<>();
		int lengthA = 0, lengthB = 0;
		
		// 각 배열의 인덱스가 배열의 길이보다 작을 때
		while(lengthA<N && lengthB<M) {
			// 첫번째 인덱스부터 서로 비교
			if(A[lengthA]<B[lengthB]) {
				answer.add(A[lengthA]);
				// 비교 후 인덱스 증가
				lengthA++;
			}else {
				answer.add(B[lengthB]);
				lengthB++;
			}
		}
		
		// 위의 반복문이 끝난 후 입력되지 않은 배열 입력
		while(lengthA<N) answer.add(A[lengthA++]);
		while(lengthB<M) answer.add(B[lengthB++]);
		
		// 출력
		return answer;
	}
	public static void main(String[] args) {
		// 두 배열 합치기
		// 오름차순으로 정렬된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int[]B = new int[M];
		for(int i=0; i<B.length; i++) {
			B[i] = sc.nextInt();
		}
		
		for(int answer : solution(N, M, A, B)) {
			System.out.print(answer + " ");
		}
	}
}
