import java.util.Scanner;

public class Ex03 {
	public static String solution(int round, int[] buildA, int[] buildB) {
		String answer = "";
		
		// ����������
		if(buildA[round]==buildB[round]) answer = "D";
		else if((buildA[round]==1 && buildB[round]==3) || (buildA[round]==2 && buildB[round]==1) || (buildA[round]==3 && buildB[round]==2)) answer = "A";
		else answer = "B";
		
		// ���
		return answer;
	}
	
	public static void main(String[] args) {
		// ����������
		// N�� ������ �Ѵ�.
		// A�� �̱�� A, B�� �̱�� B, ���� D�� ����Ѵ�.
		// 1:����, 2:����, 3:��
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int round = 0;
		
		// A�� ����
		int[] buildA = new int[N];
		for(int i=0; i<buildA.length; i++) {
			buildA[i] = sc.nextInt();
		}
		
		// B�� ����
		int[] buildB = new int[N];
		for(int i=0; i<buildB.length; i++) {
			buildB[i] = sc.nextInt();
		}
		
		// ���
		for(int i=0; i<N; i++) {
			System.out.println(solution(round, buildA, buildB));
			// �̹����� ������ ������ ����
			round++;
		}
	}
}
