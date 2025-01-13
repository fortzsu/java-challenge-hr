public class Main {
    public static void main(String[] args) {
        System.out.println(camelcase("oneTwoThree"));
    }

    public static int camelcase(String s) {
        int counter = 1;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }
}