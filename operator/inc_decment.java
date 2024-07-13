package operator;

public class inc_decment {

    public static void main(String[] args) {
        // by using increment and decrement operator we can increase or decrease value
        // of the variable by one unit
        // increment operator-> preincremnt (++var) ________post increment(var++)
        // Decrement operator-> predecremnt (--var) ________post Decrement(var--)
        // increment operator(++)
        // i) pre increment operator (++)
        // step 1 > increase the value of the variable by unit & update
        // step 2> subsititute the updated value insithede expression
        int a = 10;
        int b = 20;
        int result = ++a + 6 + ++b;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        System.out.println(++a);
        System.out.println(++b);
        System.out.println(++a + ++b);
    }
}
