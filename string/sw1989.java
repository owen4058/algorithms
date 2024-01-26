package string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw1989 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String str = sc.nextLine();
			int N = str.length(); 
			
			int mid = N / 2;
			int flag = 0;
			for(int i = 0; i < mid ; i++) {
				// level n = 5, indexMax = 4, mid = 2
				if(str.charAt(i) != str.charAt(N - i - 1)) {
					flag = 0;
					break;
				}
				flag = 1;
			}
			System.out.printf("#%d %d\n", test_case, flag);
			
		}
		sc.close();
		
		
	}

}
