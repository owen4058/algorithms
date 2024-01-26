package queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw6190 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/s_input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//배열 입력 
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
//			 2, 4, ,7, 10 이 주어지면
//			 2 *4	8
//			 2* 7	14
//			 2* 10	20
//			 4 *7	28
//			 4 * 10	40
//			 7 * 10	70
			int max = 0; int first = arr[0] * arr[1];
			for(int i = 0; i < N; i++) {
				for(int j = i + 1; j < N; j++) {
					int temp  = arr[i] * arr[j];
					if(temp > max)
						max = temp;
					else
						break;
				}
			}
			System.out.printf("#%d %d\n", test_case, max);
			
		}
	}

}
