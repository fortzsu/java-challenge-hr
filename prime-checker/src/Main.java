import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public void checkPrime(int... n1) {

        int counter = 0;
        Map<Integer, Integer> myMap = new LinkedHashMap<>();
        List<Integer> primes = new ArrayList<>();

        for (int i : n1) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && counter < 3 && i != 1) {
                    counter++;
                    myMap.put(i, counter);
                }
            }
            counter = 0;
        }

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if (entry.getValue() <= 2) {
                primes.add(entry.getKey());
            }
        }

        for (Integer prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();

    }
}