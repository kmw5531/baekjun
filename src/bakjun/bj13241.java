package bakjun;
import java.util.Scanner;

public class bj13241 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long m=sc.nextInt();
		
		int count=1;
		if(n<m)
		{
			while (!((m*count)%n==0)) {
                count++;
            }
			System.out.println(m*count);
		}
		else if(n>m)
		{
			while (!((n*count)%m==0)) {
                count++;
            }
			System.out.println(n*count);
			
		}
		else
			System.out.println(n);
	    }
}
