package queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sw3499 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			Queue<String> left = new LinkedList<>();
			Queue<String> right = new LinkedList<>();
			int N = sc.nextInt();
			sc.nextLine();

			
			if(N % 2 == 1)
				left.offer(sc.next());
			for(int i = 0; i < N / 2; i ++) {
				String s = sc.next();
				left.offer(s);
			}
			for(int i = 0; i < N / 2; i++) {
				String t = sc.next();
				right.offer(t);
			}
			
			
			System.out.printf("#%d ", test_case);
			for(int i = 0; i < N / 2; i++) {
				System.out.print(left.poll() + " ");
				System.out.print(right.poll() + " ");
			}

			if(N % 2 == 1)
				System.out.print(left.poll() + " ");
			System.out.println();
			left.clear(); right.clear();
			
			
		}
		sc.close();
		
	}

}
