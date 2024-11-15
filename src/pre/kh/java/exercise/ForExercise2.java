package pre.kh.java.exercise;

import java.util.Scanner;

public class ForExercise2 {
	public static void main(String[]arg) {
		
		int num = 1;
		int num1 = 0;
		for(num=1; num<=10; num++) {
			num1 = num + num1;
			System.out.print(num);
			if(num!=10) {
				System.out.print("+");
			}
			else
				System.out.print("=");
			
			
		}
		System.out.print(num1);
		
	}

}
