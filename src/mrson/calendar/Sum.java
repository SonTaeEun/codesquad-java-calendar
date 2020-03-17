package mrson.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a, b;
		String s1, s2;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("두수를 입력해주세요 : ");
		
		s1 = scan.next();
		s2 = scan.next();
		System.out.printf("%s, %s 입력 받았음\n", s1, s2);
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.printf("%d 와 %d 의 합은 %d 입니다.", a, b, a+b);
	
		scan.close();
	}
}