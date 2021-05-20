package com.ex;

import java.util.Scanner;

public class CalVO {
	boolean select = true;
	Calculator temp = new Calculator();
	public void insert() {
		Scanner sc = new Scanner(System.in);
		do {
			if (temp.temp == 0) {
				System.out.println("두 정수를 입력하세요.");
				temp.setInt(sc.nextInt(), sc.nextInt());
				System.out.println("부호를 입력하세요('='는 이전 단계로)");
				char c = sc.next().charAt(0);
				if (c == '+') {
					System.out.println(temp.Plus());
					temp.setTemp(temp.Plus());
				} else if (c == '-') {
					System.out.println(temp.Minus());
					temp.setTemp(temp.Minus());
				} else if (c == '*') {
					System.out.println(temp.Multi());
					temp.setTemp(temp.Multi());
				} else if(c == '/') {
					System.out.println(temp.Divi());
					temp.setTemp(temp.Divi());
				} else if(c == '=') {
					return;
				}
			}else if(temp.temp !=0){
				System.out.println("부호를 입력하세요('='는 이전 단계로)");
				char c= sc.next().charAt(0);
				if (c == '+') {
					System.out.println("정수를 입력하세요.");
					temp.setInt(temp.temp, sc.nextInt());
					System.out.println(temp.Plus());
					temp.setTemp(temp.Plus());
				} else if (c == '-') {
					System.out.println("정수를 입력하세요.");
					temp.setInt(temp.temp, sc.nextInt());
					System.out.println(temp.Minus());
					temp.setTemp(temp.Minus());
				} else if (c == '*') {
					System.out.println("정수를 입력하세요.");
					temp.setInt(temp.temp, sc.nextInt());
					System.out.println(temp.Multi());
					temp.setTemp(temp.Multi());
				} else if(c == '/') {
					System.out.println("정수를 입력하세요.");
					temp.setInt(temp.temp, sc.nextInt());
					System.out.println(temp.Divi());
					temp.setTemp(temp.Divi());
				}	else if(c == '=') {
					return;
				}
			}
		} while (select == true);
	}
	
	public void remove() {
		temp.temp = 0;
	}
	
	public void value() {
		System.out.println("현재 값은: "+temp.temp+"입니다.");
	}

}
