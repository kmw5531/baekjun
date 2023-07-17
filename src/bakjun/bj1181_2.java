package bakjun;
import java.util.*;

public class bj1181_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            set.add(arr[i]);
        }

        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return Integer.compare(a.length(), b.length());
        });

        for (String str : list) {
            System.out.println(str);
        }
    }
}

