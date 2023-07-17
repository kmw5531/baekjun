package bakjun;
import java.util.Scanner;
public class bakjun1 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String N=scan.next();
		int B=scan.nextInt();
		int sum=0;
		int c;//c는 각 인덱스의 값에 진법을 곱한 수를 저장하는 변수
		
		StringBuffer sb=new StringBuffer(N);
		String reverse=sb.reverse().toString();
		
		
		for(int i=0; i<N.length();i++) {
			if(reverse.charAt(i)>='A'&&reverse.charAt(i)<='Z')
				c=reverse.charAt(i)-55;
			else
				c=reverse.charAt(i)-'0';
			sum+=(c*(Math.pow(B,i)));
		
				
		}
		System.out.println(sum);
	}

}
