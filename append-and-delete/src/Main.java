public class Main {
    public static void main(String[] args) {
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9)); //Yes
        System.out.println(appendAndDelete("ashley", "ash", 2)); //No
        System.out.println(appendAndDelete("zzzzz", "zzzzzzz", 4)); //Yes
        System.out.println(appendAndDelete("abcd", "abcdert", 10)); //No
    }

    public static String appendAndDelete(String s, String t, int k) {
        String result = "No";
        int counter = 0;
        int sameCounter = 0;
        if (s.length() >= t.length()) {
            for (int i = 0; i < t.length(); i++) {
                if (s.charAt(i) == t.charAt(i)) {
                    counter++;
                } else {
                    break;
                }
            }
            if ((s.length() - counter) + (t.length() - counter) <= k) {
                result = "Yes";
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(0)) {
                sameCounter++;
            }
        }
        if (sameCounter == t.length()) {
            result = "Yes";
        }
        return result;
    }
}