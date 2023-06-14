package if_;

import java.util.Scanner;

public class TestClass04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//입력받아 3의 배수를 판별하세요
		int num1;
		System.out.print("수 입력:");
		num1  = input.nextInt();
		if(num1 % 3 == 0) {
			System.out.println(num1+"은(는) 3의 배수이다.");
		}
		else{
			System.out.println(num1+"은(는) 3의 배수가 아니다.");
		}
		System.out.println();
		//세수를 입력 받아 가장 큰 수를 출력
		int a, b, c;
		System.out.print("a값 입력:");
		a = input.nextInt();
		System.out.print("b값 입력:");
		b = input.nextInt();
		System.out.print("c값 입력:");
		c = input.nextInt();
		if(a > b && a > b) {
			System.out.println(a+"가 제일 크다");
		}
		if(b > a &&  b > c) {
			System.out.println(b+"가 제일 크다");
		}
		if(c > a && c > b) {
			System.out.println(c+"가 제일 크다");
		}		
		System.out.println();
		//두 수를 입력 받아 큰 수가 짝수면 출력
		int d, e;
		System.out.print("d값 입력 :");
		d = input.nextInt();
		System.out.print("e값 입력 :");
		e = input.nextInt();
		if(e > d && e%2==0) {
			System.out.println(e+"가 더 크고 짝수다");
		}
		if(d > e && d%2==0){
			System.out.println(d+"가 더 크고 짝수다");
		}

	}

}
