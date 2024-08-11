import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(equalizeArray(Arrays.asList(1, 2, 2, 3))); //2
        System.out.println(equalizeArray(Arrays.asList(3, 3, 2, 1, 3))); //2
    }

    public static int equalizeArray(List<Integer> arr) {
        Collections.sort(arr);
        Long max = 0L;
        Map<Integer, Long> myMap =
                arr.stream().collect(Collectors.groupingBy(element -> element, Collectors.counting()));
        for (Integer key : myMap.keySet()) {
            if (max < myMap.get(key)) {
                max = myMap.get(key);
            }
        }
        return (int) (arr.size() - max);
    }
}