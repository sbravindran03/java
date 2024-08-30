package basic_programs;

import java.util.Arrays;

public class stringstream {

    public static void main(String[] args) {
        String str = "i love RSV";
        long count = Arrays.stream(str.split("\\s+")).count();
        System.out.println(count);

    }

}
