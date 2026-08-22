package dsa1.array;

public class MaximumElement {

	static int maxElement(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {2,3,5,6};
		int res = maxElement(arr);
		System.out.println("Maximum Element:"+res);
	}

}
