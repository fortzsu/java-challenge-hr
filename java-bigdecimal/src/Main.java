import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        for (int i = 1; i < s.length - 2; i++) {
            for (int j = i; j >= 1; j--) {
                if (new BigDecimal(s[j]).compareTo(new BigDecimal(s[j - 1])) > 0) {
                    String temp = s[j];
                    s[j] = s[j - 1];
                    s[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}