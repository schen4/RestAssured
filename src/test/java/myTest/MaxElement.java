package myTest;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = {1,3,5,11,8,34,12};
		System.out.println("The max element is:" + getMaxElement(array));

	}
	
	public static int getMaxElement(Integer[] arrInt) {
		int max = 0;
		for(int i: arrInt) {
			if(max < i) max = i;
		}
		return max;
	}

}
