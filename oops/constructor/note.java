package oops.constructor;
//inside all the constructor bodies the compiler will add some instructions called as load instructions 
/*
 * load instructions will be add as the first instructions
 the job load load instructions is to load al the non static memebemrs 
 whatever after after the load instructions is considered as program written instructions
 
 */

public class note {

    public note() {
        System.out.println("hi");

    }

    note(int a) {
        System.out.println("bye");
        System.out.println("java");

    }

}
/*inside static block we should access non static resource only with th help of object refrence . */
