import java.util.*;
public class MaximumSumOfSubarray{
	
	public static int maximumSumOfSubarray(int[] arr, int size){
		int n=arr.length;
		int res=Integer.MIN_VALUE;
		for(int i = 0;i<=n-size;i++){
			int currentSum=0;
			for(int j = i;j<i+size;j++){
				currentSum+=arr[j];
			}
			res=Math.max(res, currentSum);
		}
		
		return res;
	}
	
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6};
		int size = 3;
		int res=maximumSumOfSubarray(arr, size);
		System.out.print(res);
	}
}