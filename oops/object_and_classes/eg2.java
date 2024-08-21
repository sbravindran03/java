package oops.object_and_classes;

// 2) by method
public class eg2 {

    int rollno;
    String name;

    void insertion(int r, String n) {
        /*
         * we dont use public static because we cant use static variable into a non
         * -static variable/*
         */
        rollno = r;
        name = n;

    }

    void display() {
        System.out.println(rollno + "" + name);
    }

    ;

    public static void main(String[] args) {
        eg2 s1 = new eg2();
        eg2 s2 = new eg2();
        eg2 s3 = new eg2();
        s1.insertion(03, " z" + "ravi");
        s2.insertion(13, " " + "shyam");
        s3.insertion(23, " " + "panda");
        s1.display();
        s2.display();
        s3.display();
    }

}
