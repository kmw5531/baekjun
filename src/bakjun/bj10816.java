package bakjun;
import java.util.Scanner;
import java.util.HashSet;
public class bj10816 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		HashSet<Integer> set=new HashSet<>();//4번째줄에 입력되는 수들
		HashSet<Integer> set2=new HashSet<>();//2번째 줄에 입력되는 수들
		int count=0;
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int p=sc.nextInt();
		for(int i=0;i<p;i++)
		{
			int a=sc.nextInt();
			set.add(a);
		}
		for(int i=0;i<n;i++)
		{
			set2.add(arr[i]);
		}	
		for (Integer element : set) {
		    if(set2.contains(element))
		    {System.out.println(element);}
		    else
		    	System.out.println("0");
		}
		
		


	}

}
