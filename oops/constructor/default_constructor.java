package oops.constructor;

public class default_constructor {

    int id;
    int name;
    int num;

    public default_constructor() {
        System.out.println(id + "" + name + "" + num);

    }

    public static void main(String[] args) {
        default_constructor s1 = new default_constructor();
        default_constructor s2 = new default_constructor();

    }
}
