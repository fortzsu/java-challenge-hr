import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(lonelyInteger(Arrays.asList(1, 2, 3, 4, 3, 2, 1))); //4
        System.out.println(lonelyInteger(Arrays.asList(1, 2, 3, 4, 3, 2, 4))); //1
        System.out.println(lonelyInteger(Arrays.asList(1, 2, 3, 1, 4, 2, 4))); //3
        System.out.println(lonelyInteger(Arrays.asList(0, 0, 1, 2, 1))); //2
        System.out.println(lonelyInteger(Arrays.asList(1, 1, 2))); // 2
        System.out.println(lonelyInteger(Arrays.asList(34, 95, 34, 64, 45, 95, 16, 80, 80, 75, 3, 25, 75, 25, 31, 3, 64, 16, 31))); //45
    }

    public static int lonelyInteger(List<Integer> a) {
        Collections.sort(a);
        int result = 0;
        int counter = 1;
        if (a.size() == 1) {
            result = a.get(0);
        } else {
            if (!a.get(0).equals(a.get(1))) {
                result = a.get(0);
            } else if (!a.get(a.size() - 2).equals(a.get(a.size() - 1))) {
                result = a.get(a.size() - 1);
            } else {
                for (int i = 0; i < a.size() - 1; i++) {
                    if (a.get(i).equals(a.get(i + 1))) {
                        counter++;
                    } else {
                        if (counter == 1) {
                            result = a.get(i);
                            break;
                        } else {
                            counter = 1;
                        }
                    }
                }
            }
        }
        return result;
    }
}