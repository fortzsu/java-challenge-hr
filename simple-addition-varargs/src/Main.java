import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Add add = new Add();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        add.add(array[0], array[1]);
        add.add(array[0], array[1], array[2]);
        add.add(array[0], array[1], array[2], array[3], array[4]);
        add.add(array[0], array[1], array[2], array[3], array[4], array[5]);
    }
}

class Add {

    public void add(int... myInt) {
        String myString = String.valueOf(myInt[0]);
        for (int i = 1; i < myInt.length; i++) {
            myString = myString + "+" + myInt[i];
        }
        System.out.println(myString + "=" + sum(myInt));
    }

    private int sum(int... myInts) {
        int sum = 0;
        for (int myInt : myInts) {
            sum = sum + myInt;
        }
        return sum;
    }
}