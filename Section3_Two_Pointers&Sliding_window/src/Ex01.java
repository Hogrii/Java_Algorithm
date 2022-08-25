import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	public static ArrayList<Integer> solution(int N, int M, int[] A, int[] B) {
		ArrayList<Integer> answer = new ArrayList<>();
		int lengthA = 0, lengthB = 0;
		
		while(lengthA<N && lengthB<M) { // 32
			if(A[lengthA]<B[lengthB]) {
				answer.add(A[lengthA]);
				lengthA++;
			}else {
				answer.add(B[lengthB]);
				lengthB++;
			}
		}
		
		while(lengthA<N) answer.add(A[lengthA++]);
		while(lengthB<M) answer.add(B[lengthB++]);
		
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
