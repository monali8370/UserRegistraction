package org.example;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationProblemTest {
    UserRegistrationProblem userRegistrationProblem=new UserRegistrationProblem();
    @Test
    public void validateFirstNameTestForPositive() {
        boolean name = false;
        try {
            name = userRegistrationProblem.firstNameValidation("Monali");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void validateLastNameTestForPositive() {
        boolean lastName = false;
        try {
            lastName = userRegistrationProblem.lastNameValidation("Monali");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}