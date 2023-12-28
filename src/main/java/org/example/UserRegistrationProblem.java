package org.example;
import java.util.regex.Pattern;
public class UserRegistrationProblem {
    public boolean firstNameValidation(String firstName) throws Exception {
        if (Pattern.matches("[A-Z][a-z]{2,}", firstName))
            return true;
        else
            throw new Exception("You enter Invalid First name as a user: ");
    }
    public boolean lastNameValidation(String lastName) throws Exception {
        if (Pattern.matches("[A-Z][a-z]{2,}", lastName))
            return true;
        else
            throw new Exception("You enter Invalid First name as a user: ");
    }

    public boolean emailValidation(String email) throws Exception {
        if (Pattern.matches("abc-100@yahoo.com", email))
            return true;
        else
            throw new Exception("You enter invalid mail");
    }
}
