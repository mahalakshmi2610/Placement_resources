import java.util.*;
public class LatinMatrix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int val=(i+j)%n;
				System.out.print((char)(val+65)+" ");
			}
			System.out.println();
		}
	}
}