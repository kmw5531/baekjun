package bakjun;
import java.io.*;
public class bj1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(rd.readLine());
		int count=1;
		int num=666;
		String snum=Integer.toString(666);
		while(count!=n)
		{
			num++;
			if(Integer.toString(num).contains(snum))
			{count++;}
		}
		System.out.println(num);

	}

}
