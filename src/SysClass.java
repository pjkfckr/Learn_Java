
public class SysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1+2);
		System.out.println(1.2+1.3);
		System.out.println(6/2);
		System.out.println(3*10);
		
		/* 문자는 한 글자를 의미하고, 문자열은 여러 개의 문자가 결합 한 것을 의미한다.
		 *JAVA 에서는 ''(작은따음표) 로 감싸하야 한다.*/

		System.out.println('S');	
		System.out.println("Sang");
		/* ""(큰따음표) 로 하나의 문자를 감싼다고 에러가발생하지 않는다. 
		 * 한 글자도 문자열이 될 수도 있기 때문이다.*/
		System.out.println("S");
		
		// 그렇다면 문자열 안에 큰 따음표를 넣는 방법은 이렇다.
		System.out.println("Park said \"Hi\"");
		
		// 문자와 문자를 더할 때는 이와 같다.
		System.out.println("Sangyeong " + "Park");
	}

}
