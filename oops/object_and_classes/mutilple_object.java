package oops.object_and_classes;

/*//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods */
public class mutilple_object {

    int account;
    float amount;
    String name;

    void bank(int a, float amt, String n) {
        account = a;
        amount = amt;
        name = n;

    }

    // deposit
    void deposit(float amt) {
        amount = amount + amt;
        System.out.println(amt + "deposited");
    }

    // withdraw
    void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("insuffient balnce");

        } else {
            amount = amount - amt;
            System.out.println(amt + "withdrawn");
        }

    }

    void checkbalance() {
        System.out.println("balance is " + amount);

    }

    void display() {
        System.out.println(name + "" + amount + "" + account);
    }

    public static void main(String[] args) {
        mutilple_object a1 = new mutilple_object();
        a1.bank(121222, 999999999, "ravindran sb  ");
        a1.deposit(100000);
        a1.withdraw(100000);
        a1.display();
        a1.checkbalance();

    }

}
