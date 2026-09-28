package vecka382026;

import lektionTorsdag.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestPasswordCheck {

    @Test
    public void testCase1() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;

        //Act
        boolean actual = pass.check("password");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCaseLessThan8Characters() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testAtLeastOneDigit() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("password");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testNoSpecialCharacters() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("password");

        //Assert
        assertEquals(expected, actual);
    }
}
