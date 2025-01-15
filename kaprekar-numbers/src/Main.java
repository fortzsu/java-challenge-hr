public class Main {
    public static void main(String[] args) {
        kaprekarNumbers(1, 100); //1 9 45 55 99
        kaprekarNumbers(9, 9); //9
        kaprekarNumbers(45, 45); //45
        kaprekarNumbers(99, 99); //99
    }


    public static void kaprekarNumbers(int p, int q) {
        StringBuilder result = new StringBuilder();
        for (long i = p; i <= q; i++) {
            if (findDigits(i)) {
                result.append(i).append(" ");
            }
        }
        System.out.println((result.isEmpty()) ? "INVALID RANGE" : result);
    }

    private static boolean findDigits(long originalNumber) {
        long squareNumber = originalNumber * originalNumber;
        if (String.valueOf(squareNumber).length() >= 2) {
            String textSquareNumber = String.valueOf(squareNumber);
            String firstNumber = textSquareNumber.substring(0, textSquareNumber.length() / 2);
            String secondNumber = textSquareNumber.substring(textSquareNumber.length() / 2);
            return sumDigits(originalNumber, Long.parseLong(firstNumber), Long.parseLong(secondNumber));
        } else {
            return sumDigits(originalNumber, squareNumber, 0);
        }
    }

    private static boolean sumDigits(long originalNumber, long firstNumber, long secondNumber) {
        return originalNumber == (firstNumber + secondNumber);
    }
}