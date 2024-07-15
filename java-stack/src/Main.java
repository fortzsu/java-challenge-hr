import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();

        while (scanner.hasNext()) {
            inputList.add(scanner.next());
        }

        for (String s : inputList) {
            System.out.println(checker(s));
        }

    }

    static boolean checker(String line) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < line.length(); ++i) {
            if (line.charAt(i) == '(') {
                stack.push('(');
            } else if (line.charAt(i) == '{') {
                stack.push('{');
            } else if (line.charAt(i) == '[') {
                stack.push('[');
            } else if (line.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (line.charAt(i) == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            } else if (line.charAt(i) == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}