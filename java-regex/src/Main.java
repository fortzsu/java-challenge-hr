import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> IPAddresses = new ArrayList<>();
        while (scanner.hasNext()) {
            IPAddresses.add(scanner.next());
        }
        scanner.close();

        String regexA = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(.)";
        String regexB = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(.)";
        String regexC = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(.)";
        String regexD = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

        String totalRegex = regexA + regexB + regexC + regexD;

        Pattern pattern = Pattern.compile(totalRegex);

        for (String ipAddress : IPAddresses) {
            Matcher matcher = pattern.matcher(ipAddress);
            System.out.println(matcher.matches());
        }
    }
}