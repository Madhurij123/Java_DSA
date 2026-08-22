package dsa1.array;

import java.util.Arrays;

public class MultipyBy10 {

	static int[] multiplyBy10(int[] arr) {
		int size = arr.length;
		int newArray[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			int element = arr[i];
			int newEle = element * 10;
			newArray[i] = newEle;
		}
		return newArray;
	}
	public static void main(String[] args) {

		int[] arr =  {1,2,3,4,5};
		int[] res = multiplyBy10(arr);
		System.out.println(Arrays.toString(res));
		
	}

}
