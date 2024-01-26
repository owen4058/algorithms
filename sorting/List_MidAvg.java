package sorting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class List_MidAvg {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int length = 0;
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
//			int 10 = sc.nextInt();
            int[] nums = new int[10];
            for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }
            length = nums.length;
         
        for(int i = length - 1; i > 0; i--){
            // 0 ~ (i-1)까지 반복
            for(int j = 0; j < i; j++){
              // j번째와 j+1번째의 요소가 크기 순이 아니면 교환
              if(nums[j] > nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
              }
            }
          }
        System.out.print("#" + test_case + " ");
        double sum = 0;
        for(int i = 1; i < length - 1; i++) {
            sum += nums[i];
        }
        System.out.println(Math.round(sum/(length - 2)));
        }
		sc.close();
			

		}
	}
