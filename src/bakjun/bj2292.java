package bakjun;

import java.util.Scanner;

public class bj2292 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int s=1;
		int m=1;
		int count=1;
		
		while(N>count)
		{
			if(s==1)
			{
				if(m%2==1)
				{m++;}
				else
				{
					s++;
					m--;
				}
				
			}
			else if (m==1)
			{
				if(s%2==1)
				{
					s--;
					m++;
				}
				else
				{
					s++;
				}
			}
			else if ((s+m)%2==0)
			{
				s--;
				m++;
			}
			else
			{
				s++;
				m--;
			}
			count++;
		}
		System.out.println(s+"/"+m);
	}

}
