package mockexcerises;

public class pallindrome {

    public static void main(String[] args) {
        int n, r, sum = 0;
        int find = 1232;
        n = find;
        while (find > 0) {
            r = find % 10;
            sum = (sum * 10) + r;
            find = find / 10;

        }
        if (n == sum) {
            System.out.println("pallindrome");
        } else {
            System.out.println("not a pallindrome");
        }

    }

}
