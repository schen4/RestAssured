package test;

import java.util.HashMap;
import java.util.HashSet;

public class TreeConstruction {
	
	public static boolean TreeConstructor(String[] strArr) {
		
		HashSet<String> children = new HashSet<>();
		HashMap<String,Integer> parent = new HashMap<>();
		boolean result = false;
		
		
		for(String node : strArr) {
			String[] values = node.replaceAll("[^0-9]", "").split(",");
			
			children.add(values[0]);
			Integer count = parent.get(values[1]);
			
			// If a parent node has more than two child nodes, the tree is non-binary
			if( count !=null && count + 1 >2 ) {
				return false;
			}else {
				parent.put(values[1], (count == null ? 1 : ++count));
			}
		}
		
		
		if(children.size() == strArr.length) result = true;
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
