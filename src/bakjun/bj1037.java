package bakjun;
import java.util.Scanner;
import java.util.ArrayList;
public class bj1037 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>list=new ArrayList<>();
		int max=0;
		int min=0;
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		max=list.get(0);
		
		for(int i=0;i<n;i++)
		{
			
			if(max<list.get(i))
				max=list.get(i);
		}
		
		min=list.get(0);
		for(int i=0;i<n;i++)
		{
			
			if(min>list.get(i))
				min=list.get(i);
		}
		
		System.out.println(max*min);

	}

}
