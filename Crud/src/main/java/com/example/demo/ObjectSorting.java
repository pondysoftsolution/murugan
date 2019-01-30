package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ObjectSorting {
	
	public static void main(String[] args) {
		
		Citizen citizen = new Citizen();
		citizen.setAmount(300);
		citizen.setRangeId("D1");
		citizen.setName("uuu");
	
		Citizen citizen1 = new Citizen();
		citizen1.setAmount(700);
		citizen1.setRangeId("D2");
		citizen1.setName("rrr");
		
		List<Citizen> arrayList = new ArrayList<>();
		
		arrayList.add(citizen1);
		arrayList.add(citizen);
		
		Collections.sort(arrayList,Collections.reverseOrder());
		
		for (Citizen citizen2 : arrayList) {
			System.err.println(citizen2);
		}
	} 

}
