package search;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class sw2063 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
//			int N = sc.nextInt();
			int N = 9;
			int[] arr = new int[N];
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			if(N % 2 == 0) {
				System.out.println(arr[N/2]);
			} else {
				System.out.println(arr[N/2+1]);
			}
			//0 1 2 3 4 5
		}
		
	}

}
