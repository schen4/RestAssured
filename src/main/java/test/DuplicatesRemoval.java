package test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesRemoval {

	public static void main(String[] args) {
		//remove duplicates by LinkedHashSet
		Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
		
		LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>(Arrays.asList(numbers));
		
		Integer[] noduplicates = linkedSet.toArray(new Integer[] {});
		
		System.out.println(Arrays.toString(noduplicates));
		
		
		//remove duplicates via Steam.distinct()
		Integer[] origArray = new Integer[] { 1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8 };
		 
		List<Integer> listWithoutDuplicates = Arrays.asList(origArray)
		                        .stream()
		                .distinct()
		                .collect(Collectors.toList());
		  
		System.out.println(listWithoutDuplicates);
		
	}

}
