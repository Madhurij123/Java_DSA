package dsa1.array;

public class SearchElement {

	static int searchElement(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				//return i;
				System.out.print("The Element is Fountd at:");
				return i;
			}
		}
		System.out.print("Element is not found");
		return -1;
	}
	public static void main(String[] args) {

		int[] arr = {2,3,4,5};
		int key = 9;
		int res = searchElement(arr,key);
		System.out.println(res);
	}


}
