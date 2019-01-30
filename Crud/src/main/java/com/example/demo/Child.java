package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Child {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("A", 2000);
		map.put("b", 2000);
		map.put("c", 2000);
		map.put("d", 2001);
		map.put("Aa", 20001);
		map.put("A2", 2000);
		map.put("Ae", 20002);
		map.put("Asdf", 20002);

		Map<Integer, List<String>> mapoutput = new HashMap<>();
		
		for (Map.Entry<String, Integer> map2 : map.entrySet()) {

			if (mapoutput.get(map2.getValue()) != null) {
				List<String> city = mapoutput.get(map2.getValue());
				city.add(map2.getKey());
				mapoutput.put(map2.getValue(), city);
			} else {
				List<String> city = new ArrayList<String>();
				city.add(map2.getKey());
				mapoutput.put(map2.getValue(), city);

			}

		}

	}

}
