package METHODS;

// the main advantage of the method is reusable
// a class having same name but with diffrentb arguments is called methodloading
public class methodoverloading {

    public static void main(String[] args) {
        System.out.println("hello main");
        dinga(23.f);
        dinga(22);
        dinga("shyam");
    }

    public static void dinga(String str) {
        System.out.println("RAGU");
    }

    public static void dinga(int x, float y) {
        System.out.println(223);
    }

    public static void dinga(float a) {
        System.out.println("java");

    }

}
