package bakjun;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//시간초과가 뜸
public class Test4134 {
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      long n = Long.parseLong(br.readLine());
      for(int i = 0; i < n; i++){
          int num = Integer.parseInt(br.readLine());
          int a = test4143.cal(num);
          bw.write(String.valueOf(a));
          bw.newLine();
      }
      bw.flush();
      br.close();
      bw.close();

  }

}
class test4143{
  static int cal(int num) {
      int count = 0;
      for (int j = 1; j <=Math.sqrt(num); j++) {
          if (num % j == 0) {
              count++;
          }
          if (count > 2) {
              return cal(num + 1);
          }
      }
      return num;
  }
}