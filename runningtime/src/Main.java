import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(runningTime(Arrays.asList(2, 1, 3, 1, 2)));
    }

    public static int runningTime(List<Integer> arr) {
        List<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        int counter = 0;
        while (!arr.equals(sorted)) {
            for (int i = 0; i < arr.size() - 1; i++) {
                int tempFirst = arr.get(i);
                int tempSecond = arr.get(i + 1);
                if (tempFirst > tempSecond) {
                    Collections.swap(arr, i, i + 1);
                    counter++;
                }
            }
        }
        return counter;
    }


}