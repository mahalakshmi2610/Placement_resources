import java.util.*;
public class LongestLenOfSubarraySumLessThanOrEqualToTarget{
	
	public static int longestLenOfSubarraySumLessThanOrEqualToTarget(int[] arr, int target){
		int n=arr.length;
		int MAXLEN=0;
		int left=0;
		int sum=0;
		
		for(int right=0;right<n;right++){
			sum += arr[right];
			while(sum>target){
				sum -= arr[left];
				left++;
			}
			MAXLEN = Math.max(MAXLEN, right-left+1);
		}
		
		return MAXLEN;
	}
	
	public static void main(String[] args){
		int[] arr = {3, 1, 2, 7, 4, 2, 1, 1, 5, 15};
		int target = 8;
		int res=longestLenOfSubarraySumLessThanOrEqualToTarget(arr, target);
		System.out.print(res);
	}
}