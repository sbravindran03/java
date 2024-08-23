package basic_programs;

public class fibnocii_usingmethod {

    static int n1 = 0, n2 = 1, n3 = 0;

    static void fibnocii(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" " + n3);
            fibnocii(count - 1);
        }
    }

    public static void main(String[] args) {
        int count = 10;
        System.out.println(n1 + " " + n2);
        fibnocii(count - 2);
    }
}
