import java.util.Scanner;

public class Ex02 {
	public static int solution(int[] students) {
		// ù��° �л��� ������ ���̱� ������ 1�� �߰�
		// ù��° �л��� ���� ���� ū Ű�� ������ ������ �߰�
		int answer = 1, height = students[0];
		
		for(int i=1; i<students.length; i++) {
			// ���� ���̴� �л����� Ű�� ū �л��� ���� ���̴� �л� �� �߰�
			// Ű�� ���� ū �л� ����
			if(students[i]>height) {
				answer++;
				height = students[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// N���� �л��� �Ϸķ� �����.
		// �л��� Ű�� �Է��ϰ� �������� �� �� �ִ� �л��� ���� ���϶�.
		// �տ� �� �ִ� ����麸�� ũ�� ���̰�, �۰ų� ������ ������ �ʴ´�.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] students = new int[N];
		
		for(int i=0; i<students.length; i++) {
			students[i] = sc.nextInt();
		}
		
		System.out.println(solution(students));
	}
}
