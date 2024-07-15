import java.io.*;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        LocalDate myDate;
        if (year <= 1917) {
            if (year % 4 == 0 && year % 100 == 0) {
                myDate = Year.of(year).atDay(255);
            } else {
                myDate = Year.of(year).atDay(256);
            }
        } else if (year == 1918) {
            myDate = Year.of(1918).atDay(269);
        } else {
            myDate = Year.of(year).atDay(256);
        }
        return myDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}