package bakjun;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class bj3009 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list1=new ArrayList<Integer>();//x값 저장하는 리스트
		ArrayList<Integer> list2=new ArrayList<Integer>();//y값 저장하는 리스트
		for(int i=0;i<3;i++)
		{
			int n=sc.nextInt();
			list1.add(n);
			int c=sc.nextInt();
			list2.add(c);
			
		}
		
		if(list1.get(0).equals(list1.get(1)))
		{
			System.out.print(list1.get(2)+" ");
		}
		else if(list1.get(1).equals(list1.get(2)))
		{
			System.out.print(list1.get(0)+" ");
		}
		else
			System.out.print(list1.get(1)+" ");
		
		
		if(list2.get(0).equals(list2.get(1)))
		{
			System.out.print(list2.get(2));
		}
		else if(list2.get(1).equals(list2.get(2)))
		{
			System.out.print(list2.get(0));
		}
		else
			System.out.print(list2.get(1));
		
		
	}

}
