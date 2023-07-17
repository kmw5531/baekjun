package bakjun;
import java.util.Scanner;
import java.util.Arrays;
public class bj2485 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr2[]=new int[n-1];
		int sh=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			arr2[i]=arr[i+1]-arr[i];
		}
		
		int min1 = arr2[0];
		for (int i = 1; i < arr2.length; i++) 
		{
			if (arr2[i] < min1) {
                min1 = arr2[i];
            }
	    }
		for(int i=2;i<=min1;i++)
		{
			if(min1%i==0)
			{
				sh=i;
				break;
			}
				
		}	
		System.out.println(((arr[n-1]-arr[0])/sh+1)-n);

	}

}
