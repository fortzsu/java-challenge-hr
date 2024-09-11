public class Main {
    public static void main(String[] args) {
        System.out.println(taumBday(3, 5, 3, 4, 1)); //29
        System.out.println(taumBday(10, 10, 1, 1, 1)); //20
        System.out.println(taumBday(5, 9, 2, 3, 4)); //37
        System.out.println(taumBday(3, 6, 9, 1, 1)); //12
        System.out.println(taumBday(7, 7, 4, 2, 1)); //35
        System.out.println(taumBday(3, 3, 1, 9, 2)); //12
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long sumOfChanges = 0;
        if (bc - z > wc) {
            while (b > 0) {
                b--;
                w++;
                sumOfChanges = sumOfChanges + z;
            }
        } else if(wc - z > bc) {
            while (w > 0) {
                w--;
                b++;
                sumOfChanges = sumOfChanges + z;
            }
        }

        return ((long) b * bc) + ((long) w * wc) + sumOfChanges;
    }


}