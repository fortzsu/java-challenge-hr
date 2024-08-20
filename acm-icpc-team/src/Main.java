import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(acmTeam(Arrays.asList("10101", "11100", "11010", "00101"))); //5,2
        System.out.println(acmTeam(Arrays.asList("10101", "11110", "00010"))); //5,1
    }

    public static List<Integer> acmTeam(List<String> topic) {
        List<Integer> maxs = new ArrayList<>();
        int limit = topic.size();
        for (int i = 1; i <= limit; i++) {
            for (int j = i + 1; j <= limit; j++) {
                List<String> temp = new ArrayList<>();
                temp.add(topic.get(i - 1));
                temp.add(topic.get(j - 1));
                maxs.add(countTopics(temp));
            }
        }
        return findMax(maxs);
    }

    public static Integer countTopics(List<String> temp) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < temp.get(0).length(); i++) {
            int counter = 0;
            if ((temp.get(0).charAt(i) == '1') || (temp.get(1).charAt(i) == '1')) {
                counter++;
            }
            result.add(counter);
        }
        return countOnes(result);
    }

    public static int countOnes(List<Integer> ones) {
        int counter = 0;
        for (Integer i : ones) {
            if (i == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static List<Integer> findMax(List<Integer> numbers) {
        List<Integer> finalNumbers = new ArrayList<>();
        int max = 0;
        int maxCounter = 0;
        for (Integer i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        for (Integer i : numbers) {
            if (i == max) {
                maxCounter++;
            }
        }
        finalNumbers.add(max);
        finalNumbers.add(maxCounter);
        return finalNumbers;
    }
}