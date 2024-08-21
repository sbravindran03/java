package oops.Inheritance;

class animal {

    void voice() {
        System.out.println("animals");
    }
}

class dog extends animal {

    void dogvoice() {
        System.out.println("barking");
    }
}

class cat extends animal {

    void catvoice() {
        System.out.println("meow");
    }
}

public class heirachical {

    public static void main(String[] args) {
        cat v = new cat();
        dog b = new dog();

        v.catvoice();
        b.dogvoice();
        v.voice();

    }

}
