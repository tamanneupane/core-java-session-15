package conversion;

public class IncrementOperator {

    public static void main(String[] args) {
        int c = 5;

        c = c + 1;
        c += 1;
        c++;
        ++c;

        System.out.println(c);
        // Pre Increment

        // Post Increment

        int m = 7;
        int n = 7;
//        ++m;
//        n++;
        int a = 2 * ++m; // now a is 16, m is 8
        int b = 2 * n++; // now b is 14, n is 8

        System.out.println(a);
        System.out.println(b);

    }
}
