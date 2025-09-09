import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
  Test for overloading multiples.
 */
public class MultiplesDefaultTest {

    @Test
    public void testDefault() {
        String[] args = {};
        Assertions.assertEquals(466,
                Multiples.main(args),
                "Multiples.multiples() is incorrect for default values");
    }

}