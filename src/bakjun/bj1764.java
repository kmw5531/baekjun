package bakjun;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
public class bj1764 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.nextLine();
		HashSet<String> set=new HashSet<>();
		HashSet<String> set2=new HashSet<>();
		HashSet<String> set3=new HashSet<>();
		int count=0;
		for(int i=0;i<n;i++)
		{
			String a=sc.next();
			set.add(a);
		}
		for(int i=0;i<m;i++)
		{
			String b=sc.next();
			set2.add(b);
		}
		for (String element : set) {
		    if(set2.contains(element))
		    	{
		    	count++;
		    	set3.add(element);
		    	}
		    
		}
		ArrayList<String> list = new ArrayList<>(set3);
		Collections.sort(list);//
		System.out.println(count);
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println();
	}

}
