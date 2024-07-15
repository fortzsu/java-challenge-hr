import java.util.Scanner;

public class Main {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {

        int l = arr.length;
        int num = arr[arr.length - 1];


        for (int i = 0; i < l - 1; i++) {
            if (num < arr[(l - i) - 2]) {
                arr[(l - i) - 1] = arr[(l - i) - 2];
            } else if (num > arr[(l - i) - 2]) {
                arr[(l - i) - 1] = num;
                break;
            }

            for (int j = 0; j < l; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

        if (num < arr[0]) {
            arr[0] = num;
        }

        for (int j = 0; j < l; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}
