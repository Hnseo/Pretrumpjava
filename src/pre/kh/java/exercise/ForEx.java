package pre.kh.java.exercise;

public class ForEx {
	public static void main(String []arg) {
		
		for(int num = 1; num<=5; num++) {
			for(int num1 = 1; num1<=num; num1++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
