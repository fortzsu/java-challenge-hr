import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumDistances(Arrays.asList(3, 2, 1, 2, 3))); //2
        System.out.println(minimumDistances(Arrays.asList(7, 1, 3, 4, 1, 7))); //3
        System.out.println(minimumDistances(Arrays.asList(1, 2, 3, 4, 10))); //-1
    }

    public static int minimumDistances(List<Integer> a) {
        int minimumDistance = a.size();
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    if (j - i < minimumDistance) {
                        minimumDistance = j - i;
                    }
                }
            }
        }
        if (minimumDistance == a.size()) {
            minimumDistance = -1;
        }
        return minimumDistance;
    }
}