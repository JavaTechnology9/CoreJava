package com.facebook.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Examples implements Comparator<Integer>{

	public static void main(String[] args) {
		/*List<Integer> integerList = List.of(45,78,65,98,12,63,47);
		integerList.stream().sorted(new Java8Examples()).forEach(out->System.out.print(out+ " "));
		Stream<Integer> stream = Stream.of(1,2,2,3);
		stream.sorted(Collections.reverseOrder()).forEach(System.out::print);*/
		String str = "This is my test string";
		/*str.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet();*/
		Entry<String, Long> entry = Arrays.stream(str.split("")).collect(Collectors.groupingBy(c->c, Collectors.counting())).entrySet().stream().filter(key->key.getValue()>1L).findFirst().get();//.forEach((key,value)->System.out.println(key + " "+ value));
		System.out.println(entry.getKey()+" " +entry.getValue());
		/*Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			int count = 1;
			if (map.containsKey(ch)) {

				map.put(ch, count += map.get(ch));
			} else
				map.put(ch, count);
		}
		map.s
		System.out.println(map);*/
		

	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1.intValue()==o2.intValue()) return 1;
		else if(o1.intValue()>o2.intValue()) return 0;
		else return -1;
	}

}
