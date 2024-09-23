package String_programs.stringimmutables;

public class e1 {
    // public static void String immutables(String n, String b){

    // }
    public static void main(String[] args) {
        String str1 = "chandru";
        String str2 = str1;
        str1 = str2 + "kamesh";
        if (str1 == str2) {
            System.out.println("it is not a immutable");
        } else {
            System.out.println("it is immutable");
        }

    }

}
