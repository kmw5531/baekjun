package bakjun;
import java.util.Scanner;
import java.util.HashSet;

public class bj26069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();

            if (a.equals("ChongChong") || b.equals("ChongChong")) {
                set.add(a);
                set.add(b);
            } else if (set.contains(a) || set.contains(b)) {
                set.add(a);
                set.add(b);
            }
        }

        System.out.println(set.size());
       
        }
    }


