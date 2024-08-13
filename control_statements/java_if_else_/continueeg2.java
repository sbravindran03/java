package control_statements.java_if_else_;

public class continueeg2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 2 && j == 2) {
                    continue;
                }
                System.out.println(i + "" + j);
            }
        }
    }

}
