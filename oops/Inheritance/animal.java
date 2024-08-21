package oops.Inheritance;
//single inheritance

class animal {

    void eat() {
        System.out.println("eats bone");
    }

}

class Dogs extends animal {

    void voice() {
        System.out.println("barking");
    }
}

class singleinheritance {

    public static void main(String[] args) {
        Dogs s1 = new Dogs();
        Dogs s2 = new Dogs();
        s1.eat();
        s2.voice();

    }

}
