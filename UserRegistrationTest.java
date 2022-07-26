import com.blz.UserRegistrationException.UserDetailException;
import com.blz.UserRegistrationException.UserDetailsRegexPattern;
import com.blz.UserRegistrationException.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;


public class UserRegistrationTest {
    //UC1 firstname
    @Test
    void givenFirstName_WhenProperFirstName_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addFirstName.validate("Vignesh", UserDetailsRegexPattern.FIRST_NAME_LAST_NAME);
        Assertions.assertTrue(result);
    }

    //UC1 firstname false
    @Test
    void givenFirstName_WhenNotProperFirstName_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addFirstName.validate("vignesh",UserDetailsRegexPattern.FIRST_NAME_LAST_NAME);
        Assertions.assertFalse(result);
    }

    //UC12 firstname Null Exception
    @Test
    void givenNull_WhenFirstNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.addFirstName.validate(null,UserDetailsRegexPattern.FIRST_NAME_LAST_NAME);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL,e.types);
        }
    }
    //UC12 firstname Empty Exception
    @Test
    void givenEmpty_WhenFirstNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.addFirstName.validate(" ",UserDetailsRegexPattern.FIRST_NAME_LAST_NAME);

        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY,e.types);
        }
    }

    //UC2 last name true
    @Test
    void givenFirstName_WhenProperLastName_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addLastName.validate("Jagadeesan",UserDetailsRegexPattern.FIRST_NAME_LAST_NAME);
        Assertions.assertTrue(result);
    }

    //UC2 last name false
    @Test
    void givenFirstName_WhenNotProperLastName_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addLastName.validate("jagadeesan",UserDetailsRegexPattern.FIRST_NAME_LAST_NAME);
        Assertions.assertFalse(result);
    }

    //UC12 last_name Null Exception
    @Test
    void givenNull_WhenLastNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addLastName.validate(null,UserDetailsRegexPattern.FIRST_NAME_LAST_NAME);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL,e.types);
        }
    }
    //UC12 last name Empty Exception
    @Test
    void givenEmpty_WhenLastNameException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addLastName.validate(" ",UserDetailsRegexPattern.FIRST_NAME_LAST_NAME);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY,e.types);
        }
    }


    //UC3 EmailId true
    @Test
    void givenFirstName_WhenProperEmailId_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addEmail.validate("vig.100@gmail.com",UserDetailsRegexPattern.EMAIL);
        Assertions.assertTrue(result);
    }

    //UC3 Email id false
    @Test
    void givenFirstName_WhenNotProperEmailId_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addEmail.validate("vig.100@g.c",UserDetailsRegexPattern.EMAIL);
        Assertions.assertFalse(result);
    }


    //UC12 email Null Exception
    @Test
    void givenNull_WhenEmailException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addEmail.validate(null,UserDetailsRegexPattern.EMAIL);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL,e.types);
        }
    }
    //UC12 email Empty Exception
    @Test
    void givenEmpty_WhenEmailException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addEmail.validate(" ",UserDetailsRegexPattern.EMAIL);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY,e.types);
        }
    }

    //UC4 PhoneNumber true
    @Test
    void givenFirstName_WhenProperPhoneNumber_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPhoneNumber.validate("91 8372582313",UserDetailsRegexPattern.PHONE_NUMBER);
        Assertions.assertTrue(result);
    }

    //UC4 PhoneNumber false
    @Test
    void givenFirstName_WhenNotProperPhoneNumber_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPhoneNumber.validate("917352344324",UserDetailsRegexPattern.PHONE_NUMBER);
        Assertions.assertFalse(result);
    }

    //UC12 Phone number Null Exception
    @Test
    void givenNull_WhenPhoneNumberException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addPhoneNumber.validate(null,UserDetailsRegexPattern.PHONE_NUMBER);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL,e.types);
        }
    }
    //UC12 Phone number Empty Exception
    @Test
    void givenEmpty_WhenPhoneNumberException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addPhoneNumber.validate(" ",UserDetailsRegexPattern.PHONE_NUMBER);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY,e.types);
        }
    }


    //*UC5 password only accept 8 character true
    //*password should have at least one Upper case letter
    //*password shoudat least one  have digits
    @Test
    void givenFirstName_WhenProperPassword_ShouldReturnTrue() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPassword.validate("Aa3ssdasd4$#",UserDetailsRegexPattern.PASSWORD);
        Assertions.assertTrue(result);
    }

    //UC5 password false
    @Test
    void givenFirstName_WhenNotProperPassword_ShouldReturnFalse() throws UserDetailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPassword.validate("aasasAasd$",UserDetailsRegexPattern.PASSWORD);
        Assertions.assertFalse(result);
    }


    //UC12 Password Null Exception
    @Test
    void givenNull_WhenPasswordException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addPassword.validate(null,UserDetailsRegexPattern.PASSWORD);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_NULL,e.types);
        }
    }
    //UC12 password Empty Exception
    @Test
    void givenEmpty_WhenPasswordException_ShouldMatch() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.addPassword.validate(" ",UserDetailsRegexPattern.PASSWORD);
            Assertions.assertFalse(result);
        } catch (UserDetailException e) {
            Assertions.assertEquals(UserDetailException.ExceptionTypes.ENTERED_EMPTY,e.types);
        }
    }
}
