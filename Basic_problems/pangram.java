package Basic_problems;

public class pangram {
// write a java program to check the given string is pangram or not 

    /// panfram meands a sentence which contains all the letters of englis alphabets

    public static void main(String[] args) {
        String s = " the quick brown fox jumps over the lazy dogs";
        s = s.toUpperCase();
        char[] a = s.toCharArray();
        boolean[] b = new boolean[26];
        String ans = "pangram";
        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' ') {
                b[a[i] - 65] = true;
            }

        }

        for (int i = 0; i < b.length; i++) {
            if (!b[i]) {
                ans = "not pangram";
                break;
            }

        }
        System.out.println(ans);
    }

}
