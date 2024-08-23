package oops.staticc;

/*what is initlizer are  the start up instructions 
 * what is single line static initilizer?
 * static int a=10;
 * any static variable which is initialized in single line
 * static variable initilized in the single line is called single lone static initlizer
 */
public class demo1 {

    static int a = 20;//ssli
    static int b = 20;//ssli
    static String c;// static variable declaration stmt
    static Double D;//static varibale declarartion stmt

    public static int m1() {
        return 43;
    }

    static public String m2() {
        return "java";
    }

    public static void main(String[] args) {
        System.out.println("hi");
    }
//any block prefix by static nothing extra ,nothing less it is called multiline static initilizer

    static {
        System.out.println("hi bro");// multiline static initializer

    }

    static {
        //static context or local area
    }

}
