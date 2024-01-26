package string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw1215 {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			char[][] charArray = new char[8][8];
			int N = sc.nextInt();
			sc.nextLine();
			
			for(int i = 0; i < charArray.length; i++) {
                String str = sc.next();
                for(int j = 0; j < charArray[i].length; j++) {
                    charArray[i][j] = str.charAt(j);
                }
            }
			boolean flag = true; int count = 0;
			
			for(int i = 0; i < charArray.length; i++) {
                for(int j = 0; j < charArray.length - N + 1; j++) {
					// 가로 
                    flag = true;
                    for(int h = 0; h < N / 2; h++)
                        if(charArray[i][j + h] != charArray[i][j - h + N - 1])
                            flag = false;
                    if(flag) count++;
                    
					// 세로
                    flag = true;
                    for(int h = 0; h < N / 2; h++)
                        if(charArray[j + h][i] != charArray[j - h + N - 1][i])
                            flag = false;
                    if(flag) count++;
                }
            }
			System.out.printf("#%d %d\n",test_case, count);
		}
	}
}
