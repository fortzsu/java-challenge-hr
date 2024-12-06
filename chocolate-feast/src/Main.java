public class Main {

    public static void main(String[] args) {
        System.out.println(chocolateFeast(15, 3, 2)); //9
        System.out.println(chocolateFeast(7, 3, 2)); //3
        System.out.println(chocolateFeast(21816, 14645, 1827)); //1
        System.out.println(chocolateFeast(6, 2, 2)); //5
        System.out.println(chocolateFeast(16809, 123, 11668)); //136
        System.out.println(chocolateFeast(1575, 1, 262)); //1581
    }

    public static int chocolateFeast(int n, int c, int m) {
        n = n / c;
        int result = n;
        while (n >= m) {
            result = result + (n / m);
            n = (n / m) + (n % m);
        }
        return result;
    }
}
