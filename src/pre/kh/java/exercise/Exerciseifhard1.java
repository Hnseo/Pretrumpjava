package pre.kh.java.exercise;

import java.util.Scanner;

public class Exerciseifhard1 {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1차 시험 점수를 입력하세요 : ");
		double num = sc.nextDouble();
		if(num>100 || num<0) {
			System.out.println("잘못된 값입니다.");
			return;
		}
		
		System.out.print("2차 시험 점수를 입력하세요 : ");
		double num1 = sc.nextDouble();
		
		
		if(num1<0 || num1>100) {
			System.out.println("잘못된 값입니다.");
			return;
		}
	
		double num2 = ((num+num1)/2);
		System.out.println("평균 : "+num2);
	
		if(num2>=60) {
			if(num<40) {
				System.out.println("1차 시험 재평가가 필요합니다.");
			}	
			else if(num1<40) {
					System.out.println("2차 시험 재평가가 필요합니다.");
		    }
			else {
					System.out.println("합격입니다");
			}
		}
		
		if(num2<60) {
			if(num<60 && num1>=60) {
				System.out.println("1차 시험 재평가가 필요합니다");
			    }
		    else if(num>=60 && num1<60) {
				System.out.println("2차 시험 재평가가 필요합니다.");
				}
			else if(num<60 && num1<60){
				System.out.println("재평가가 필요합니다.");
				} 
			}
		
		
	}
				
}


