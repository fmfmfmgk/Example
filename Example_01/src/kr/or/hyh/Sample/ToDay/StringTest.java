package kr.or.hyh.Sample.ToDay;

import java.io.File;
import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		StringTest st = new StringTest();
//		st.method1();
//		st.method2();
//		st.method3();
//		st.method4();
//		st.method5();
//		st.method6();
//		st.method7();
		st.method8();
		
	}

	
	private void method8() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("프로그램을 종료 하시겠습니까(y/n)");
			String input = sc.next();
			if(input.equalsIgnoreCase("y")) {
				break;
			}
		}
	}
	
	public boolean equaIsIgnoreCase(String str1, String str2) {
		str1 = str1.toLowerCase().trim();
		str2 = str2.toLowerCase().trim();
		return str1.equals(str2);
	}
	
	
	
	
	private void method7() {
		String str = "0123456789";
		String start = "";
		if(str.startsWith(start)) {
			System.out.println("'"+start+"'로 시작하는 문자열.");
		}
		String end = "";
		if(str.endsWith(end)) {
			System.out.println("'"+start+"'로 끝나는는 문자열.");
		}
//		File src = new File(D:\\D_setting\A_TeachingMaterial\01_BasicJava\workspace\BasicJava\src);
//		subList(src);
		
	}

//	public void subList() {
//		for(File f : src.listFiles()) {
//			if(f.isDirectory()) {
//				subList(f);
//			}
//			if(f.getName().endsWith(".java")){
//					System.out.println(f.getName());
//					System.out.println("자바 파일");
//			}
//		}
//	}
		
		
		
		
		
		
		
		
	private void method6() {
		String str = "0123456789";
//		str = str.substring(3);
		str = str.substring(3,7);
		System.out.println(str);
	}
	
	//replace 특정문자 수정,삭제
	private void method5() {
		String str = "바보 멍청이 dddd";
		str = str.replace("바보","**");
		str = str.replace("멍청이","***");
		System.out.println(str);
		
		String str2 ="100,200,300,110000";
		str2 = str2.replace(",","*");
		System.out.println(str2);
	}

	private void method4() {
		String str = "괄호()와 블럭{} 두부분으로 나눠져있는데, 괄호에는 처리하고자하는 예외타입(Exception), 참조변수(e)를 선언한다.\r\n" + 
				"예외발생시 발생예외에 해당하는 클래스의 인스턴스가 만들어진다.\r\n" + 
				"예를 들어 AuthException이 발생한다고 하면 AuthException인스턴스가 생성된다. \r\n" + 
				"try블럭내에서 이 예외가 발생했다면, 이를 처리할 수 있는 catch 블럭이 있는지 찾는다"; 
		String str2 = "100	200	300	110000\r\n";
		String[] lines = str2.split("\t");
		
		
		for (int i = 0; i < lines.length; i++) {
			System.out.println((i+1)+". "+lines[i]);
		}
//		System.out.println(str);
	}

	private void method3() {
		String str  = "   aB   cDe   F  \t\r";
		System.out.println("---------------------");
		System.out.println(str);
		System.out.println("---------------------");
		//****************
		//trim 앞뒤공백, 줄바꿈문자(개행문자) 없에줌.
		//글자 중간에 있는 공백은 없에지 않음.
		str = str.trim();
		System.out.println(str);
		System.out.println("---------------------");
	}

	private void method2() {
		String str  = "aBcDeF";
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		}
	

	private void method1() {
		String str  = "문자열 테스트 입니다.";
		String search = "테스트";
		if(str.contains("테스트")) {
			System.out.println("'"+search+"'문구가 포함 되어 있습니다.");
		}
	}
}
