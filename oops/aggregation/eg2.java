package oops.aggregation;

class Address {

    String city, country, state;

    public Address(String city, String country, String state) {
        this.country = country;
        this.state = state;
        this.city = city;

    }
}

class EMP {

    int id;
    String name;
    Address address;

    public EMP(int id, String name, Address address) {
        this.address = address;
        this.id = id;
        this.name = name;

    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.country + " " + address.state);
    }

}

class eg2 {

    public static void main(String[] args) {
        Address address1 = new Address("CHENNAI", "INDIA", "TN");
        EMP emp1 = new EMP(03, "ravi", address1);
        emp1.display();

    }
}
