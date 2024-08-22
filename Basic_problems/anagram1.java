package Basic_problems;

import java.util.Arrays;

public class anagram1 {

    public static Boolean ana(String s1, String s2) {
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        s1 = new String(a);
        s2 = new String(b);
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);

    }

    public static void main(String[] args) {
        String s1 = "caRE";
        String s2 = "race";
        if (ana(s1, s2)) {
            System.out.println("anagram");

        } else {
            System.out.println("not anagram");
        }
    }

}
