package bakjun;
import java.util.Scanner;
public class bj19532 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		int x=0;
		int y=0;
		
		if(a==0)
		{
			y=c/b;
			x=(f-e*y)/d;
			System.out.println(x);
			System.out.println(y);
		}
		else if(b==0)
		{
			x=c/a;
			y=(f-d*x)/e;
			System.out.println(x);
			System.out.println(y);
		}
		else if(d==0)
		{
			y=f/e;
			x=(c-b*y)/a;
			System.out.println(x);
			System.out.println(y);
		}
		else if(e==0)
		{
			x=f/d;
			y=(c-a*x)/b;
			System.out.println(x);
			System.out.println(y);
		}
		
		else 
		{
			
			int number1=a;
			int number2=d;
			a*=number2;
			b*=number2;
			c*=number2;
			d*=number1;
			e*=number1;
			f*=number1;
				
			y=(c-f)/(b-e);
			x=(c-b*y)/a;
				
			System.out.println(x);
			System.out.println(y);
		}
		
		
		
	}

}
