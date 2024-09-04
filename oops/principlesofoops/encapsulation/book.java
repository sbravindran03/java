package oops.principlesofoops.encapsulation;
//can we have private constructor int the class 
/*
 * whenever we are having private constructor inside the class 
 * we cant create object from anothr class 
 */
public class book {

    class bookk {

        private String bname;

        private bookk() {
//load instruction
        }

        private bookk(String bname) {
            this.bname = bname;
        }

        public String getname() {
            return bname;
        }

        public bookk getbookob(String bname) {
            return new bookk(bname);
        }

    }

    public static void main(String[] args) {
        book outer = new book();
        bookk b1 = outer.new bookk().getbookob("ravi");
        bookk b2 = outer.new bookk().getbookob("shyam");
        System.out.println(b1.getname());
        System.out.println(b2.getname());
        System.out.println(b1);
        System.out.println(b2);

    }
}
