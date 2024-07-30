package oops;

public class classes {
    // we doing building an college student magnament like the studnets name , age ,
    // addresss should applied

    String name;
    // for name string
    int age;
    // for numbers int
    String address;
    // for adrress string

    public classes(String name, int age, String address) {
        // then we applying the entities to compiler to know , to know for what should
        // be return and what for it
        // basically it is a constructor remember class is a blue print for the object
        // we cam inialise this class for 5000 times or more than that by this
        // constructor , it is to initialise any class object
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // then we have to start with set and get method
    // set should be first
    public void setaname(String name) { // setname - is a modify name
        this.name = name;// this keyword means current object
    }

    public void setage(int age) {
        this.age = age;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    // next is get method it is for returing the value of the variable
    public String getname() {
        return name;

    }

    public int getage() {
        return age;

    }

    public String getaddress() {
        return address;

    }

    public String details() {
        return ("student name is " + this.getname() + " " + "student age is " + " " + this.getage() + "  "
                + "student address:"
                + getaddress());
    }

    public static void main(String[] args) {
        // Creating a student object
        classes shyam = new classes("Shyam , ", 21, "No.2 Sathya Murthi Street");
        // Printing student details
        System.out.println(shyam.details());
    }
}
