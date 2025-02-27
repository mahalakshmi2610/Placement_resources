//binary-decimal

public class Binary_decimal
{
	public static void main(String[] args) {
		int n = 32;
		int len = Integer.toString(n).length();
		
		int res[]=new int[len];
		int i=0;
		
		if(len==2){
		    while(n!=0){
		        if((n - 11)%10==1){
		            res[i++]=11;
		            n -= 11;
		        } 
		        if((n-10)%10==0){
		            res[i++]=10;
		            n -= 10;
		        }
		    }
		}
		System.out.println("Result:");
		i = 0;
		
	}
}