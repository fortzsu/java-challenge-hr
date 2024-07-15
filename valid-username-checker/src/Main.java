import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        List<String> usernames = new ArrayList<>();
        String empty = scanner.nextLine();

        for (int i = 0; i < length; i++) {
            usernames.add(scanner.nextLine());
        }

        String regex = "^[a-zA-Z]\\w{7,29}$";
        Pattern pattern = Pattern.compile(regex);

        for (String username : usernames) {
            Matcher matcher = pattern.matcher(username);
            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}