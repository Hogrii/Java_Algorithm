
public class Ex01 {
	public void DFS(int n) {
		if(n==0) return; // -> DFS(0) 도착 -> DFS(1)
		else {
			System.out.print(n + " "); // 3 2 1
			DFS(n-1); // DFS(3) -> DFS(2) -> DFS(1) -> DFS(0) -> line4 -> DFS(1) -> DFS(2) -> DFS(3)
			System.out.print(n + " "); // 1 2 3
		}
	}
	
	public static void main(String[] args) {
		// 재귀함수 (스택프레임)
		
		Ex01 T = new Ex01();
		
		T.DFS(3);
		// D(3) -> D(2) -> D(1)
		// 재귀함수는 반복문의 형태
		// DFS는 재귀함수의 형태
		
		// DFS(3)이 호출되면 스택에 프레임이 발생
		// -> 스택에 호출된 함수의 매개변수, 지역변수, 복귀주소의 정보가 기록된다.
		// -> 가장 마지막에 호출된 함수는 스택의 최상단에 위치하기 때문에 가장 마지막에 호출된 함수부터 작동한다.
	}
}
