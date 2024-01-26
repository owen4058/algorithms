package sorting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class List_BubbleSort {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("src/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		 // 배열 크기 입력    
        int size = sc.nextInt();

        // 배열 선언
        int[] nums = new int[size];

        // 배열 요소 입력
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }		
		
		for(int i = nums.length - 1; i > 0; i--){
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
		System.out.print("#" + " ");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		
	}

}
