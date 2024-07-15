import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String[] myStrings;

        myStrings = s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+");
        int length = myStrings.length;
        if (s.isBlank()) {
            length = 0;
        }
        System.out.println(length);
        for (String myString : myStrings) {
            System.out.println(myString);
        }
    }
}