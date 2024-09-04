package oops.principlesofoops.encapsulation;
// for any class where we can just create single object is called as singleton class 

public class car {

    static class carr {

        private String name = "BMW";
        private static carr c;

        private carr() {
        }

        public static carr getobjcar() {
            if (c == null) {
                c = new carr();
            }
            return c;

        }

        public String getName() {
            return name;
        }

        public static void main(String[] args) {
            carr car1 = carr.getobjcar();
            carr car2 = carr.getobjcar();
            carr car3 = carr.getobjcar();
            System.out.println(car1);
            System.out.println(car2);
            System.out.println(car3);

        }
    }

}
//any class which follows           a class should prefix with public 
//should have priavte data memebrs
//should have public no argumment constructor it shouold have public getters and setters
//write jp to print all paid student student marks
