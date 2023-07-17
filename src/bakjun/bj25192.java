package bakjun;
import java.util.Scanner;
import java.util.HashSet;
public class bj25192 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<String> set=new HashSet<>();
		int an=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String input=sc.next();
			
			if(input.equals("ENTER"))
			{
				an=an+set.size();
				set.clear();
			}
			else {
			set.add(input);
			}
		}
			System.out.println(an+set.size());
		
		}
		

	}


