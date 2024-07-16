package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	Add add = new Add();
    	Sub sub = new Sub();
    	Mul mul = new Mul();
    	Div div = new Div();
    	
    	while (true) {
			System.out.print(">> ");
			String numLine = sc.nextLine();

			String[] nArray = numLine.split(" "); // 공백 기준으로 자르기
			int num1 = Integer.parseInt(nArray[0]); // 첫번째 입력을 정수형으로 배열에 담기
			String symbol = nArray[1]; // 기호
			int num2 = Integer.parseInt(nArray[2]); // 두번째 입력을 정수형으로 배열에 담기

			if (symbol.equals("+")) {
				add.setValue(num1, num2);
				System.out.println(add.calculate());
			} else if (symbol.equals("/")) {
				div.setValue(num1, num2);
				if (num1 == 0 || num2 == 0) {
					System.out.println("0은 나누거나 나누어질 수 없습니다.");
				} else {
					System.out.println(div.calculate());
				}
			} else if (symbol.equals("*")) {
				mul.setValue(num1, num2);
				System.out.println(mul.calculate());
			} else if (symbol.equals("-")) {
				sub.setValue(num1, num2);
				System.out.println(sub.calculate());
			} else {
				System.out.println("알 수 없는 연산입니다.");
			}

			if (numLine.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}
		}

		sc.close();

    }
}
