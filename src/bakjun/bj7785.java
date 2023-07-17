package bakjun;
import java.util.*;
public class bj7785 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[][]=new String[n][3];
		Set<String> set = new LinkedHashSet<>();
		for(int i=0;i<n;i++)
		{
			arr[i][0]=sc.next();
			arr[i][1]="";
			arr[i][2]=sc.next();
					
		}
		for(int i=0;i<n;i++)
			
		{
			if(arr[i][2].equals("enter"))
				set.add(arr[i][0]);
			else
				set.remove(arr[i][0]);
		}
		List<String> sortedList = new ArrayList<>(set);
		Collections.sort(sortedList, Collections.reverseOrder());
		for (String element : sortedList)
		{
	            System.out.println(element);
		}
		sc.close();
	

	}

}
