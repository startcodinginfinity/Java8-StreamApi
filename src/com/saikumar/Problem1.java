package com.saikumar;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1 {
	
	//write a code to move all zero in the right side of the List using streams

	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,0,-3,0,5,-2,0,8,0-4);
		
		List<?> result = Stream.concat(list.stream().filter(numbers->numbers!=0),
				list.stream().filter(number->number==0))
		        .collect(Collectors.toList());
		
		System.out.println(result);
		
		//result = [1, -3, 5, -2, 8, -4, 0, 0, 0]
		
		
		
	}
}
