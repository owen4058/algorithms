package sorting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/input.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int max = 0;
		int min = 0;
		int[] nums = new int[10];
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			for (int i = 0; i < 10; i++) {
	            nums[i] = sc.nextInt();
	        }	
		
			for (int i = 0; i < nums.length; i++) {
				max = Math.max(max, nums[i]);
			}
			System.out.print("#" + test_case + " ");
			System.out.print(max);
			System.out.println();
			max = 0;
		}
	}

}
