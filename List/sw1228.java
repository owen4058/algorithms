package List;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class sw1228 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/input.txt"));

		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int oriLength = sc.nextInt(); // 원본 암호문 길이
			LinkedList<Integer> originalPassword = new LinkedList<>();
			for(int i = 0; i < oriLength; i++) { // 암호 입력 
				originalPassword.add(sc.nextInt());
			}
			int commandNum = sc.nextInt();
			
			for(int i = 0; i < commandNum; i++) {
				sc.next(); // command
				int x = sc.nextInt(); int y = sc.nextInt();
//				LinkedList<Integer> commandPassword = new LinkedList<>();
				for(int j = 0; j < y; j++) {
					originalPassword.add(x++, sc.nextInt());
				}
			}
			System.out.printf("#%d ",test_case);
			for(int i = 0; i < 10; i++) {
				System.out.print(originalPassword.pollFirst() + " ");
			}
			System.out.println();
			originalPassword.clear();
			
			
			
			
		}
	}

}
