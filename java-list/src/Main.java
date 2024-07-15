import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            myList.add(scanner.nextInt());
        }

        int querySize = scanner.nextInt();

        for (int i = 0; i < querySize; i++) {
            String line = scanner.next();
            if (line.equals("Insert")) {
                int index = scanner.nextInt();
                int newItem = scanner.nextInt();
                myList.add(index, newItem);
            } else {
                int removeIndex = scanner.nextInt();
                myList.remove(removeIndex);
            }
        }

        scanner.close();

        for (Integer integer : myList) {
            System.out.print(integer + " ");
        }
    }
}