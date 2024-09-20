package basic_programs;

public class fibnocii_usingmethod {

    static int n1 = 0, n2 = 1, n3;

    public static int fibnocii() {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        int result = n3;
        return result;

    }

    public static void main(String[] args) {
        int count = 10;

        System.out.print(n1 + " " + n2);
        for (int i = 3; i <= count; i++) {
            System.out.print(" " + fibnocii());

        }

    }
}
