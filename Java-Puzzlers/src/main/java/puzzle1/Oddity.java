package puzzle1;

public class Oddity {
    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(-22));
    }
}
