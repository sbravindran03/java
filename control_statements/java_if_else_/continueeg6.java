package control_statements.java_if_else_;

public class continueeg6 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5)
                i++;
            continue;

        }
        System.out.println(i);
        i++;
    }

}
