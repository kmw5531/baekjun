package bakjun;
import java.util.Scanner;
import java.util.ArrayList;
public class bj2581 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();//소수인 수를 저장하는 리스트	
		int M=sc.nextInt();
		int N=sc.nextInt();
		int answer=0;
		int count=0;
		int count1=0;
		for(int q=M;q<=N;q++)
		{
			for(int i=1;i<=q;i++)
			{
				if(q%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				list.add(q);
			}
			count=0;					
		}
		
		for(int i=0;i<list.size();i++)
		{
			answer+=list.get(i);
		}
		if(list.isEmpty())
			System.out.println("-1");
		else
		{
		System.out.println(answer);
		System.out.println(list.get(0));
		}	
	}

}
