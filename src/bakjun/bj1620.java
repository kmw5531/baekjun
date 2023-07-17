package bakjun;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class bj1620 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		sc.nextLine();
		String arr[]=new String[n+1];//27칸짜리 배열 생성 인덱스0-26
		Map<String,Integer> map = new HashMap<>();
		arr[0]="";
		for(int i=1;i<n+1;i++)
		{
			arr[i]=sc.nextLine();
		}
		
		for(int i=1;i<n+1;i++)
		{
			map.put(arr[i],i);
		}
		for(int i=0;i<p;i++)
		{
			String a = sc.nextLine();
			if(map.containsKey(a))//문자를 받는경우
				System.out.println(map.get(a));
			else
			{
				System.out.println(arr[Integer.parseInt(a)]);
			}
		}
		sc.close();
	}

}
