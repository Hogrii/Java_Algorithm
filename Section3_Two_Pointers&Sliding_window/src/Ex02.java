import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static ArrayList<Integer> solution(int N, int M, int[] A, int[] B){
		ArrayList<Integer> answer = new ArrayList<>();
		int indexA = 0, indexB = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		while(indexA<N && indexB<M) {
			if(A[indexA]==B[indexB]) {
				answer.add(A[indexA++]);
				indexB++;
			}
			else if(A[indexA]<B[indexB]) indexA++;
			else indexB++;
		}
		
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
