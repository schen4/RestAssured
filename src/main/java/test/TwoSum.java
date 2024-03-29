package test;

public class TwoSum {
	
	/*
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
	 */
	
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for(int i=0; i < nums.length; i++) {
			for(int j=1; j< nums.length; j++) {
				if( nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
				
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		int target = 13;
		
		int[] res = twoSum(nums,target);
		
		System.out.print(nums);
	}

}
