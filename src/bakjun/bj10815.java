package bakjun;
import java.util.HashSet;
import java.util.Scanner;
public class bj10815 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashSet<String> set1 = new HashSet<>();
		for(int i=0;i<n;i++)
		{
			String a=sc.next();
			set1.add(a);
		}
		int p=sc.nextInt();
		String arr[]=new String[p];
		for(int i=0;i<p;i++)
		{
			arr[i]=sc.next();
		}
		
		for(String element: arr)
		{
			int as=set1.contains(element)?1:0;
			System.out.println(as);
		}
	
		
		sc.close();
		}

}
