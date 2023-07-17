package bakjun;
import java.util.Scanner;

public class bj4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;

        while (true) {
            m = sc.nextInt();
            n = 2 * m;
            if (m == 0)
                break;

            int count = 0;
            for (int i = m+1; i <= n; i++) {
                if (is_prime(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static boolean is_prime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

