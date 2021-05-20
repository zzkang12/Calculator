package com.ex;

import java.util.Scanner;

class Calculator2 {
	int a, b;
	int temp;

	public int Plus(int a, int b) {
		return  a + b;
	}

	public int Minus(int a, int b)  {
		return a - b;
	}

	public int Multi(int a, int b) {
		return a * b;
	}

	public float Divi(int a, int b) {
		float temp = (float)a/(float)b;
		return temp;
	}
}

public class CalEasy {

	public static void main(String[] args) {
		{
			char c;
			Calculator2 c1 = new Calculator2();
			boolean d = true;
			do {
				System.out.println("두 정수를 입력하시오.");
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println("부호를 입력하세요.");
				c = sc.next().charAt(0);
				switch (c) {
				case '+':
					System.out.println("a+b=" + c1.Plus(a, b));
					break;
				case '-':
					System.out.println("a-b=" + c1.Minus(a, b));
					break;
				case '*':
					System.out.println("a*b=" + c1.Multi(a, b));
					break;
				case '/':
					System.out.println("a/b=" + c1.Divi(a, b));
					break;
				}
				if (c== '0') {
					System.out.println("시스템을 종료합니다.");
					break;
				}
			} while (d = true);
		}
	}
}
