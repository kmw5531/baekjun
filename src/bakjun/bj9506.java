package bakjun;
import java.util.ArrayList;
import java.util.Scanner;
public class bj9506 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String a="";
		int k=0;//약수의 합을 저장할 변수
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<N;i++)
		{
			if(N%i==0)
			{
				list.add(i);
			}
		}
		for(int i=0;i<list.size();i++)
		{
			k+=list.get(i);
			
		}
		
		if(N==k)
		{
			System.out.print(N+"=");
			for(int i=0;i<list.size();i++)
			{
				System.out.print(list.get(i));
				if(i<list.size()-1) 
				{
					System.out.print("+");
				}
				
			}
		}
		else if(N==-1)
		{
			System.out.println();
		}
		else
			System.out.println(N+"is NOT perfect");
		}

	

}
