import java.util.*;
public class FindPivotIntegerBruteForce{
	
	public static int findPivotInteger(int n){
		
		for(int i = 1; i <= n; i++){
			int lSum=0, rSum=0;
			for(int j = 1; j <= i; j++){
				lSum += j;
			}
			for(int j = i; j <=n; j++){
				rSum += j;
			}
			if(lSum == rSum) return i;
		}
		return -1;
	}
	
	public static void main(String[] args){
		int n=8;
		int res=findPivotInteger(n);
		System.out.print(res);
	}
}