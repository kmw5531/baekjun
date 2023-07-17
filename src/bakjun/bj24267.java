package bakjun;
import java.util.Scanner;
public class bj24267 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long sum=0;
		long n=sc.nextInt();
		for(int i=1;i<n-1;i++)
		{
			sum+=i;
		}
			
		System.out.println(n-2+2*sum);
		System.out.println("3");

	}

}
