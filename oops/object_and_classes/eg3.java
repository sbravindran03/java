package oops.object_and_classes;

public class eg3 {
    // 3) Object and Class Example: Initialization through a constructor
    int age;
    String name;

    public eg3(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        eg3 s1 = new eg3(332, "shyam");
        eg3 s2 = new eg3(232, "panda");
        System.out.println("Student's Name " + s1.name + "student age " + s1.age);
        System.out.println("Student's Name " + s2.name + "student age " + s2.age);
    }

}
