package bakjun;
import java.util.Scanner;
public class bj17103 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int arr[]=new int[t];
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			arr[i]=n;
			
		}
		for(int j=0;j<t;j++) {
			int i=arr[j];
			is_prime(i);
		}
		
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
			else
				System.out.println(j);
		}
		
	}

}