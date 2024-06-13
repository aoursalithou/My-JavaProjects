package ch12;

import ch12.model.User;
import ch12.model.User2;
import ch12.model.UserCredentials;

public class User2Main {
    public static void main(String[] args) {
        User2 eleni = new User2(2,"eleni","A.");
        UserCredentials UserCredentials = new UserCredentials(2,"Anna", "12345");




        System.out.println("user id:" + eleni.getId() + "user firstname" + eleni.getFirstname() +
                "user getlastname:" + eleni.getLastname());


        System.out.println("UserCredentials: " + UserCredentials.getId() + "UserCredentials: "
                + UserCredentials.getPassword() + "UserCredentials: " + UserCredentials.getUsername() );
    }
}
