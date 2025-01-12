public class Main {

    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSOSSOS")); //0
        System.out.println(marsExploration("SOSSOT")); //1
        System.out.println(marsExploration("SOSSPSSQSSOR")); //3
    }

    public static int marsExploration(String s) {
        int result = 0;
        String original = "SOS";
        for (int i = 0, j = 0; i < s.length(); i++, j++) {
            if(j == 3) {
                j = 0;
            }
            if(s.charAt(i) != original.charAt(j)) {
                result++;
            }
        }
        return result;
    }
}
