package java.chap05;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Disabled
    @Test
    void failMethod() {
        try{
            AuthService authService = new AuthService();
            authService.authenticate(null, null);
            fail();
        }catch(IllegalArgumentException e) {

        }
    }

}
