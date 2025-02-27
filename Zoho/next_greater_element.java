import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the array");
		for(int i=0;i<n;i++) {
		    arr[i] = sc.nextInt();
		}
		
		int max = arr[n-1];
		arr[n-1] = -1;
		
		for(int i=n-2;i>=0;i--) {
            
            
            
            if(arr[i] > max){
                max = arr[i];
            }
            arr[i] = max;
        
		}
		for(int i=0;i<n;i++) {
		    System.out.print(arr[i]+" ");
		}
	}
}
