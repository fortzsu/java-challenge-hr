import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(climbingLeaderboard(Arrays.asList(100, 90, 90, 80), Arrays.asList(70, 80, 105))); //4,3,1

    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer playerCurrentRank : player) {
            List<Integer> setOfCurrentScores = ranked.stream().flatMap(e -> Stream.of(e, playerCurrentRank)).distinct().sorted().collect(Collectors.toList());
            resultList.add((setOfCurrentScores.size() - setOfCurrentScores.indexOf(playerCurrentRank)));
        }
        return resultList;
    }



}