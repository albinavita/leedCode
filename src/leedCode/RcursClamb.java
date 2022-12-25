package leedCode;

public class RcursClamb {
    public static void main(String[] args) {
        System.out.println(rec(7));
    }
    private static long rec(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n==0) {
            return 0L;
        }
        return (n == 1 || n == 2) ? 1L
                : (rec(n - 1) + rec(n - 2));
    }

}
