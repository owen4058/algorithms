package implementations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw11315 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			char[][] map = new char[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}
			int cnt = 0;
			for(int x = 0; x < N; x++) {
				for(int y = 0; y < N; y++) {
					if(map[x][y] == 'O') {
						for(int i = 0; i < 4; i++) { // 직각 방
							for(int j = 0; j < 5; j++) {
								
							}
						}
						for(int i = 0; i < 4; i++) { // 45도 방
							for(int j = 0; j < 5; j++) {
								
							}
						}
					}
				
			
					
				}
			}
			
		}
	}

}
