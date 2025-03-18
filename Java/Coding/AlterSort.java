import java.util.*;
public class AlterSort{
	
	public static ArrayList<Integer> alternateSort(int[] arr){
		Arrays.sort(arr);
		ArrayList<Integer> res=new ArrayList<>();
		int n=arr.length;
		int i=0;
		int j=n-1;
		boolean flag=true;
		
		while(i<=j){
			if(flag){
				res.add(arr[j]);
				j--;
			}
			else{
				res.add(arr[i]);
				i++;
			}
			flag=!flag;
		}
		return res;
	}
	
	public static void main(String[] args){
		int[] arr={7, 1, 2, 3, 4, 5, 6};
		ArrayList<Integer> res=alternateSort(arr);
		for(int i:res){
			System.out.print(i+" ");
		}
	}
}