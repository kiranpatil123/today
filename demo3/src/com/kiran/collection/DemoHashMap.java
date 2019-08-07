package com.kiran.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap {
	public static void main(String[] args) {

		/*
		 * HashMap<String, Integer> map = new HashMap<>(); map.put("one", 1);
		 * map.put("second", 2); map.put("three", 3);
		 * 
		 * Set<Entry<String, Integer>> entrySet = map.entrySet();
		 * 
		 * for (String s1 : map.keySet()) { System.out.println(s1); }
		 * 
		 * for (Integer i1 : map.values()) { System.out.println(i1); }
		 * 
		 * 
		 * Map.Entry.comparingByKey() entry
		 * 
		 * 
		 * for( Map.Entry<String,Integer> entry:map.entrySet()) {
		 * 
		 * System.out.println(entry.getKey()+" "+entry.getValue()); }
		 * 
		 * 
		 * HashMap<String, Integer> hashMap = new HashMap<>(map);
		 * 
		 * hashMap.put("one", 1); hashMap.put("second", 2); hashMap.put("three", 3);
		 * 
		 * 
		 * for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
		 * System.out.println(entry.getKey() + "" + entry.getValue()); }
		 */

		HashMap<String, Integer> map = new HashMap<>();
		Integer put2 = map.put(null, 1);
		Integer put4 = map.put("one", 1);
		System.out.println(put4);
		Integer put5 = map.put("one", 2);
		System.out.println(put5);
		Integer put = map.put("one", 3);
		System.out.println(put);
		map.put(null, 2);
		map.put("one1", 2);
		System.out.println(map);

		/*
		 * LinkedHashMap<String, String> linked = new LinkedHashMap<>(); String put =
		 * linked.put("chutu", "MallaMadtya"); System.out.println(put); String put2 =
		 * linked.put("hi", "hello"); String put3 = linked.put("hi", "hello1");
		 * System.out.println(put2); System.out.println(put3); linked.put("bye",
		 * "see yoy");
		 */

		/*
		 * for (Map.Entry<String, String> entry : linked.entrySet()) {
		 * System.out.println(entry.getKey() + " : " + entry.getValue()); }
		 */

	}
}
