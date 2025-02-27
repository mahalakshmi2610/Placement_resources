//Latin square matrix

public class Latin_square
{
	public static void main(String[] args) {
	    String al="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    int n=4, k=0;
	    char a[] = new char[n];
	    for(int i=0;i<n;i++){
	        a[i]=al.charAt(i);
	    }
	    
	    char res[][]=new char[n][n];
	    
	    for(int i=0;i<n;i++){
	        k = i;
	        for(int j=0;j<n;j++){
	            res[i][j] = a[k];
	            k = (k+1)%n;
	        } 
	    }
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++) {
	            System.out.print(res[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}