package cinema.creational;

import cinema.model.Admin;
import cinema.model.Customer;
import cinema.model.User;

public class UserFactory {

    public static User createUser(String type, String name) {

        if (type.equalsIgnoreCase("admin")) {
            return new Admin(name);
        } else if (type.equalsIgnoreCase("customer")) {
            return new Customer(name);
        } else {
            throw new IllegalArgumentException("Unknown user type");
        }
    }
}
