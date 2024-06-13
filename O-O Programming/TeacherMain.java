package ch12;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher elon = new Teacher();
        Teacher anna = new Teacher(2, "Anna", "G,");

        elon.setId(1);
        elon.setFirstname("Ellon");
        elon.setLastname("m");

        System.out.println("elons state");
        System.out.println("id:"+ elon.getId());
        System.out.println("firstname "+ elon.getFirstname());
        System.out.println("lastname" + elon.getLastname());

        System.out.println("Annas state");
        System.out.println("id:"+ anna.getId());
        System.out.println("firstname "+ anna.getFirstname());
        System.out.println("lastname" + anna.getLastname());
    }
}
