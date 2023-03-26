import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex08 {
	int answer = 0;
	int[] dis = { 1, -1, 5 };
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();

	public int BFS(int s, int e) {
		// 1~10000 사이의 숫자
		ch = new int[10001];
		// 사람의 현재 위치를 1로 변경
		ch[s] = 1;
		// 사람의 현재 위치를 Queue에 넣는다.
		Q.offer(s);
		// 레벨은 0부터 시작
		int L = 0;
		while (!Q.isEmpty()) {
			// 현재 레벨의 길이
			int len = Q.size();
			// 현재 레벨의 길이만큼 확인
			for (int i = 0; i < len; i++) {
				// Queue에 있는 값을 꺼낸다.
				int x = Q.poll();
//				if(nx == e) return L;
					// 한 번의 점프로 움직일 수 있는 경우가 3가지이다.
					for (int j = 0; j < 3; j++) {
						// 다음 레벨의 값
						int nx = x + dis[j];
						// 다음 레벨에 송아지 위치가 존재하면 리턴
						if(nx == e) return L+1; // 자식 노드의 값이기 때문에 현재 레벨이 아닌 다음 레벨을 리턴 시켜준다.
						// 다음 레벨에 있을 값은 1이상 10000이하
						// 이미 갔던 자리라면 메모리 절약을 위해 거른다.
						if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
							// 다음 자리에 갈 위치를 1로 바꿔준다.
							ch[nx] = 1;
							// 다음 자리를 Queue에 저장
							Q.offer(nx);
						}
					}
			}
			// 레벨 증가
			L++;
		}

		return 0;
	}

	public static void main(String[] args) {
		// 송아지 찾기 1 (BFS : 상태트리탐색)
		// BFS 알고리즘은 최단거리를 찾아내는 알고리즘이다.
		// 한 번 점프시 앞1 or 뒤1 or 앞5로 이동 가능
		// 5라는 지점에서
		// 한 번의 점프로 6, 4, 10으로 이동 가능
		// 두 번의 점프로 7, 5, 11, 5, 3, 9, 9, 11, 15 -> 7, 11, 3, 9, 15(중복 제거)
		// 세 번으 ㅣ점프로 8, 12, 15, 2, 14(중복 제거)

		Ex08 T = new Ex08();
		Scanner sc = new Scanner(System.in);
		
		// 사람 위치
		int s = sc.nextInt();
		// 송아지 위치
		int e = sc.nextInt();
		System.out.println(T.BFS(s, e));
	}
}
