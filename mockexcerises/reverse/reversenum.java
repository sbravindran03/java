package mockexcerises.reverse;

public class reversenum {

    public static void main(String[] args) {
        int a = 46732;
        int num = 0;
        while (a != 0) {
            int remainder = a % 10;
            num = num * 10 + remainder;
            a /= 10;
        }
        System.out.println(num);
    }

}
