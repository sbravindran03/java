package array_.mutidimensional;

public class intro {
    // two types of array
    // single deminsional
    // multi demensional-one array present inside another multi dimesinal array
    // dynamic way
    // static way

    /*
     * Dynamic way of array creation:
     * SYNTAX:datatype[][] variable ----declaration of multi demensional array
     * Syntax: dataype [] variable[] =new datatype [rowsize][columnsize]
     * ---declaration and initialzation of multi demsional array
     * 
     * Syntax: variable =new datatype [rowsize][column size]
     */public static void main(String[] args) {
        int[][] a = new int[3][3];
        System.out.println(a);
        System.out.println(a.length);
        System.out.println(a[1]);
        System.out.println(a[1].length);
        a[0][0] = 86;
        a[2][1] = 14;
        System.out.println(a[0][2]);
        System.out.println(a[4][0]);

    }

}
