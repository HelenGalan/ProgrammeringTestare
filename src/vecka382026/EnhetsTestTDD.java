package vecka382026;

import lektionTorsdag.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class EnhetsTestTDD {

    @Test
    public void firstTestCase() {

        String text = "some text";

        int actual = text.length();
        int extected = 9;

        assertEquals(extected, actual);

    }

    @Test
    public void add() {
        //Arrange
        Calculator calc = new Calculator(2, 3);
        int expected = 5;

        //Act
        int actual = calc.add();

        //Assert
        assertEquals(expected, actual);
    }
}
