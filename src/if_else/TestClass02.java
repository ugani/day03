package if_else;

public class TestClass02 {

	public static void main(String[] args) {
		int num=0, su =10;
		if(su > 100) {
			num = 100;
		}else {
			num = 50;
		}
		System.out.println(num);
		//else를 사용하면 초기화를 안해도 오류가 나지 않음
		//초기화를 안하고 
		//if를 사용할 경우 둘 다 거짓이면 num에는 값이 없어서 에러 발생

	}

}
