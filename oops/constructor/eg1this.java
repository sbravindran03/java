package oops.constructor;

public class eg1this {

    int rollno;
    String name, course;
    float fee;

    public eg1this(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;

    }

    public eg1this(String course, int rollno, String name, float fee) {
        this(rollno, name, fee);
        this.course = course;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }

    public static void main(String[] args) {
        eg1this s1 = new eg1this(1, "ravi", 10000);
        eg1this s2 = new eg1this(2, "shyam", 10000);
        s1.display();
        s2.display();
    }

}
