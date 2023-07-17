package bakjun;
import java.util.Scanner;
public class bj2869 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int v=sc.nextInt();
	    int h=0;//올라간 높이
	    int count=1;
		while(!(v==h))
		{
			
			if(h+a>=v)break;
			h=h+a-b;
			count++;
		}
		System.out.println(count);

	}

}
