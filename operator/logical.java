package operator;

public class logical {
    public static void main(String[] args) {
        // if both conditions is not satisfied or one conditions is not satisfied is
        // CALLED AND
        int a = 10;
        int b = 10;
        boolean res1 = a > b && b < a;
        System.out.println(res1);
        boolean res2 = a >= b || b <= a;
        System.out.println(res2);
        boolean res3 = a >= b != b < a;
        System.out.println(res3);
    }
    // if both conditions is satisfied it is true and or one conditions is not
    // satisfied caLLED OR
    // LOGICAL AND &&
    // LOGICAL OR ||
    // LOGICAL NOT (!)
    // if both conditons are satisfied thn this operator will return true else i
    // will return false
    // (NOT):if both conditons are true iT WILL RETURN FALSE IF only one satisfied
    // it will return true //T/F=T
}
