package com.test.gennerics;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) 
	{
		// List
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(1);//0
		numberList.add(2);//1
		numberList.add(10);//2
		numberList.add(2);//3
		//System.out.println(numberList);
		//System.out.println(numberList.get(2));
		
		//Set
		Set<Integer> numberSet = new HashSet<Integer>();
		numberSet.add(1);
		numberSet.add(2);
		numberSet.add(10);
		numberSet.add(2);
		//System.out.println(numberSet);
		
		//Map
		//key - value pair
		Map<String,Integer> marksObtained = new HashMap<String, Integer>();
		marksObtained.put("Ramesh", 90);
		marksObtained.put("Paresh", 85);
		marksObtained.put("Suresh", 95);
		marksObtained.put("Naresh", 97);
		
		//System.out.println(marksObtained.get("Naresh"));
		
		//Queue
		Queue<String> namesQueue = new ArrayDeque<String>();
		namesQueue.add("Ramesh");
		namesQueue.add("Paresh");
		namesQueue.add("Suresh");
		namesQueue.add("Naresh");
		namesQueue.add("Naresh");
		namesQueue.add("Ramesh");
		namesQueue.add("Suresh");
		
		//System.out.println(namesQueue.remove());
		//System.out.println(namesQueue);
		
		Map<String, Integer> map = namesQueue.stream().distinct().collect(Collectors.toMap(e->e, e->Collections.frequency(namesQueue, e)));
		System.out.println(map);
		
		
		
		
	}

}
