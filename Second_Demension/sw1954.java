package Second_Demension;

import java.util.Scanner;

public class sw1954 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
	
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); int cnt = N;
			int num = 1;
			int control = 1;
			int row = 0; int col = -1;
			
			int[][] snail = new int[N][N];
			System.out.println("#" + test_case);
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < cnt; j++) { // 가로 
					col += control;
					snail[row][col] = num;
					num++;
				}
				cnt--;
				for(int k = 0; k < cnt; k++) { // 세로
					row += control;
					snail[row][col] = num;
					num++;
				}
				control *= -1;
				
			}
			
			for(int i = 0; i < N; i++ ) { //결과값 출력
				for(int j = 0; j < N; j++) {
					System.out.print(snail[i][j] + " ");
					
				}
				System.out.println();
			}
		}
	}

}
