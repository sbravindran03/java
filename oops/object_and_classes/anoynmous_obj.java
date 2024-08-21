package oops.object_and_classes;

public class anoynmous_obj {

    // /*
    // * What are the different ways to create an object in Java?
    // * There are many ways to create an object in java. They are:
    // *
    // * By new keyword
    // * By newInstance() method
    // * By clone() method
    // * By deserialization
    // * By factory method etc.
    // */
    // /*
    // * If you have to use an object only once, an anonymous object is a good
    // * approach. For example:
    // * new Calculation();//anonymous object
    // * calling method through reference
    // * Calculation c = new Calculation();
    // * c.fact(5);
    // * Calling method through an anonymous object
    // * new Calculation().fact(5);
    // */
    public anoynmous_obj(int n) {// i am using constructor here
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println("the factorial is " + fact);

    }

    public static void main(String[] args) {
        new anoynmous_obj(5);
    }

}
// package oops.object_and_classes;

// class anoynmous_obj {
// void fact(int n) {
// int fact = 1;
// for (int i = 1; i <= n; i++) {
// fact = fact * i;
// }
// System.out.println("factorial is " + fact);
// }
// public static void main(String args[]) {
// new anoynmous_obj().fact(5);// calling method with anonymous object
// }
// }
