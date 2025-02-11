package com.saikumar;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		//Write a code to remove duplicates and return in the same order
		
		String s = "dabcadefg";
		
		s.chars().distinct().mapToObj(x->(char)x).forEach(System.out::print);
		
		//output =  dabcefg
		
	}

}
