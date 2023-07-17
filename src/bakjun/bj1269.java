package bakjun;
import java.util.Scanner;
import java.util.HashSet;
public class bj1269 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		HashSet<Integer>set1=new HashSet<>();
		HashSet<Integer>set2=new HashSet<>();
		HashSet<Integer>set3=new HashSet<>();
		int anw1=0;
		int anw2=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<n;i++)
		{
			set1.add(sc.nextInt());
		}
		for(int i=0;i<m;i++)
		{
			set2.add(sc.nextInt());
		}
		for(int element:set2)
		{
			if(set1.contains(element))
				count1++;
		}
		anw1=set1.size()-count1;
		for(int element:set1)
		{
			if(set2.contains(element))
				count2++;
		}
		anw2=set2.size()-count2;
		System.out.println(anw1+anw2);

	}

}
