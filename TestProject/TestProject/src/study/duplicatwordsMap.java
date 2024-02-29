package study;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import groovyjarjarantlr4.v4.runtime.misc.FlexibleHashMap.Entry;



public class duplicatwordsMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="I love love Myself";
String[] r=s.split(" ");

Map<String, Integer> map= new LinkedHashMap<String, Integer>();

for(String st: r) {
	Integer count=map.get(st);
	if(count== null) {
		map.put(st, 1);
	}else {
		map.put(st, count+1);
	}
}

Set<java.util.Map.Entry<String, Integer>> set= map.entrySet();
System.out.println(set);
for(java.util.Map.Entry<String, Integer> s1 : set) {
	if(s1.getValue()>1) {
		System.out.println(s1.getKey());
	}
}



	}

}
