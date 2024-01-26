package stack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class sw8931 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Stack<Integer> stackNum = new Stack<>();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int K = sc.nextInt();
			int sum = 0;
			
			for(int i = 0; i < K; i++) {
				int num = sc.nextInt();
				if(num == 0) {
                    sum -= stackNum.pop();
                } else {
                    stackNum.add(num);
                    sum += num;
                }

			}

			System.out.printf("#%d %d\n", test_case, sum);
		}
		
	}

}
