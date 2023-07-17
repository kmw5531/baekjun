package bakjun;
import java.util.Scanner;
import java.util.ArrayList;
public class bj9063 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		
		for(int i=0;i<n;i++)
		{
			int p=sc.nextInt();
			list1.add(p);
			int q=sc.nextInt();
			list2.add(q);			
		}
		int Xmax=list1.get(0);
		int Ymax=list2.get(0);
		int Xmin=list1.get(0);
		int Ymin=list1.get(0);
		for(int i=0;i<n;i++)
		{
			
			if(list1.get(i)>Xmax)
			{Xmax=list1.get(i);}
			
			if(list2.get(i)>Ymax)
			{Ymax=list2.get(i);}
		}
		
		for(int i=0;i<n;i++)
		{
			if(list1.get(i)<Xmin)
			{Xmin=list1.get(i);}
			
			if(list2.get(i)<Ymin)
			{Ymin=list2.get(i);}
		}
		
		if(n==1)
		{
			System.out.println("0");
		}
		else
			System.out.println((Xmax-Xmin)*(Ymax-Ymin));
		
		

	}

}
