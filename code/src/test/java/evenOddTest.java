import org.junit.jupiter.api.*;
import static org.junit.Assert.*;


public class evenOddTest {

    EvenOdd e1;
    @BeforeEach
    public void before1() {
        e1 = new EvenOdd();
    }

    @Test
    @DisplayName("Testing a float number")
    public void test_float(){
        e1.inittest_number((float)4.2);
        assertEquals(null,e1.even_odd());
    }

    @Nested
    @DisplayName("Testing even integers")
    class even_integers{

        @Test
        public void test_int1(){
            e1.inittest_number(0f);
            assertEquals("even",e1.even_odd());
        }

        @Test
        public void test_int2(){
            e1.inittest_number(-600f);
            assertEquals("even",e1.even_odd());
        }

        @Test
        public void test_int3(){
            e1.inittest_number(2000f);
            assertEquals("even",e1.even_odd());
        }
    }

    @Nested
    @DisplayName("Testing odd integers")
    class odd_integers{

        @Test
        public void test_int1(){
            e1.inittest_number(-5f);
            assertEquals("odd",e1.even_odd());
        }

        @Test
        public void test_int2(){
            e1.inittest_number(3f);
            assertEquals("odd",e1.even_odd());
        }

        @Test
        public void test_int3(){
            e1.inittest_number(1111f);
            assertEquals("odd",e1.even_odd());
        }
    }


    @AfterEach
    public void clean() {
        e1=null;
    }

}