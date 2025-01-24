import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<List<String>> myList = new ArrayList<>();
//        myList.add(new ArrayList<>(List.of("0","a")));
//        myList.add(new ArrayList<>(List.of("1","b")));
//        myList.add(new ArrayList<>(List.of("0","c")));
//        myList.add(new ArrayList<>(List.of("1","d")));
        myList.add(new ArrayList<>(List.of("0","ab")));
        myList.add(new ArrayList<>(List.of("6","cd")));
        myList.add(new ArrayList<>(List.of("0","ef")));
        myList.add(new ArrayList<>(List.of("6","gh")));
        myList.add(new ArrayList<>(List.of("4","ij")));
        myList.add(new ArrayList<>(List.of("0","ab")));
        myList.add(new ArrayList<>(List.of("6","cd")));
        myList.add(new ArrayList<>(List.of("0","ef")));
        myList.add(new ArrayList<>(List.of("6","gh")));
        myList.add(new ArrayList<>(List.of("0","ij")));
        myList.add(new ArrayList<>(List.of("4","that")));
        myList.add(new ArrayList<>(List.of("3","be")));
        myList.add(new ArrayList<>(List.of("0","to")));
        myList.add(new ArrayList<>(List.of("1","be")));
        myList.add(new ArrayList<>(List.of("5","question")));
        myList.add(new ArrayList<>(List.of("1","or")));
        myList.add(new ArrayList<>(List.of("2","not")));
        myList.add(new ArrayList<>(List.of("4","is")));
        myList.add(new ArrayList<>(List.of("2","to")));
        myList.add(new ArrayList<>(List.of("4","the")));
        countSort(myList);
    }


    public static void countSort(List<List<String>> arr) {
        StringBuilder sb = new StringBuilder();
        int max = 0;
        for (List<String> strings : arr) {
            if(Integer.parseInt(strings.get(0)) > max) {
                max = Integer.parseInt(strings.get(0));
            }
        }
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < arr.size(); j++) {
                int indexNumber = Integer.parseInt(arr.get(j).get(0));
                if(indexNumber == i) {
                    if(j < arr.size() / 2) {
                        sb.append("-");
                    } else {
                        sb.append(arr.get(j).get(1));
                    }
                    sb.append(" ");
                }
            }
        }
        System.out.println(sb);
    }
}