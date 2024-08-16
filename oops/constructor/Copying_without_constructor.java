package oops.constructor;

public class Copying_without_constructor {
    int id;
    int number;
    String name;

    public Copying_without_constructor(int i, String n, int num) {
        id = i;
        number = num;
        name = n;
    }

    Copying_without_constructor() {

    }

    void display() {
        System.out.println(id + "" + "" + name + "" + number);
    }

    public static void main(String[] args) {
        Copying_without_constructor s1 = new Copying_without_constructor(233, "null", 2330);
        Copying_without_constructor s2 = new Copying_without_constructor();
        s2.id = s1.id;
        s2.name = s1.name;
        s2.number = s1.number;
        s1.display();
        s2.display();
    }

}
