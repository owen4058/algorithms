package implementations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw2001 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt(); int M = sc.nextInt();
			int map[][] = new int[N][N];
			int sum = 0;
			int max = 0;
			
			for(int i =0; i < N; i++){
                for(int j = 0; j < N; j++){
                    map[i][j] = sc.nextInt();
                }
            }
			
			for(int i = 0; i <= N - M; i++) {
				for(int j = 0; j <= N - M; j++) {
					for(int k = 0; k < M; k++) {
						for(int l = 0; l < M; l++) {
							sum += map[i + k][j + l];
						}
					}
					max = Math.max(sum, max);
					sum = 0;
				}
			}
			
			System.out.printf("#%d %d\n",test_case, max);
			
			
		}
		
	}

}
