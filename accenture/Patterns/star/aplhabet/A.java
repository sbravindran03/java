package accenture.Patterns.star.aplhabet;

public class A {

    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 1; j <= 3; j++) {

            System.out.print("*   *");
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 1; j <= 3; j++) {

            System.out.print("*   *");
            System.out.println();
        }
    }

}
