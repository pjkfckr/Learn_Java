
public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 효율적인 프로그래밍을 하기위해 정수와 실수, byte의 크기를 정의하여 사용한다.
		 * 당장의 머리만 돌아가는 프로그래밍이 아닌,
		 * 실제 프로그래밍의 속도와 연관되어있기때문에 중요한 부분이라 생각한다.
		 */
		
		byte district = 127; // byte 는 메모리 크기가 1 byte 이고 -128 ~ 127 까지 표현이 가능하다.
		short short_district = 32767; // short 은 메모리 크기가 2 byte 이고 -32,768 ~ 32,767까지 표현이 가능하다.
		int int_district = 2147483647; /* int는 메모리 크기가 4 byte 이고 
										-2,147,483,648~2,147,483,647 까지 표현이 가능하다.
										*/
		long long_district = 9223372036854775807; /* long은 메모리 크기가 8 byte이고 
													 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
													 까지 표현이 가능하다.
												   */
		double float_number = 1.232324; // 실수를 사용할때는 double을 사용
		String char_string = "P"; /*
								String 클래스의 문자열 길이의 한계는 하드웨어 머신과 운영체계에서 허용하는 최대한의 크기까지 가능하며, 
								특별히 규약에서 제약하는 사항은 없다. 
								단, 자바 가상 머신에 따라 힙 메모리 할당에 옵션 설정이 있을 수 있다.
								그렇기에 굳이 char가 아닌 string을 사용하면 좋다.
								*/
	}

}
