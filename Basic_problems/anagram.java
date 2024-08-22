package Basic_problems;
// write a a java program to check the given is anagram

import java.util.Arrays;

public class anagram {

    public static void main(String[] args) {

        String s = "Race";
        String s2 = "cAre";
        String ans = "anagram";
        s = s.toUpperCase();//RACE
        s2 = s2.toUpperCase();//CARE
        char[] a = s.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        s = new String(a);
        s2 = new String(b);
        if (s.equals(s2)) {
            System.out.println(ans);
        } else {
            System.out.println("not anagram");
        }

    }

}
