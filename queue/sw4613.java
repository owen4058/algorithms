package queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw4613 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt(); int M = sc.nextInt();
			int[] W = new int[N]; int[] B = new int[N]; int[] R = new int[N];
			
			for(int i = 0; i < N; i++) {
				String s = sc.nextLine();
				for(int j = 0; j < M; j++) {
					switch(s.charAt(j)){
					case 'W': W[i]++;
					case 'B': B[i]++;
					case 'R': R[i]++;
					}
				}
			}
			
			for(int i = 0; i < N - 2; i++) {
				for(int j = 1; j < N - 1; j++) {
					int wCnt = 0; int bCnt = 0; int rCnt = 0;
					
					for(int k = 0; k < M; k++) {
						
					}
				}
			}
				
				
			
			
			
			
			
			
		}
	}

}
