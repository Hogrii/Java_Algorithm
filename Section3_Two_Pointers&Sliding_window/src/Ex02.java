import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static ArrayList<Integer> solution(int N, int M, int[] A, int[] B){
		ArrayList<Integer> answer = new ArrayList<>();
		int indexA = 0, indexB = 0;
		
		// �� �迭�� ������������ ����
		Arrays.sort(A);
		Arrays.sort(B);
		
		// �� �迭�� �ε����� �� �迭�� ���̺��� ���� ��
		while(indexA<N && indexB<M) {
			// �� ���� ���� ������ answer�� �߰� �� �� �ε��� ����
			if(A[indexA]==B[indexB]) {
				answer.add(A[indexA++]);
				indexB++;
			}
			// B�迭�� ���� �� ũ�� A�迭�� �ε��� ����
			else if(A[indexA]<B[indexB]) indexA++;
			// A�迭�� ���� �� ũ�� B�迭�� �ε��� ����
			else indexB++;
		}
		
		// ���
		return answer;
	}
	
	public static void main(String[] args) {
		// ���� ���� ���ϱ�
		// A, B �� ������ ���� ���Ҹ� ������������ ���
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
