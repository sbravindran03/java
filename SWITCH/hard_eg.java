package SWITCH;

// it is a switch statemnt example by dynamicread  method 
import java.util.Scanner;

public class hard_eg {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your choice");
            int res = sc.nextInt();
            switch (res) {
                case 1: {
                    System.out.println("hello bro");

                }
                    break;
                case 2: {
                    System.out.println("bye bro");

                }
                    break;
                case 3: {
                    System.out.println("tq bro");

                }
                    break;
                case 4: {
                    System.out.println("nice bro");

                }
                    break;
                default: {
                    System.out.println("wow bro");
                }
            }

        }
    }

}
