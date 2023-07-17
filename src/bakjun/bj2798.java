package bakjun;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class bj2798 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer>list=new ArrayList<Integer>();
		ArrayList<Integer>sumlist=new ArrayList<Integer>();
		ArrayList<Integer>smalllist=new ArrayList<Integer>();
		ArrayList<Integer>biglist=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			list.add(a);
		}
		for(int i=0;i<=n-3;i++)
			for(int j=i+1;j<=n-2;j++)
				for(int k=j+1;k<=n-1;k++)
				{
					int b=list.get(i)+list.get(j)+list.get(k);
					sumlist.add(b);
				}
		for(int i=0;i<sumlist.size();i++)
		{
			if(sumlist.get(i)<m)
				smalllist.add(sumlist.get(i));
				
			else
				biglist.add(sumlist.get(i));
			
		}
		Collections.sort(smalllist);//정렬
		Collections.sort(biglist);//정렬

		int s=m-smalllist.get(smalllist.size()-1);
		int B=biglist.get(0)-m;
		for(int i=0;i<sumlist.size();i++)
		{
			if(sumlist.get(i)==m)
			{
				System.out.println(sumlist.get(i));
				return;
			}		
		}
		if(s<B)
		{
			System.out.println(smalllist.get(smalllist.size()-1));
		}
		else
			System.out.println(biglist.get(0));
		
			
		}

}
