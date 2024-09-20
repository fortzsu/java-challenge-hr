public class Main {
    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 70)); //5
        System.out.println(howManyGames(20, 3, 6, 80)); //6
        System.out.println(howManyGames(20, 3, 6, 85)); //7
        System.out.println(howManyGames(100, 1, 1, 99)); //0
        System.out.println(howManyGames(100, 12, 55, 95)); //0
        System.out.println(howManyGames(100, 19, 1, 180)); //1
    }

    public static int howManyGames(int p, int d, int m, int s) {
        int counter = 0;
        for (int i = p; i >= m; i = i - d) {
            s = s - i;
            if (s >= 0) {
                counter++;
            } else {
                break;
            }
        }
        if(s <= 0) {
            return counter;
        } else {
            return counter + (s / m);
        }
    }

}

