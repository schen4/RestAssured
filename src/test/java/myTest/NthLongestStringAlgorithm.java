package myTest;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
  
public class NthLongestStringAlgorithm
{
    public static void main(String[] args)
    {
        int n = 2;  //specify the Nth Longest String
        List<String> list = new ArrayList<String>();
        list.add("Yuri");
        list.add("Ron");
        list.add("Interview");
        list.add("Longest");
        list.add("List");
        list.add("Contain");
          
        System.out.println( findNthLongestElement(list, n) );
    }
  
    private static List<String> findNthLongestElement(List<String> list, int n)
    {
        if(n < 1) {
            return null; //Handle invalid case
        }
          
        TreeMap<Integer, List<String>> map = new TreeMap<>();
          
        for(String str : list)
        {
            Integer length = str.length();
            List<String> tempList = map.get(length) != null ? map.get(length) : new ArrayList<String>();
            tempList.add(str);
            map.put(length, tempList);
        }
        return map.get( map.descendingKeySet().toArray()[n-1] );
    }
}
