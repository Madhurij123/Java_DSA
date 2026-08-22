package dsa1.array;

public class UnsortedElement {

	static int unSortedEle(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i + 1] <= arr[i] ){
				//ok
				return arr[i + 1];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,7,5};
		int res = unSortedEle(arr);
		System.out.println("Unsorted Element:"+res);

	}

}
