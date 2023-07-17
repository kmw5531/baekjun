package bakjun;
import java.util.Scanner;
public class bj14215 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		int max=Math.max(Math.max(a,b),c);
		int min=Math.min(Math.min(a, b),c);
		int mid=a+b+c-max-min;
		
		if(max==min)
			System.out.println(3*max);
		else
			System.out.println(min+mid+(min+mid-1));
		
		

	}

}
