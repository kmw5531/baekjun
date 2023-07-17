package bakjun;
import java.util.Scanner;
public class bj24265 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long sum=0;
		long n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("2");
	}

}
