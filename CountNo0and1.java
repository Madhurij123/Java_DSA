package dsa1.array;

public class CountNo0and1 {

	//If there is question of count then use increment Operator
	static int[] countSum(int[] arr)
	{
		int oneCount = 0;
		int zeroCount = 0;

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				zeroCount++;
			}else {
				oneCount++;
			}
		}
		int[] res = {zeroCount,oneCount};
		return res;
	}
	public static void main(String[] arg) {

		int[] arr = {1,1,0,0,1,1,1};
		int[] ans = countSum(arr);
		System.out.println("Count of Zeros:"+ans[0]);
		System.out.println("Count of Onces:"+ans[1]);
	}
}
