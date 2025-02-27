//Snake Matrix

public class Snake_Matrix
{
	public static void main(String[] args) {
	    
		int n = 3;
		int count = 1;
		int a[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
		    if(i%2==0){
		        for(int j=0;j<n;j++){
		            a[i][j] = count++;
		        }
		    } else{
                for(int j=n-1;j>=0;j--){
		            a[i][j] = count++;
		        }       
		    }
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}