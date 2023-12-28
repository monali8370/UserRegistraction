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
    @Test
    public void emailTest() {
        boolean email = false;
        try {
            email = userRegistrationProblem.emailValidation("abc-100@yahoo.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void validateMobilePositive() {
        boolean phone = false;
        try {
            phone = userRegistrationProblem.phoneNumber("+91-9967891699");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void validatePassword() {
        boolean pass = false;
        try {
            pass = userRegistrationProblem.passwordValidation("Monali@895");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void validatePassword1() {
        boolean pass2 = false;
        try {
            pass2 = userRegistrationProblem.passwordValidation("Monali@947");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void validatePassword3() {
        boolean pass3 = false;
        try {
            pass3 = userRegistrationProblem.passwordValidation("Monali@947");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validatePassword4() {
        boolean pass3 = false;
        try {
            pass3 = userRegistrationProblem.passwordValidation("Monali@947");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}