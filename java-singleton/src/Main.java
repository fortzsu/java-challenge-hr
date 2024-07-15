public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


class Singleton {

    static Singleton instance = new Singleton();

    public String str;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        return instance;
    }

}