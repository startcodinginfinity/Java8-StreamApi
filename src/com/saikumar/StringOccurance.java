package com.saikumar;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurance {
	
	public static void main(String[] args) {
		
		//write a code to find the occurance of each word
		
		String s = "I am learning streams API Java Java";
		
		Map<String, Long> result = Arrays.stream(s.split(" "))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(result);
		
		
	}

}
