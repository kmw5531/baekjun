package bakjun;
import java.util.Scanner;
public class bj1735 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();//2
		int b=sc.nextInt();//7
		int c=sc.nextInt();//3
		int d=sc.nextInt();//5
		int count=1;
		int t=0;
		if(b<d)
		{
			while (!((d*count)%b==0)) {
                count++;
            }
			t=d*count;
		}
		else if(b>d)
		{
			while (!((b*count)%d==0)) {
                count++;
            }
			t=b*count;
			
		}
		int answ=(t/b)*a+(t/d)*c;
		if(t%answ==0)
			System.out.println();
		System.out.println(answ+" "+t);
	}


}
