package Basic_problems;

public class printingallascii {

    public static void main(String[] args) {
        for (int i = 0; i <= 255; i++) {
            System.out.println("the ascii value of [" + (char) i + "=[" + i + "]]");
        }//AsciiValueOfAllChracters.java
        for (int i = 65; i <= 90; i++) {
            System.out.println("the ascii value of [" + (char) i + "=[" + i + "]]");//AsciiValueAtoZ.java
        }
    }

}
