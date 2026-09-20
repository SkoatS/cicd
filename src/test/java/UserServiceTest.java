import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UserServiceTest {


    UserService userService = new UserService();


    @Test
    void testValidEmail() {
        // buat assertTrue dari function userService.isValidEmail
        assertTrue(userService.isValidEmail("Northlondon@forever.com"));

        // buat assertFalse dari function userService.isValidEmail
        assertFalse(userService.isValidEmail("Northlondon"));
    }


    @Test
    void testValidPassword() {
        // buat assertTrue dari function userService.isValidPassword
        assertTrue(userService.isValidPassword("benar12345"));
        // buat assertFalse dari function userService.isValidPassword
        assertFalse(userService.isValidPassword("salah"));
    }
}
