package bakjun;
import java.util.ArrayList;
import java.util.Scanner;
public class bj1978 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list1=new ArrayList<Integer>();		
		int count=0;//list1의 원소들의 각각의 약수 개수 저장
		int count2=0;//소수의 수 저장
		int N=sc.nextInt();
		for(int i=0;i<N;i++)
		{
			int t=sc.nextInt();
			list1.add(t);			
		}
		for(int i=0;i<list1.size();i++)
		{
			for(int j=1;j<=list1.get(i);j++)
			{
				if(list1.get(i)%j==0)
				{count++;}
			}	
			if(count==2)
			{count2++;}		
			count=0;
		}
		
		System.out.println(count2);

	}

}
