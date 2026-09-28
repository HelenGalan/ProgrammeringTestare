package vecka382026;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testGetUser() {

        String userName = "Helen";
        String password = "H123";

        User user = new User(userName, password);

        String actual = user.getUserName();

        assertEquals("Helen", actual);
        assertEquals(userName, actual);

    }

    @Test
    public void testGetPassword() {

        String userName = "Helen";
        String password = "H123";

        User user = new User(userName, password);

        String actual = user.getPassword();

        assertEquals("H123", actual);
        assertEquals(password, actual);
    }

    @Test
    public void testSetUserName() {
        String userName = "Helen";
        String password = "H123";
        User user = new User(userName, password);

        String newUserName = "Gro";
        user.setUserName(newUserName);

        String actual = user.getUserName();

        assertEquals("Gro", actual);
    }

    @Test
    public void testGetTypeOfUser() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Hämta typeOfUser
        String actual = user.getTypeOfUser();

        //Kontrollera att typeOfUser är korrekt
        assertEquals("normal", actual);
    }

    @Test
    public void testSetTypeOfUser() {
        String userName = "Helen";
        String password = "H123";
        User user = new User(userName, password);

        String newTypeOfUser = "onormal";
        user.setTypeOfUser(newTypeOfUser);

        String actual = user.getTypeOfUser();

        assertEquals("onormal", actual);
    }

}
