package stack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class sw1222 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			String s = sc.next();
			Stack <Character> st = new Stack<>();
			String result = "";
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				System.out.printf("char %c", c);
				if(c - '0' >= 0 && c - '0' <= 9) result += String.valueOf(c);
				else {
					if(st.isEmpty()) {
						st.push(c);
					}else {
						result += String.valueOf(st.pop());
						st.push(c);
					}
				}
			}
			while(!st.isEmpty()) {
				result += String.valueOf(st.pop());
			}
			
			Stack <Integer> st2 = new Stack<>();
			for(int i = 0; i < result.length(); i++) {
				char c = result.charAt(i);
				if(c - '0' >= 0 && c - '0' <= 9) {
					st2.push(c - '0');
				}
				else {
					int op1 = st2.pop();
					int op2 = st2.pop();
					st2.push(op1 + op2);
				}
			}
			System.out.println("#" + test_case + " " + st2.pop());
		}
	}
}