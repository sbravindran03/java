package oops;

public class e1 {

    static class IPL {

        static String team1;
        static String country = "India";

        // Static initialization block for initializing team1
        static {
            team1 = "CSK";
        }

        // Static block to execute some logic during class loading
        static {
            System.out.println(team1);
            System.out.println("whistle");
        }

        // Main method - the entry point of the program
        public static void main(String[] args) {
            System.out.println("main start");

            // Local variable team2
            String team2 = "RCB";
            System.out.println(team2);

            // Calling static method display
            IPL.display();
        }

        // Static method to display a message
        public static void display() {
            System.out.println("esala cup");
        }
    }
}
