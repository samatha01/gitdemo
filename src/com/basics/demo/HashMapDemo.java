package com.basics.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		System.out.println("Size of map is " +map.size());
		System.out.println(map);
		for(String key:map.keySet()) {
			System.out.println("Key:"+key +", Value:"+map.get(key));
		}
	}

}
