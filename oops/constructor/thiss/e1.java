package oops.constructor.thiss;
//this is a keyword  we use this keyword only inside the non static block 
// this keyword contains current executing object address we use this keyword whwnver local varaible name , and global variables are same  
//using object refrence we can access both static and non static memebers

public class e1 {

    public e1() {
        //whenever a class is exceeding another class or inheriting another class 
        //super call stmt is added inside a child class constructor by a compiler
        class A {

            int x = 10;

            A() {
                System.out.println("hi bro");
            }

        }
        class B extends A {

            int y = 20;

            public B() {
                super();
                System.out.println("hi ");
            }

        }

    }

}
//whenver this call is added this call is removed 
//super class stmt is also helps to load parent class non static members into the child class object
//super class stmt also help to pass the data member for the initialization of parent class
//difference between this call stmt and super call stmt 
