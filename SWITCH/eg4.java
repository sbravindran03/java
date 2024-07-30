package SWITCH;

import java.util.Scanner;

// display a menu where the user will have following options 
// idly , dosa , vada , tea 
//  user can select  anyone of the following 
//  if the user select 1 -print idly on the way
//  if the user select 2 -print dosa on the way
// //  if the user select 3 -print vada on the way
//  if the user select 4 -print tea on the way
// default invalid option
public class eg4 {
    public static void main(String[] args) {
        Scanner food = new Scanner(System.in);
        System.out.println("choose :idly(1) , dosaa(2) , vada(3) , tea(3)");
        int res = food.nextInt();
        switch (res) {
            case 1: {
                System.out.println("idly pn the way");

            }
                break;
            case 2: {
                System.out.println("dosa on the way");

            }
                break;
            case 3: {
                System.out.println("vada on the way");

            }
                break;
            case 4: {
                System.out.println("tea on the way");

            }
                break;
            default: {
                System.out.println("invalid option");
            }

        }
    }

}
