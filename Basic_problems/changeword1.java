package Basic_problems;

public class changeword1 {

    public static void main(String[] args) {

        String s = " i love briyani";
        String[] sp = s.split(" ");
        //

        String ans = "";
        for (int i = 0; i < sp.length; i++) {
            if (sp[i].equals("love")) {
                sp[i] = "hate";
            }
            ans += sp[i] + " ";

        }
        System.out.println(s);
        System.out.println(ans);
    }

}
