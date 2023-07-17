package bakjun;
import java.util.Scanner;
public abstract class bj2720 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
			int p=sc.nextInt();
			int q=p/25;
			int q2=p%25;
			
			int d=q2/10;
			int d2=q2%10;
			
			int n=d2/5;
			int n2=d2%5;
			
			int pe=n2/1;
			System.out.print(q+" "+d+" "+n+" "+pe);
		}
		

	}


}