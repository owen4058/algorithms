package search;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class sw1959 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//3 5
			//1 5 3			012	012	012
			//3 6 -7 5 4	012	123	234
			
			//5 3
			//3 6 -7 5 4
			//1 5 3
			int N = sc.nextInt(); int M = sc.nextInt();
			int[] a = new int[N]; int[] b = new int[M];
			int sum = 0;
			int max = 0;
			
			for(int i = 0; i < N; i++) a[i] = sc.nextInt(); 
			for(int i = 0; i < N; i++) b[i] = sc.nextInt();
			
			if(N < M) {
				for(int i = 0; i < M - N; i++) {
					for(int j = 0; j < N; j++) {
						j += i;
						sum += a[j] * b[j + i];
					}
					if(sum > max) {
						max = sum;
					}
				}
			} else {
				for(int i = 0; i < N - M; i++) {
					for(int j = 0; j < M; j++) {
						j += i;
						sum += a[j + i] * b[j];
					}
					if(sum > max) {
						max = sum;
					}
				}
			}
			System.out.printf("#%d %d", test_case, max);
		}
		sc.close();
	}

}
