package Basic_problems;

public class sorting0_1_2 {
    // sort the array numbers 0's 1's 2's

    public static void ZOS(int a[], int n) {
        int c0 = 0, c1 = 0, c2 = 0;
        // count 0,1,2
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                c0 += 1;
            } else if (a[i] == 1) {
                c1 += 1;

            } else {
                c2 += 1;
            }

        }
        int num = 0;// it acts a storing variable
        for (int i = 0; i < c0; i++) {
            a[num++] = 0;

        }
        for (int i = 0; i < c1; i++) {
            a[num++] = 1;
        }
        for (int i = 0; i < c2; i++) {
            a[num++] = 2;
        }

    }

    public static void main(String[] args) {
        int[] a = { 2, 0, 0, 1, 0, 1, 1, 2, 1, 2, 2, 1 };
        int n = a.length;
        ZOS(a, n);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }

}
