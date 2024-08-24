package oops.nonstatic;
//with respect 3 
/*non static varaibles 
 * non static methods
 * non static initializers
 * single line non static inilizer
 * multi line non static intilizer
 what is non static variable?
 the variable which is declared or declared and initialized  in the global area and prifix with called as non stattic variable
 we cant say local variables are non static varaibles
 non static varaibles are the member of the global area 
 
 */
public class defintion {

    int a;//---non static varible declaration
    String name;//---non static varible declaration
    double b;//---non static varible declaration
    //what is non static methods

    /*any method which is not prefix with static  is called as non static  */
    //the are present inside the non static block called as non static context (they are having local area )
    public void run() {
        //non-static context or local area
        System.out.println("hi");
    }

    public int stop() {
        int b = 20;// local variable
        return 23;
    }

    //what is singleline non static initilizer 
    /*any non static varible initilized in a single line  non static intilizer
    int d =10;SLNSI---
    int b;--non static variable declaration statement;
     * what is multi line non static initilizer?
     * a block which is block not prefix with anything is called as multiline initilizer
     * the varibales which is declared or declared and initilized inside anoymous block is local variable
     * 
     * 
     * 3211223
     * 21
     */
    {
        int b = 2;//a area present int the anoymous block is called as nonstaic context , or they having local area nature

    }//---multiline non static inilizer or  anonymous block

    {
    }//---multiline non static inilizer or  anonymous block

    {
    }

    {
    }//---multiline non static inilizer or  anonymous block
}
