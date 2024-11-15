package pre.kh.java.exercise;

import java.util.Scanner;

public class ExerciseBasic2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if(ch>=65 && ch<=90) {
			System.out.println("대문자입니다");
			
		}
		else {
			System.out.println("대문자가 아닙니다");
		}

	}

}
