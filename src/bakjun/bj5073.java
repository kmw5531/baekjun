package bakjun;
import java.util.*;
public class bj5073 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        int count=0;//같은 수의 개수를 저장할 변수
		while(true)
		{
			int num1 = sc.nextInt();
	        int num2 = sc.nextInt();
	        int num3 = sc.nextInt();
	        if(num1==0&&num2==0&&num3==0)
	        	break;
			
	        int max=Math.max(Math.max(num1, num2),num3);
	        int min=Math.min(Math.min(num1, num2),num3);
	        int mid=num1 + num2 + num3 - min - max;
	        
	        if(num1==num2)
	        	count++;
	        if(num2==num3)
	        	count++;
	        if(num1==num3)
	        	count++;
	              
	        if(max>=min+mid)
	        {
	        	System.out.println("Invalid");
	        	count=0;
	        	continue;
	        	
	        }
	        else if(count==3)
	        {
	        	if(max==0&&min==0&&mid==0)
	        	{	        		
	        		System.out.println("");
	        		count=0;
        	        continue;
        	    }
	        		
	        	else 
	        	{
	        		System.out.println("Equilateral");
	        		count=0;
	        		continue;
	        	}
	        	
	        }
	        else if(count==1)
	        {
	        	System.out.println("Isosceles");
	        	count=0;
	        	continue;
	        }
	        else
	        {
	        	System.out.println("Scalene");
	        	count=0;
	        	continue;
	        }
		}
		
	}

}
