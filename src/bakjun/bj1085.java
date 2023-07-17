package bakjun;
import java.util.Scanner;
public class bj1085 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		int w= sc.nextInt();
		int h= sc.nextInt();
		int t=0;
		int p=0;
		
		if(x<w-x)
		{
			t=x;
		}
		else
			t=w-x;

		
		if(y<h-y)
		{
			p=y;
		}
		else
			p=h-y;
		
		if(t<p)
		{
			System.out.println(t);
		}
		else
			System.out.println(p);
	}

}
