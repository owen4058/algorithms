package sorting;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ThreeSixNine {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		System.setIn(new FileInputStream("src/res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int N;
		String a;
		String result = "";
		
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			for(int i = 1; i <= N ; i++) {
				a = String.valueOf(i);
				for(int j = 0; j < a.length(); j++) {
					if(a.charAt(j) == '3' || a.charAt(j) == '6' || a.charAt(j) == '9') {
						result = result + "-";
					}
					else {
						result = result + a.charAt(j);
					}
				}
				result = result + " ";
				
			}
			System.out.print(result.toString());
			System.out.println();

		}
		
	}	
}

