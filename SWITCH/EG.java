package SWITCH;

// switch statement 
// syntax
// switch(value /variable /expression )
// {
//  case value /expression
// [break];
// case value /expression;
// {statement} 
// [break;]
// ,
// ,
// default :
//{
//staement }
// workflow : the value /variable / expression passed in the switcb gets compared with the value passed in the case from top to bottom order ,
// if any case is satisfief the case block is exceuted and all the block present below gets exceuted  
// if no case is satisfied then theb default block gets executed 
//  for a case  we can use breka stament is optional
// note 
// long float double , boolean we cant pass switch 
// for a case we cant pass variable 
// break: break is a keyword and also used as a control statement . break is used inside the switch and loop block . when the break statmebt is exceuted control is transfered outsid ethe block 
public class EG {
    public static void main(String[] args) {
        int choice = 7;
        switch (choice) {
            case 1: {
                System.out.println("hi");
            }
                break;
            case 2: {
                System.out.println("hellow");

            }
                break;
            case 3: {
                System.out.println("hiiiiiiiii");

            }
                break;
            default: {
                System.out.println("bye ");
            }
        }
    }

}
