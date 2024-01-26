package implementations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw2805 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int[][] farm = new int[N][N];
			for (int i = 0; i < N; i++) { // 입력
				String str = sc.next();
				int[] line = new int[N];
				for (int j = 0; j < N; j++) {
					line[j] = str.charAt(j)-'0';
				}
				farm[i] = line;
			}
			
			int mid = N / 2;
			int sum = 0;
			int start = mid; int end = mid; 
			for(int i = 0; i < N; i++) {
				for(int j = start; j <= end; j++) {
					sum += farm[i][j];
				}
				if(i < mid) {
					start--;
					end++;
				} else {
					start++;
					end--;
				}
			}
//			for(int i = 0; i < N; i++) {
//				for(int j = 0 ; j < N; j++) {
//					System.out.print(farm[i][j]);
//				}
//				System.out.println();
//			}
			
			System.out.println("#" + test_case + " " + sum);
			
			
		}
		sc.close();
	}
}
