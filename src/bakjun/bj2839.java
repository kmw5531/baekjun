package bakjun;
import java.util.Scanner;
public class bj2839 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n==4||n==7)
			System.out.println(-1);
		else if(n%5==0)//n이5의 배수인경우
		{
			System.out.println(n/5);
		}
		else if(n%5==1||n%5==3)//n이5의 배수는 아니면서 3의 배수인경우
		{
			System.out.println(n/5+1);
		}
		else if(n%5==4||n%5==2)
		{
			System.out.println(n/5+2);
		}
		
			

	}

}
