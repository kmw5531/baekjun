package bakjun;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class bj2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr); // 배열 정렬

        // HashMap을 사용하여 각 요소의 빈도수 저장
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        TreeSet<Integer> modes = new TreeSet<>();

        // 최빈값 찾기
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                modes.clear();
                modes.add(key);
            } else if (frequency == maxFrequency) {
                modes.add(key);
            }
        }

        int mode;
        if (modes.size() > 1) {
            modes.pollFirst(); // 가장 작은 값을 제거하고 두 번째로 작은 값을 가져옴
            mode = modes.first();
        } else {
            mode = modes.first();
        }

        System.out.println(Math.round(sum / n)); // 첫째 줄
        System.out.println(arr[(n - 1) / 2]); // 둘째 줄
        System.out.println(mode); // 세번째 줄
        System.out.println(arr[n - 1] - arr[0]); // 네번째 줄
    }
}

