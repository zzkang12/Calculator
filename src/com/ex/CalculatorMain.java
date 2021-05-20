package com.ex;

import java.util.Scanner;

public class CalculatorMain extends Calculator {

	public static void main(String[] args) {

//		Calculator c1 = new Calculator();
//		boolean d = true;
//		do {
//			System.out.println("두 정수를 입력하시오.");
//			Scanner sc = new Scanner(System.in);
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println("부호를 입력하세요.(+, -, *, /) 시스템 종료시 0 입력");
//			c1.c = sc.next().charAt(0);
//			switch (c) {
//			case '+':
//				System.out.println("a+b=" + c1.Plus(a, b));
//				break;
//			case '-':
//				System.out.println("a-b=" + c1.Minus(a, b));
//				break;
//			case '*':
//				System.out.println("a*b=" + c1.Multi(a, b));
//				break;
//			case '/':
//				System.out.println("a+b=" + c1.Divi(a, b));
//				break;
//			}
//			if(c1.c=='0') {
//				System.out.println("시스템을 종료합니다.");
//				break;
//			}
//		}while(d = true);
		
		CalVO vo = new CalVO();
		int select;
		boolean t = true;
		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("-------------------------------------");
			System.out.println("|1. 입력| 2. 삭제| 3. 현재값| 4. 종료|");
			System.out.println("-------------------------------------");
			select = sc.nextInt();
			switch(select) {
			case 1: vo.insert();
				break;
			case 2: vo.remove();
				break;
			case 3: vo.value();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				t = false;
				System.exit(0);
				break;
			}
		}while(t == true);
		System.out.println();
	}

}
