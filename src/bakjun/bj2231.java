package bakjun;
import java.util.Scanner;
import java.util.ArrayList;
public class bj2231 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>list=new ArrayList<Integer>();
		int n=sc.nextInt();
		int an=0;
		for(int i=0;i<=n;i++)
		{
			int number=i;
			int sum=0;
			while(number>0) 
			{
				sum=sum+number%10;
				number=number/10;
			}
			if(i+sum==n)
			{
				an=i;
				break;
			}
				
			
		}
		System.out.println(an);	
	}

}
