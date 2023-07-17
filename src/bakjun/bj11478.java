package bakjun;
import java.util.Scanner;
import java.util.HashSet;
public class bj11478 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashSet<String>set=new HashSet<>();
		int n = s.length();
	        for(int i=0;i<n;i++)
	        	for(int j=i+1;j<=n;j++)
	        	{
	        		set.add(s.substring(i,j));
	        	
	        	}
	      
	       System.out.println(set.size());
		
		
		

	}

}
