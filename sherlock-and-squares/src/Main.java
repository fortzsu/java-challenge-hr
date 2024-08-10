public class Main {
    public static void main(String[] args) {
        System.out.println(squares(24, 49)); //3
        System.out.println(squares(17, 24)); //0
        System.out.println(squares(11, 734)); //24
        System.out.println(squares(228, 919)); //15
        System.out.println(squares(71, 188)); //5
    }


    public static int squares(int a, int b) {
        int first = 0;
        int counter = 0;
        for (int i = a; i <= b; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                first = (int) Math.sqrt(i);
                break;
            }
        }
        if (first != 0) {
            while ((first * first) <= b) {
                first++;
                counter++;
            }
        }
        return counter;
    }
}