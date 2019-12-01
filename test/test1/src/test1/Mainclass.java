package test1;

public class Mainclass {
public static void main(String[] args) {
	/*
	 * 특수문자
	 * 주석
	 
	System.out.println("Good\tMorning~");
	System.out.println("Good\nMorning~");
	System.out.println("Good\'Morning~\'");
	System.out.println("Good\"Morning~\"");
	System.out.println("Good\\Morning~\\");
	
	System.out.printf("오늘의 날씨는  %d도 입니다.\n", 8);
	
	char c1 = 'a';
	char c2 = 'A';
	
	System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n\n", c1, c2);
	
	double d = 1.123456d;
	System.out.printf("d= %f\n", d);
	*/
	// 서식문자 정렬
	System.out.printf("%d\n", 123);
	System.out.printf("%5d\n", 123);
	System.out.printf("%f\n", 1.23);
	//서식문자 소수점 제한
	System.out.printf("%.2f\n", 1.23);
	}
}
