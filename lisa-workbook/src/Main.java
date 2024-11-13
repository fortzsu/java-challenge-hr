import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        workbook(2, 3, Arrays.asList(4,2)); //1
        System.out.println(workbook(5, 3, Arrays.asList(4, 2, 6, 1, 10))); //4
    }


    public static int workbook(int n, int k, List<Integer> arr) {
        int pageNumber = 1;
        int specialCounter = 0;
        for (Integer integer : arr) {
            int problemCounter = k;
            for (int j = 1; j <= integer; j++) {
                if (problemCounter == 0) {
                    pageNumber++;
                    problemCounter = k;
                }
                problemCounter--;
                if (pageNumber == j) {
                    specialCounter++;
                }
            }
            pageNumber++;
        }
        return specialCounter;
    }
}