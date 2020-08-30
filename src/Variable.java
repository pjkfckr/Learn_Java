
public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Variable(문자나 숫자 같은) 데이터를 담는 컨테이너다.
		 * 담겨진 데이터는 다른 데이터로 바꿀 수 있다.
		 * 변수는 마치 (사람이 쓰는 언어인)자연어에서 대명사와 비슷한 역활을 한다.
		 */
		
		// integer(정수) 변수선언 방법.
		int a;
		// 선언한 a라는 변수에 1이라는 값을 대입.
		a = 1;
		System.out.println(a + 1); // 2
		
		// 위에서 선언한 a에 2라는 값을 대입.
		a = 2;
		System.out.println(a + 2); // 2
		
		// float(실수) 변수선언 방법.
		double b = 1.7;
		System.out.println(a + 3.7); // 5.7
		
		b = 2.1;
		System.out.println(a + 2.6); // 4.6
		
		/* 위에 integer로 선언한 a라는 변수를 밑에 실수double을 사용하여
		 * 다시 선언할때 중복된 지역변수 에러가 발생하게된다.
		 * 이미 a라는 변수는 int형 변수이기떄문에 실수가 들어갈수 없기떄문에 에러가발생한다.
		 */
	}

}