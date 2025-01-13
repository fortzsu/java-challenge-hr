public class Main {
    public static void main(String[] args) {
        System.out.println(funnyString("lmnop")); //Funny
        System.out.println(funnyString("bcxz")); //Not Funny
        System.out.println(funnyString("acxz")); //Funny
    }


    public static String funnyString(String s) {
        String result = "Funny";
        for (int i = 0, j = s.length() - 1; i <= s.length() - 2; i++, j--) {
            int tempSimple = s.charAt(i);
            int tempSimplePlusOne = s.charAt(i + 1);
            int tempReverse = s.charAt(j);
            int tempReverseMinusOne = s.charAt(j - 1);
            if (Math.abs(tempSimple - tempSimplePlusOne) != Math.abs(tempReverse - tempReverseMinusOne)) {
                result = "Not Funny";
                break;
            }
        }
        return result;
    }
}