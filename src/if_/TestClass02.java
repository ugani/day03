package if_;

import java.util.Scanner;

public class TestClass02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("수 입력:");
		num = input.nextInt();
		if( num > 10) {
			//if문이 참일 경우 중괄호 안에 문장이 실행이 되고
			System.out.println("1. 종속문장 실행");
		System.out.println("2. 종속문장 실행");
		System.out.println("3. 종속문장 실행");
		}
		System.out.println("다음 문장");
		//if문이 참이든 아니든, if문이 끝나면 출력되는 문장
	}

}
