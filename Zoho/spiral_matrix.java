import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt(); 
		
		int m[][]=new int[h][w];
		
		int i=0, j=0;
		
		for(int k=1;k<=h*w;k++){
		        
		        if(j<w) {
		            m[i][j]=k;
		            j++;
		        }
		        
		      //  else if(i<h) {
		      //      m[i][j]=k;
		      //      i++;
		      //  }
		        
		      //  else if((j>0)&&(i<h)){
		      //      m[i][j]=k;
		      //      j--;
		      //  }
		        
		        else if(i>0){
		            m[i][j]=k;
		            i--;
		        }
		        
		}
		for(i=0;i<h;i++){
		    for(j=0;j<w;j++){
		         if(m[i][j]<=10){ 
		            System.out.print(" ");
		        }
		        System.out.print(m[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}