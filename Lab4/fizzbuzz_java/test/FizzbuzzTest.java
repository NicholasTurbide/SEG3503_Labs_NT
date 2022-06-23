import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class FizzbuzzTest {

    @Test
    void fizz3(){
        Fizzbuzz fizz = new Fizzbuzz();
        assertEquals("fizz", fizz.fizz(3));
    }

    @Test
    void fizz5(){
        Fizzbuzz fizz = new Fizzbuzz();
        assertEquals("buzz", fizz.fizz(5));
    }

    @Test
    void fizz10(){
        Fizzbuzz fizz = new Fizzbuzz();
        assertEquals("buzz", fizz.fizz(10));
    }

    @Test
    void fizz11(){
        Fizzbuzz fizz = new Fizzbuzz();
        assertEquals("12", fizz.fizz(11));
    }


    // @Test
    // void fizz15(){
    //     Fizzbuzz fizz = new Fizzbuzz();
    //     assertEquals("fizzbuzz", fizz.fizz(15));
    // }

}