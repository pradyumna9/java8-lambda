package com.test;

public class NumberToRomanTest {
	
public static void main(String[] args) {
	String[] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	int num=122;
System.out.println(hundreds[(num%1000)/100] + tens[(num%100)/10] +units[(num%10)]);
}

}


