package ch12;

public class StudentMain {
    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2,"bob","D.");

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W");

        System.out.println("ID " + alice.getId());
        System.out.println("FIRSTNAME " +alice.getFirstname());
        System.out.println("LASTNAME " +alice.getLastname());



        //set
//        alice.id = 1;
//        alice.firstname = "Alice";
//        alice.lastname = "Wonderland";

        //get
//        System.out.println("ID " + alice.id);
//        System.out.println("FIRSTNAME " +alice.firstname);
//        System.out.println("LASTNAME " +alice.lastname);
    }
}
