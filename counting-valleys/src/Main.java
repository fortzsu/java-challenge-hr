import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {

        int[] stepArray = fromPathToArray(steps, path);
        List<Integer> zeroIndexList = countZeros(stepArray);
        int valleyCounter = 0;

        for (int i = 0; i < zeroIndexList.size() - 1; i++) {
            for (int j = zeroIndexList.get(i); j < zeroIndexList.get(i + 1); j++) {
                if (stepArray[j] < 0) {
                    valleyCounter++;
                    break;
                }
            }
        }

        return valleyCounter;

    }

    private static List<Integer> countZeros(int[] stepArray) {
        List<Integer> zeroIndexList = new ArrayList<>();
        for (int i = 0; i < stepArray.length; i++) {
            if (stepArray[i] == 0) {
                zeroIndexList.add(i);
            }
        }
        return zeroIndexList;
    }

    private static int[] fromPathToArray(int steps, String path) {
        int[] stepArray = new int[steps + 1];
        int counter = 0;
        stepArray[0] = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'U') {
                counter = counter + 1;
            } else {
                counter = counter - 1;
            }
            stepArray[i + 1] = counter;
        }
        return stepArray;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
