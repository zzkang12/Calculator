package com.ex;

public class Calculator {
	int a, b;
	int temp;
	public void setInt(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public int Plus() {
		int result=a+b;
		temp = a+b;
		return result;
	}
	
	public int Minus() {
		int result=a-b;
		temp = a-b;
		return result;
	}

	public int Multi() {
		int result =a*b;
		temp =a*b;
		return result;
	}
	
	public int Divi() {
		int result =a/b;
		temp =a/b;
		return result;
	}
	
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	public int getTemp() {
		return temp;
	}
	
	public int Clear() {
		return 0;
	}
}
