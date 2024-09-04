package oops.principlesofoops.encapsulation;

/*the process of binding states and behavior together is called as enscapsulation
in java we can achieve encapsulation "with the help of class"
what is advantage of encapsulation 
the main advantage of encapsulation is data hiding
we can achieve data hiding by using private accesss modifier
it is keyword as well access modifier 
any member which is prefix with private is not visbile outside the class
we can aceess private member only within the class 
can we private constructor ?yes we can have private constructor
private constructors not visbile outside the class
there fore object creation is not possbile outside the class
 * 
 */
 /*what is data hiding
 * the process of restricting direct access and provinding indirect access to getter method and setter methodn is called as data hiding
 here indirect is secured ,variabble validated
 gettor method setter method
 are helping for indirect access there fore we called them as helper method
 */
public class e1 {

    private class rsv {

        String shyamshirt = "blue";

        public String getcolor() {
            return shyamshirt;
        }

        public void setcolor(String shirt) {
            shyamshirt = shirt;
        }

    }

    public static void main(String[] args) {
        e1 outer = new e1();
        rsv ref = outer.new rsv();
        System.out.println(ref.getcolor());
        ref.setcolor("black");
        System.out.println(ref.getcolor());

    }

}
//we use getter method ,to get the data memeber readable 
/*
 * it should have public accesed modifier it should be non static method 
 wriiten type should be void it should be pararmetrized method 
 we use setter method to make the data member to make the writable 
  21000000000000
 */
