package bakjun;
import java.util.Scanner;
public class bj11650 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[][]=new String[n][3];
		for(int i=0;i<n;i++)
		{
			arr[i][0]=sc.next();
			arr[i][1]=" ";
			arr[i][2]=sc.next();
		}
		 for (int i = 0; i < n - 1; i++) 
		 { 
		        for (int j = 0; j < n - i - 1; j++)
		        {
		        	if(int(arr[i][j])>int(arr[i][j+1]))
		        		int temp=arr[i][j];
		        	
		        }
		 }
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}	
		
	}
}
