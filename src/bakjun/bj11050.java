package bakjun;
import java.util.Scanner;
public class bj11050 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a=1;
		int b=1;
		int c=1;
		for(int i=0;i<k;i++)
		{
			a*=n;
			n--;
		}
		for(int i=1;i<=k;i++)
		{
			b=b*i;
		}
		System.out.println(a/b);
	
		for(int i=13;i<30;i++)
			c=c*i;
		System.out.println(c);
	}

}
