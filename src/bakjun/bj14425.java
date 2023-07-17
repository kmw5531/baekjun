package bakjun;
import java.util.HashSet;
import java.util.Scanner;
public class bj14425 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		int count=0;
		int n=sc.nextInt();
		int p=sc.nextInt();
		
		String arr[]=new String[p];
		
		for(int i=0;i<n;i++)
		{
			set1.add(sc.next());
		}
		sc.nextLine(); // 개행 문자 소비
	
		for(int i=0;i<p;i++)
		{
			arr[i]=sc.nextLine();
		}
		
		
		for(String element: arr)
		{
			if(set1.contains(element))
			{
				count++;
			}
		}
		System.out.println(count);
		sc.close();
		

	}

}
