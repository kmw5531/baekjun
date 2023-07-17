package bakjun;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class bj1181 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		ArrayList<String> list = new ArrayList<>();

        for (String str : arr) {          
            if (!list.contains(str)) {
                list.add(str);
            }
        }
       
		for(int i=0;i<list.size();i++) 
		{
			for(int j=0;j<list.size()-i-1;j++)
			{
				if(list.get(j).length()>list.get(j+1).length())
				{
					String temp=list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
				else if (list.get(j).length() == list.get(j + 1).length()) 
				{
                    if (list.get(j).compareTo(list.get(j + 1)) > 0) 
                    {
                        String temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
				
			}
		}
	
		System.out.println(list);
	
	}

}
