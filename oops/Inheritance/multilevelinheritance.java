package oops.Inheritance;

/*Multilevel Inheritance Example
When there is a chain of inheritance, it is known as multilevel inheritance. As you can see in the example given below, BabyDog class inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance. */
class bros {

    void name1() {
        System.out.println("ravi");
    }
}

class bros2 extends bros {

    void name2() {
        System.out.println("shyam");
    }
}

class bros3 extends bros2 {

    void name3() {
        System.out.println("panda");
    }

}

public class multilevelinheritance {

    public static void main(String[] args) {
        bros3 n = new bros3();
        n.name1();
        n.name2();
        n.name3();

    }

}
