package com.saikumar;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestLength {
	
	public static void main(String[] args) {
		
	
	
	String s = "I am learning streams API java";
	
	String result = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length)
			.reversed()).skip(1).findFirst().get();
	
	System.out.println(result);
	
	 
	}
}
