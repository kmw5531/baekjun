package bakjun;
import java.util.Scanner;
public class b4134j {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int an = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            long number = arr[i];
            while (true) {
                number++;
                if (isPrime(number)) {
                    System.out.println(number);
                    break;
                }
            }
        }
    }

    // 소수인지 확인하는 메서드
    private static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


