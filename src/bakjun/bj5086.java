package bakjun;
import java.util.Scanner;
public class bj5086 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=1;
		StringBuffer sf=new StringBuffer("");
		
		
		while(b>0) {
		int A=sc.nextInt();
		int B=sc.nextInt();
		if(A==0&&B==0)break;
		else if(B%A==0) 
		{
			sf.append("factor").append("\n");;
			
		}
		else if (A%B==0) 
		{
			sf.append("multiple").append("\n");;
			
		}
		
		
		else 
		{
			sf.append("neither").append("\n");;
			
		}
		
		
		}
		System.out.println(sf.toString());
		
		

	}

}
