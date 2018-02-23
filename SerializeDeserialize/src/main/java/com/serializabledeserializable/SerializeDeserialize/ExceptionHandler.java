package com.serializabledeserializable.SerializeDeserialize;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ExceptionHandler {
	public static void main(String args[]) {
		List<Integer> list1 = new ArrayList();
		list1.add(1);list1.add(1);list1.add(1);list1.add(1);list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(4);
	    Set<Integer> set=new HashSet<Integer>();
	    List<Integer> duplicates = new ArrayList<Integer>();
	    for (Integer integer : list1) {
			if(!set.add(integer)){
				duplicates.add(integer);
			}
			
		}
	    System.out.println(duplicates);
	}
}
