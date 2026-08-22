package dsa1.array;

public class SumOfPosNeg {
	static int[] sumOfPosNeg(int[] arr) {
		int posSum = 0;
		int negSum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				posSum = posSum + arr[i];
			}else {
				negSum = negSum + arr[i];
			}
		}
		int[] res = {posSum,negSum};
		return res;

	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,-1,-1,6};
		int[] ans = sumOfPosNeg(arr);
		
		System.out.println("Sum Of Positive Element:"+ans[0]);
		System.out.println("Sum Of Negative Element:"+ans[1]);

	}

}
