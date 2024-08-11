import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(acmTeam(Arrays.asList("10101", "11100", "11010", "00101"))); //5,2
//        System.out.println(acmTeam(Arrays.asList("10101", "11110", "00010"))); //5,1
    }

    public static List<Integer> acmTeam(List<String> topic) {
        //1-2 | 1-3 | 1-4
        //2-3 | 2-4
        //3-4
        int limit = 4;
        for (int i = 1; i <= limit; i++) {
            for (int j = i + 1; j <= limit; j++) {
                System.out.println(i + " " + j);
            }
        }


        return null;
    }
}