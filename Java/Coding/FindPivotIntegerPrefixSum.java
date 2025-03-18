import java.util.*;
public class FindPivotIntegerPrefixSum{
	
	public static int findPivotInteger(int n){
		
		int prefix[]=new int[n];
		int sum=0;
		
		for(int i=1;i<=n;i++){
			sum += i;
			prefix[i-1] = sum;
		}
		
		for(int i=0;i<n;i++){
			int lSum=0, rSum=0;
			lSum = prefix[i];
			if(i!=0)
				rSum = prefix[n-1] - prefix[i-1];
			else
				rSum = prefix[n-1];
			
			if(lSum == rSum) return i+1;
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		int n=8;
		int res=findPivotInteger(n);
		System.out.print(res);
	}
}