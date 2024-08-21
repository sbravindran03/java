package oops.constructor;

/*Constructor Overloading in Java
In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.

Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types. */

public class constructor_overloading {

    int idno;
    String name;
    int number;
    int age;

    public constructor_overloading(int id, String n) {
        idno = id;
        name = n;

    }

    public constructor_overloading(int i, String na, int numb) {
        idno = i;
        name = na;
        number = numb;

    }

    public constructor_overloading(int i, String na, int numb, int a) {
        idno = i;
        name = na;
        number = numb;
        age = a;

    }

    void display() {
        System.out.println(idno + "" + name + "" + "" + age + "" + number);
    }

    public static void main(String[] args) {
        parameterized_constructor s1 = new parameterized_constructor(223, "null", 230);
        parameterized_constructor s2 = new parameterized_constructor(233, "null", 230);

    }

}
