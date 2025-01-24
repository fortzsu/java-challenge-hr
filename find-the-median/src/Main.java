import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMedian(Arrays.asList(3, 4, 1, 7, 2, 6, 5)));
    }

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size() / 2);
    }
}