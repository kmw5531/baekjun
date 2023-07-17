package bakjun;
import java.util.Scanner;
public class bj1943 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
			arr2[i]=sc.nextInt();
			
		}
		 for (int i = 0; i < n; i++) {
	            int count = 1; 
	            if (arr1[i] > arr2[i]) {
	                while ((arr1[i] * count) % arr2[i] != 0) {
	                    count++;
	                }
	                System.out.println(arr1[i] * count);
	            } else if (arr1[i] < arr2[i]) {
	                while ((arr2[i] * count) % arr1[i] != 0) {
	                    count++;
	                }
	                System.out.println(arr2[i] * count);
	            } else {
	                System.out.println(arr1[i]); // arr1[i]와 arr2[i]가 같은 경우
	            }
	        }
	    }
	}
	







