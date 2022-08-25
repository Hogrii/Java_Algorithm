import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static ArrayList<Integer> solution(int N, int M, int[] A, int[] B){
		ArrayList<Integer> answer = new ArrayList<>();
		int indexA = 0, indexB = 0;
		
		// 각 배열을 오름차순으로 정렬
		Arrays.sort(A);
		Arrays.sort(B);
		
		// 각 배열의 인덱스가 각 배열의 길이보다 작을 때
		while(indexA<N && indexB<M) {
			// 두 값이 서로 같으면 answer에 추가 후 각 인덱스 증가
			if(A[indexA]==B[indexB]) {
				answer.add(A[indexA++]);
				indexB++;
			}
			// B배열의 값이 더 크면 A배열의 인덱스 증가
			else if(A[indexA]<B[indexB]) indexA++;
			// A배열의 값이 더 크면 B배열의 인덱스 증가
			else indexB++;
		}
		
		// 출력
		return answer;
	}
	
	public static void main(String[] args) {
		// 공통 원소 구하기
		// A, B 두 집합의 공통 원소를 오름차순으로 출력
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int[] B = new int[M];
		for(int i=0; i<M; i++) {
			B[i] = sc.nextInt();
		}
		
		for(int answer : solution(N, M, A, B)) System.out.print(answer + " ");
	}
}
