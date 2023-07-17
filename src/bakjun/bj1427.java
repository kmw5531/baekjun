package bakjun;
import java.util.Scanner;
public class bj1427 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		String strn=Long.toString(n);	
		StringBuilder sb = new StringBuilder(strn);
		for (int i = 0; i < strn.length() - 1; i++)
			for(int j=0;j<strn.length()-i-1;j++)
			{
			
				if (sb.charAt(j) < sb.charAt(j + 1)) 
				{
			        char temp = sb.charAt(j);
			        sb.setCharAt(j, sb.charAt(j+1));
			        sb.setCharAt(j + 1, temp);
			    }
			}
		
		strn = sb.toString();
		System.out.println(strn);
		}
}
