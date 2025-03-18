import java.util.*;
public class SnakeMatrix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		int x=1;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(x+" ");
				if(i%2==0 && j!=n-1){
					x++;
				}
				else{
					if(j!=n-1){
						x--;
					}
				}
			}
			x+=n;
			System.out.println();
		}
	}
}