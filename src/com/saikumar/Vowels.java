package com.saikumar;

import java.util.Arrays;

public class Vowels {
	
	public static void main(String[] args) {
		
		//write a code to find the words with a specified number of vowels
		//No.of vowels = 2
		
		String s = "I am learning stream API Java";
		
		Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]", "").length()==2).forEach(System.out::println);
		
		
		
	}

}
