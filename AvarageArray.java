package dsa1.array;

public class AvarageArray {

	static double avarageArray(int[] arr) {
		double sum = 0;
		double avg = 0.0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			avg = (double)sum / arr.length;
		}
		return  avg;
	}
	public static void main(String[] args) {

		int[] arr = {1,2,3,4};
		double res = avarageArray(arr);
		System.out.println(res);
	}

}
