package bakjun;
import java.util.Scanner;
public class bj1929 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
			is_prime(i);
	}
	public static void is_prime(int i)
	{
		if(i<2)
			return;
		if(i==2) {
			System.out.println(2);
			return;
		}
		
		for(int j=2;j<=Math.sqrt(i);j++) {
			if(i%j==0) {
				return;
			}
		}
		System.out.println(i);
		return;
	}

}