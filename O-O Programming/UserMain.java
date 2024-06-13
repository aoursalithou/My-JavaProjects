package ch12;

import ch12.model.User;
import static java.lang.Math.abs;

public class UserMain {
    public static void main(String[] args) {
        User user = new User();
        User anna = new User (2,"Anna", "G.", "anna", "12345", false);
//        int x = Math.abs(-3);


        user.setId(1);
        user.setFirstname("George");
        user.setLastname("G.");
        user.setUsername("george g");
        user.setPassword("12345");
        user.setActive(true);

        System.out.println("user id " + user.getId());
        System.out.println("user firstname " + user.getFirstname());
        System.out.println("user lastname " + user.getLastname()) ;
        System.out.println("username user " + user.getUsername());
        System.out.println("password user " + user.getPassword());
        System.out.println( "user active " +user.isActive());


        System.out.println("anna id " + anna.getId());
        System.out.println("anna firstname " + anna.getFirstname());
        System.out.println("anna lastname " + anna.getLastname()) ;
        System.out.println("username anna " + anna.getUsername());
        System.out.println("password anna " + anna.getPassword());
        System.out.println( "anna active " +anna.isActive());
    }
}
