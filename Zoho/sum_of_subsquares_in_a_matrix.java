import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the matrix size:");
		int n = sc.nextInt();
		
		int m[][] = new int[n][n];
		System.out.println("Enter the matrix:");
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        m[i][j] = sc.nextInt();
		    }
		}
		
		System.out.println("Enter the value of k:");
		int k = sc.nextInt();
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(m[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}