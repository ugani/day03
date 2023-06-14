package if_else;

import java.util.Scanner;

public class TestClass05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		// 커피의 개당 가격은 2000원이다.
//		// 10개를 초과하면 초과하는 양에 대해서만 개당 1500원씩 받는다.
//		// 커피의 개수를 입력 받아 금액을 출력하세요
//		// --> 10 = 20000, 11 = 21500
//		int c,m = 0;
//		System.out.print("커피 몇개:");
//		c = input.nextInt();
//		if(c > 10) {
//			m += 20000 + (c - 10)*1500;
//		}else {
//			m = c * 2000;
//		}
//		System.out.println("커피 "+c+"개의 가격은 "+m+"입니다.");
//		
//		
//		//정수를 입력받아 아래와 같이 출력하세요
//		// 1)3의 배수이면서, 4의 배수
//		// 2)3의 배수
//		// 3)4의 배수
//		// 4)3의 배수도 4의 배수도 해당이 안됨
//		// 5) (0 입력시 잘못입력)
//		// ------> 입력받은 값에 따라 출력 되게 만드세요 <------
//		int num;
//		System.out.print("수 입력:");
//		num = input.nextInt();
//		if (num == 0) {
//			System.out.println("잘못입력함");
//		}else if(num % 3 == 0 && num % 4 == 0) {
//			System.out.println("3과 4의 배수");
//		}else if(num % 3 ==0) {
//			System.out.println("3의 배수임");
//		}else if(num % 4 == 0) {
//			System.out.println("4의 배수임");
//		}else{
//			System.out.println("3과 4의 배수 둘 다 아님");
//		}
		
		//세자리수 정수를 입력 받아 그 정수의 백의자리,십의자리,일의자리가 같은지 판별하세요
		// ex) 999 입력 -> 999는 백의자리,십의자리,일의자리 정수가 같습니다
		// 	   996 입력 -> 996은 백의자리,십의자리,일의자리 정수가 같지 않습니다.
//		int num=0;
//		System.out.print("세자리수 정수를 입력(100~999) :");
//		num = input.nextInt();
//		if(num / 100 == num / 110 && num / 110 == num % 10 ) {
//			System.out.println(num+"은 백의자리,십의자리,일의자리 정수가 같습니다");
//		}else {
//			System.out.println(num+"은 백의자리,십의자리,일의자리 정수가 같지 않습니다.");
//		}

		
	}

}
