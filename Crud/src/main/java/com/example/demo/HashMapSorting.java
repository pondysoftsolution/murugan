package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSorting {
	
	public static void main(String[] args) {
		
		Map map = new HashMap<>();
		
		map.put("3", "a");
		map.put("2", "a");
		map.put("4", "4");
		map.put("a", "3");
		map.put("1", "a");
		
		System.err.println(map);
		
		TreeMap treeMap = new TreeMap<>();
		treeMap.putAll(map);
		
		System.err.println(treeMap);
		
		
	}

}
