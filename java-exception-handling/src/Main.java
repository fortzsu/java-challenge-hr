import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyCalculator calc = new MyCalculator();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            try {
                System.out.println(calc.power(n, p));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class MyCalculator {

    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("java.lang.Exception: n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("java.lang.Exception: n and p should not be zero.");
        } else {
            return (long) Math.pow(n, p);
        }

    }

}