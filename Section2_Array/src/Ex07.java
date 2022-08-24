import java.util.Scanner;

public class Ex07 {
	public static int solution(int[] grading) {
		int answer = 0;
		int point = 0;
		int addPoint = 0;
		
		for(int i=0; i<grading.length; i++) {
			// ������ ����ٸ� ���� +1 ���� �հ� ����
			if(grading[i] == 1) {
				addPoint++;
				point += addPoint;
			// ������ Ʋ�ȴٸ� ������ 0���� ����
			}else {
				addPoint = 0;
			}
		}
		
		answer = point;
		return answer;
	}
	
	public static void main(String[] args) {
		// �������
		// ó������ ������ �� 1��
		// Ʋ���ٰ� �¾��� �� 1��
		// �������� ���߸� �������� ���� Ƚ����ŭ ����
		// ä�� ����� ������ �� 1, Ʋ���� �� 0���� �Է��Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		// ������ ��
		int N = sc.nextInt();
		// ä�� ���
		int[] grading = new int[N];
		
		for(int i=0; i<grading.length; i++) {
			grading[i] = sc.nextInt();
		}
		
		// ���
		System.out.println(solution(grading));
	}
}
