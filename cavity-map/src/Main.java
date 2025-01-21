import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(cavityMap(Arrays.asList("1112", "1912", "1892", "1234"))); //1112, 1X12, 18X2, 1234
        System.out.println(cavityMap(Arrays.asList("989", "191", "111"))); //989, 1X1, 111
        System.out.println(cavityMap(Arrays.asList("111", "121", "111"))); //111, 1X1, 111
    }

    public static List<String> cavityMap(List<String> grid) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < grid.size(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid.get(i).length(); j++) {
                if (i > 0 && i < grid.size() - 1 && j > 0 && j < grid.get(i).length() - 1) {
                    if ((grid.get(i).charAt(j) > grid.get(i).charAt(j - 1)) &&
                            (grid.get(i).charAt(j) > grid.get(i).charAt(j + 1)) &&
                            (grid.get(i).charAt(j) > grid.get(i - 1).charAt(j)) &&
                            (grid.get(i).charAt(j) > grid.get(i + 1).charAt(j))) {
                        sb.append("X");
                    } else {
                        sb.append(grid.get(i).charAt(j));
                    }
                } else {
                    sb.append(grid.get(i).charAt(j));
                }
            }
            result.add(String.valueOf(sb));
        }
        return result;
    }
}