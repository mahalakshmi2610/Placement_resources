import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String s = sc.nextLine();
		
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<s.length()-1){
		    
		    int occ = 1, j = i;
		    while((s.charAt(i) == s.charAt(++j))){
		        occ++;
		    }
		    sb.append(s.charAt(i)+""+occ+"");
		    i=j;
		}
		System.out.println("Compressed String: "+sb);
		
		StringBuilder dec=new StringBuilder();
		i=0;
		while(i<sb.length()-1){
		    int count = (int)((sb.charAt(i+1)))-48;
		    for(int k=0;k<count;k++){
		        dec.append((sb.charAt(i)));
		    }
		    i+=2;
		}
		System.out.println("Decompressed String: "+dec);
	}
}