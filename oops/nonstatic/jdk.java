package oops.nonstatic;

public class jdk {

    //jdk architecture
    /*when ever a programmer exceute the program at the run time following meomry blocks
    will be created 
    they are method area . 
    class static area  or static pool
    stack area
    heap area
     * 
     * step 1- a block of memory crearted inside the class static area , along with class name , os called as class block
     * step 2-> all the methods are multiline initlinzers (both static and non static) will be loaded the inside the method area
     * step3 ->in table will be created inside the class block 
     * step 4->all the static members present in the method area will be loaded inside the table 
     * step5 -> all the static varaibeles present inside the class will be loaded with default values inside the class block
     * step 6-> all the static initilizers both single line and multline exceute from top -bottom approach
     * step 7-> once all the static initlizers execution completed jvm will calll main method and excution execution ends at main method
     * 
     */
    static int a = 10;
    int b = 10;

    public static void main(String[] args) {
        System.out.println("hi");
        System.out.println("bye");

    }

    static {
        System.out.println("MLSI");
    }

    {
        System.out.println("MLNSI");
    }

    public void m1() {
        System.out.println("i am non static method");
    }
}
