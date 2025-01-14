import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println(gemstones(Arrays.asList("abc","abc","bc"))); //2
//        System.out.println(gemstones(Arrays.asList("abcdde","baccd","eeabg"))); //2
        scannerMethod();
    }

    public static void scannerMethod() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        System.out.println(gemstones(arr));
        bufferedReader.close();
    }

    public static int gemstones(List<String> arr) {
        int result = 0;
        int gemCounter = 1;
        List<Character> gemChars = new ArrayList<>();
        for (int i = 0; i < arr.get(0).length(); i++) {
            char currentChar = arr.get(0).charAt(i);
            for (int j = 1; j < arr.size(); j++) {
                int tempIndex = arr.get(j).indexOf(currentChar);
                if(tempIndex != -1) {
                    gemCounter++;
                }
            }
            if(gemCounter == arr.size() && !gemChars.contains(currentChar)) {
                gemChars.add(currentChar);
                result++;
            }
            gemCounter = 1;
        }
        return result;
    }
}