package recursion;

public class rec {
    // a method a calling itself is called recursion
    // during recurison there is a possiblity run time error called as stack over
    // flow error
    public static void main(String[] args) {
        System.out.println("hi ji");
        display();
    }

    public static void display() {
        System.out.println("hi bro");
        display();// if remove this line it will print properly
        System.out.println("bye");
        // error will come called as stack over flow error
    }

}
