package bakjun;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int B=sc.nextInt();
				
		StringBuilder result=new StringBuilder();
		while(N>0) {
			int R=N%B;
			if(R<10) result.append(R);
			else result.append((char) (R + 55));
			 N /= B;
			
			
		}
		String reversedResult = result.reverse().toString();
		System.out.println(reversedResult);
		

	}

}
