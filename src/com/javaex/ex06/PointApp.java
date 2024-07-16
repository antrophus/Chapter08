package com.javaex.ex06;


//아래의 프로그램 실행시 결과를 예상하고 주어진 프로그램을 실행 후 확인해 보세요.
//equals()메소드가 없는 실행되는 이유를 말하세요
public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);      	//false
		System.out.println(p2 == p3);		//false
		System.out.println(p3 == p4);		//false
		System.out.println(p4 == p1);		//true
		System.out.println(p1.equals(p2));	//true (x) >> false equals()메소드는 "=" 여기서는 주소가 같냐는 물음으로 false
		System.out.println(p4.equals(p1));	//ture
	}
		//Integer 클래스는 자동 박싱과 언박싱이 됨

}


