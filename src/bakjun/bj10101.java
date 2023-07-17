package bakjun;
import java.util.Scanner;
import java.util.ArrayList;
public class bj10101 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>list=new ArrayList<Integer>();
		int count=0;
		int sum=0;
		for(int i=0;i<3;i++)
		{
			int n=sc.nextInt();
			list.add(n);
		}
		for(int i=0;i<3;i++)
		{
			sum+=list.get(i);
		}
		
		while(sum==180)
		{
			if(list.get(0)==list.get(1))
			{
				count++;
			}
			if(list.get(1)==list.get(2))
			{
				count++;
			}
			if(list.get(0)==list.get(2))
			{
				count++;
				
			}
			if(count==3)
			{
				System.out.println("Equilateral");
				break;
			}
			if(count==1)
			{
				System.out.println("Isosceles");
				break;
			}
			if	(count==0)
			{
				System.out.println("Scalene");
				break;
			}
		}
		if(!(sum==180))
		System.out.println("Error");
	
	}

}
