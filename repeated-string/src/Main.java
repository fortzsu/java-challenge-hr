public class Main {
    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10)); //7
        System.out.println(repeatedString("abcac", 10));//4
        System.out.println(repeatedString("a", 1000000000000L)); //1000000000000L
    }

    public static long repeatedString(String s, long n) {
        long counter = 0;
        long aCounter = 0;
        long textLength = s.length();
        long rest = n % textLength;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aCounter++;
            }
        }
        if (n % textLength != 0) {
            for (int i = 0; i < rest; i++) {
                if (s.charAt(i) == 'a') {
                    counter++;
                }
            }
        }
        counter = counter + ((n / textLength) * aCounter);
        return counter;
    }
}

