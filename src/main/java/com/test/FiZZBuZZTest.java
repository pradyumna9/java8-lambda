package com.test;

public class FiZZBuZZTest {

	public static void main(String[] args) {
		System.out.println("test");
		for(int i=0;i<100;i++) {
			//System.out.println(i);
			if(i%3==0 && i%5==0) {
				System.out.println("FIZZ BUZZ");
			}
			else if(i%3==0) {
				System.out.println("FIZZ");
			}
			else if(i%5==0) {
				System.out.println("BUZZ");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
