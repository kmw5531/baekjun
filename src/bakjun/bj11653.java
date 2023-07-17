package bakjun;
import java.util.Scanner;
public class bj11653 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=2;i<=N;i++)
		{
			if(N%i==0)
			{
				System.out.println(i);
				N=N/i;
				i--;
			}
			
			
		}
		if(N==1)
		{
			System.out.println();
		}

	}
}
