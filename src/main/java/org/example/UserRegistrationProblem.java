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
    public boolean phoneNumber(String phoneNumber) throws Exception {
        if (Pattern.matches("\\+91-\\d{10}", phoneNumber))
            return true;
        else
            throw new Exception("You entered invalid Phone number as a user");
    }
    public boolean passwordValidation(String password) throws Exception {
        if (Pattern.matches("(?=.*?[A-Z])(?=.*?\\d)(?=.*?[!@#$%^&*_()+-])[A-Za-z\\d!@#$%^&()*+_-]{8,}", password))
            return true;
        else
            throw new Exception("You Enter invalid Password");
    }
    public boolean passwordValidation1(String password) throws Exception {
        if (Pattern.matches("(?=.*?[A-Z])(?=.*?\\d)(?=.*?[!@#$%^&*_()+-])[A-Za-z\\d!@#$%^&()*+_-]{8,}", password))
            return true;
        else
            throw new Exception("You Enter invalid Password");
    }
    public boolean passwordValidation3(String password) throws Exception {
        if (Pattern.matches("(?=.*?[A-Z])(?=.*?\\d)(?=.*?[!@#$%^&*_()+-])[A-Za-z\\d!@#$%^&()*+_-]{8,}", password))
            return true;
        else
            throw new Exception("You Enter invalid Password");
    }

    public boolean passwordValidation4(String password) throws Exception {
        if (Pattern.matches("(?=.*?[A-Z])(?=.*?\\d)(?=.*?[!@#$%^&*_()+-])[A-Za-z\\d!@#$%^&()*+_-]{8,}", password))
            return true;
        else
            throw new Exception("You Enter invalid Password");
    }


}