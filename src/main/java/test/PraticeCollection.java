package test;

import java.util.*;
import java.util.stream.Collectors;

public class PraticeCollection {
	
	public static HashMap<Character,Integer> sortByValue(HashMap<Character,Integer> hm){
		HashMap<Character,Integer> sortedHm = hm.entrySet().stream().sorted((i1,i2)
				-> i1.getValue().compareTo(i2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)-> e1, LinkedHashMap::new));
		
		return sortedHm;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList

		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java");
		al.add("Ruby");
		al.add("JavaScript");
		al.add("Python");
			
		//Sort string objects
		//TreeSet and TreeMap is sorted.
		//As List cannot be sorted, so using collection method sort() to sort
		Collections.sort(al);
		
		//Sort string objects in reverse order
		Collections.sort(al,Collections.reverseOrder());
		
		for(int i=0; i < al.size(); i++) {
			System.out.println(al.get(i)); // get(index) to get the element
		}
		
		al.set(2, "Shell"); //modify 4th element
		al.remove(3); //remove 4th element
		
		for(String s : al) {
			System.out.println(s);
		}
		
		//turn ArrayList to Array and print the first element
		System.out.println("To Array and print the first element: "+ al.toArray()[0]);
		
		//LinkedList
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(10);
		ll.add(30);
		ll.add(50);
		
		for(Integer i : ll) {
			System.out.print(i);
		}
		
		ll.addFirst(100);
		System.out.println(ll.getFirst());
		
		ll.addLast(99);
		System.out.println(ll.getLast());
		
		ll.removeFirst();
		ll.remove(1); //remove index 1
		
		for(int i=0; i <ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
				
		
		//HashMap
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Google");
		map.put(2, "Facebook");
		map.put(3, "Amazon");
		
		System.out.println(map);
		
		for(Integer i : map.keySet()) {
			System.out.println("Key "+ i + " Value " + map.get(i));
		}
		
		for(String strValue : map.values()) {
			System.out.println(strValue);
		}
		
		//entrySet is a view as Set of Hashmap
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		map.replace(3, "Titok"); //replace value
		
		map.remove(2); // remove key+value of 2
		System.out.println(map);
		
		if(map.containsKey(1)) System.out.println(map.get(1));
		
		if(map.containsValue("Titok")) System.out.println(true);
		
		
		
		
		
		//String
		
		String S = "retrieve the case ID 123    and ID 456   ";
		
		String strTemp = S.replaceAll("\\s+", " "); //replace consecutive whitespace with a signal space
				
		//retrieve the numbers in the string
		for(String str : strTemp.split(" ")) {
			if(str.matches("[0-9]*")){
				System.out.println(str);
			}
		}
		
		//print the longest word in the string
		ArrayList<String> words = new ArrayList<String>();
		
		for(String str: strTemp.split(" ")) {
			if(str.matches("[A-Za-z0-9]*")) {
				words.add(str);
			}
		}
		
		int maxlen = 0;
		int index = 0;
		for(int i =0; i<words.size();i++) {
			String str = words.get(i);
			if(str.length()> maxlen) {
				maxlen = str.length();
				index = i;
			}
		}
		
		//print the longest word
		System.out.println("The longest word is: " + words.get(index));
		
		
		String testStr = "asafecxvhue  shdusiew";
		
		char[] chars = testStr.toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		
		for(char c : chars) {
			
			if(hm.containsKey(c)) {
				int count = hm.get(c);
				hm.replace(c, ++count);
			}else
				hm.put(c, 1);
		}
		
		System.out.println(hm);
		
		for(Map.Entry<Character, Integer> m : hm.entrySet()) {
			//print repeatable char and ignore white space
			if(m.getValue() >1 && !(Character.isWhitespace(m.getKey()))) {
				System.out.println("Repeatable character is " +m.getKey() + ":" + m.getValue());
			}
						
		}
		
		for(char c : hm.keySet()) {
			if(hm.get(c) ==1 ) {
				System.out.println("Non-repeatable characters are: " + c);
			}
		}
		
		
		
		//String methods
		//string.concat(String str) -- add another string 
		//length()
		//char charAt(index)
		//boolean matches(regex)
		//String replace(char oldChar, char newChar)
		//String split(regex)
		//String substring(int beginindex)
		//boolean startsWith(String prefix)
		//String toLowerCase()
		//char[] toCharArray()
		//String trim()
		//isEmpty()
		//contains(chars)
		
		
		//StringBuilder
		StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);  
        sb.append("!");
        System.out.println(sb); 
        sb.insert(8, "Java");
        System.out.println(sb); 
        sb.delete(5,8);
        System.out.println(sb);  
        
        String s = sb.toString();
        System.out.println(s);  
        
        StringBuilder strReversed = sb.reverse();
        System.out.println("Reversed String is: " + strReversed.toString());
        
        
        //Integer methods
        //static int parseInt(String s)  -- returns primitive int
        //static Integer valueOf(String s)  or static Integer valueOf(int i) -- returns Object Integer
        //toString()
        //equals()
        //round()
        //random()
        //int max(int i, int j) -- suitable for double, float, long as well
        
       int x =Integer.parseInt("9");
       Integer y =Integer.valueOf("80");
       Double z = Double.valueOf(5);
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
       
       System.out.println(Math.max(90, 100));
       
        
        
	}

}
