package test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListNode {
		// Definition for singly-linked list
	    int val;
	    ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	     
	     public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	    	 if(list1 == null) return list2;
	    	 if(list2 == null) return list1;
	    	
	    	 ListNode list = new ListNode();
	    	 
	    	 if(list1.val <= list2.val) {
	    		 list = new ListNode(list1.val);
	    		 list.next = mergeTwoLists(list1.next, list2);
	    	 }
	    	 else {
	    		 list = new ListNode(list2.val);
	    		 list.next = mergeTwoLists(list1, list2.next);
	    	 }
	    	 
	    	 return list;
	     }
	     
	
	     
	     public static void main(String[] args) {
	    	 int[] l1 = {1,2,4};
	    	 int[] l2 = {1,3,5};
	    	 ArrayList<ListNode> arrList1 = new ArrayList<>();
	    	 ArrayList<ListNode> arrList2 = new ArrayList<>();

	    	 
	    	 for(int i : l1) {
	    		 arrList1.add(new ListNode(i));    			
	    		 
	    	 }
	    	 
	    	 for(int i= 0 ; i < arrList1.size()-1; i++) {
	    		 arrList1.get(i).next = arrList1.get(i+1);
	    	 }
	    	 
	    	 arrList1.get(arrList1.size()-1).next = null;
	    	 
	    	 for(int i : l2) {
	    		 arrList2.add(new ListNode(i));    			
	    		 
	    	 }
	    	 
	    	 for(int i= 0 ; i < arrList1.size()-1; i++) {
	    		 arrList2.get(i).next = arrList2.get(i+1);
	    	 }
	    	 
	    	 arrList2.get(arrList2.size()-1).next = null;
	    		 
	    	 mergeTwoLists(arrList1.get(0),arrList2.get(0));
 	    	 
	    	 
	    	 
	     }
	
}
