import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(beautifulTriplets(3, Arrays.asList(1, 2, 4, 5, 7, 8, 10))); //3
        System.out.println(beautifulTriplets(3, Arrays.asList(1, 6, 7, 7, 8, 10, 12, 13, 14, 19))); //2
    }

    public static int beautifulTriplets(int d, List<Integer> arr) {
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = arr.size() - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (arr.get(i) - arr.get(j) == d) {
                    for (int k = j; k >= 0; k--) {
                        if (arr.get(j) - arr.get(k) == d) {
                            List<Integer> temp = new ArrayList<>();
                            temp.add(arr.get(i));
                            temp.add(arr.get(j));
                            temp.add(arr.get(k));
                            triplets.add(temp);
                        }
                    }
                }
            }
        }
        return triplets.size();
    }
}