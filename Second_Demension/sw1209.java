package Second_Demension;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw1209 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = 10;
	
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int[][] arr = new int[100][100];
			int max = 0;
	        int sum1 = 0;
	        int sum2 = 0;
	        int sum3 = 0;
	        int sum4 = 0;
	        
			for(int i =0; i<100; i++){
                for(int j=0; j<100; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
             
            for(int i =0; i<100; i++){
                sum1 = 0;
                sum2 = 0;
                sum3 += arr[i][i];
                sum4 += arr[i][99-i];
               
                for(int j=0; j<100; j++){
                    sum1 += arr[i][j];
                    sum2 += arr[j][i];
                }
                max = Math.max(max,sum1);
                max = Math.max(max,sum2);
            }
            max = Math.max(max,sum3);
            max = Math.max(max,sum4);
        
            System.out.println("#" + test_case + " " + max);

        }
    }
}