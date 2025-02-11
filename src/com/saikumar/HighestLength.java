package com.saikumar;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLength {
	
	//Find the word that has highest length
	
	public static void main(String[] args) {
		
		String sentence = "I am learning streams API in Java";
		
		String output = Arrays.stream(sentence.split(" ")).max(Comparator.comparing(String::length)).get();
		
		System.out.println(output);
		
	}

}
