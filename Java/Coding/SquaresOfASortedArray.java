import java.util.*;
public class SquaresOfASortedArray{
	
	public static int[] squaresOfASortedArray(int[] arr){
		int n=arr.length;
		int[] res=new int[n];
		int i=0;
		int j=n-1;
		int ind=n;
		
		while(i<=j){
			if(Math.abs(arr[i])>=Math.abs(arr[j])){
				res[--ind]=arr[i]*arr[i];
				i++;
			}
			else{
				res[--ind]=arr[j]*arr[j];
				j--;
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		int[] arr={-4, -1, 0, -3, 10};
		int[] res=squaresOfASortedArray(arr);
		for(int i:res){
			System.out.print(i+" ");
		}
	}
}