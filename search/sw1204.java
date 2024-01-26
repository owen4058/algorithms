package search;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sw1204 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[1000];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int case_num = sc.nextInt();
			for(int i = 0 ; i < 1000; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i: arr) {
				//1. HashMap을 사용해서 배열에 없는 숫자면 map에 추가.
				if(map.containsKey(i) == false) {
					map.put(i, 0);
				//2. 배열에 있는 숫자라면 해당 key의 value에 +1
				} else {
					map.put(i, map.get(i) + 1);
				}
			}
			System.out.print("#" + case_num + " ");
			//!! Collections.max()를 사용했는데 요소의 수가 많아지면 인식이 안되는 것 같아 사용하지 않음 
			//System.out.println(Collections.max(map.keySet()));
			
			//3. Map에 최대값 구하기 
			System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey()); 
			map.clear();
			

		}
	}

}
