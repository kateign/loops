package source1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String intToWord1 (int number) {
		
		String result;
		if (number == 1) {
			result = "one";
		} else if (number == 2) {
			result = "two";
		} else if (number == 3) {
			result = "three";
		} else if (number == 4) {
			result = "four";
		} else if (number == 5) {
			result = "five";
		} else if (number == 6) {
			result = "six";
		} else if (number == 7) {
			result = "seven";
		} else if (number == 8) {
			result = "eight";
		} else if (number == 9) {
			result = "nine";
		} else {
			result = "Unknown number";
		}
		
		
		return result;
	}

	public static String intToWord2 (int n) {
		
		return n == 1 ? "edno" :
			   n == 2 ? "dve" : 
			   n == 3 ? "tri" : 
			   n == 4 ? "four" :
				        "Unknown number";
	}
	
	public static String intToWord3 (int number) {
		
		String result;
		switch (number) {
		case 1 :
			result = "one";
			break;
		case 2 :
			result = "two";
			break;
		case 3 :
			result = "three";
			break;
		case 4 :
			result = "four";
			break;
		case 5 :
			result = "five";
			break;
		case 6 :
			result = "six";
			break;
		case 7 :
			result = "seven";
			break;
		case 8 :
			result = "eight";
			break;
		case 9 :
			result = "nine";
			break;
		default :
			result = "Unknown number";
		}
		return result;
	}		
}
