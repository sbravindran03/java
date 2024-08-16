package oops.constructor;

public class parameterized_constructor {

    public parameterized_constructor(int id, String name, long num) {
        System.out.println(id + "" + name + "" + num);

    }

    public static void main(String[] args) {
        parameterized_constructor s1 = new parameterized_constructor(233, "ravi", 7786868);
        parameterized_constructor s2 = new parameterized_constructor(2332, "ll", 233440);

    }
}
