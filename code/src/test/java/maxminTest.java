import org.junit.jupiter.api.*;
import static org.junit.Assert.*;


public class maxminTest {

    maxmin test;
    @BeforeEach
    public void before1() {
        test = new maxmin();
    }

    @Test
    @DisplayName("Testing empty array")
    public void test_1(){
        float [] test_arr=new float[2];
        test.inittest_numbers(test_arr,0);
        float [] actual=test.max_min();
        float [] expected=new float[2];

        assertArrayEquals(expected,actual,1e-9f);
    }

    @Test
    @DisplayName("Testing array of 1 number")
    public void test_2(){
        float [] test_arr ={12};
        test.inittest_numbers(test_arr,1);
        float [] actual_arr = test.max_min();
        boolean b;
        if(actual_arr[0]==12 && actual_arr[1]==12){
            b=true;
        }
        else b=false;
        assertTrue(b);
    }

    @Nested
    @DisplayName("Testing arrays (size>1)")
    class test_3{

        @Test
        @DisplayName("Testing sorted array (ascending)")
        public void test_arr1(){
            float [] test_arr ={-11,-1,0,1,11};
            test.inittest_numbers(test_arr,5);
            float [] expected = {11,-11};
            float [] actual_arr =test.max_min();
            assertArrayEquals(expected,actual_arr,1e-9f);
        }

        @Test
        @DisplayName("Testing sorted array (descending)")
        public void test_arr2(){
            float [] test_arr ={11,1,0,-1,-11};
            test.inittest_numbers(test_arr,5);
            float [] expected = {11,-11};
            float [] actual_arr =test.max_min();
            assertArrayEquals(expected,actual_arr,1e-9f);
        }

        @Test
        @DisplayName("Testing array of float numbers")
        public void test_arr3(){
            float [] test_arr ={1.1f,6f,7.7f,-1,-10.9f,-2};
            test.inittest_numbers(test_arr,6);
            float [] expected = {7.7f,-10.9f};
            float [] actual_arr =test.max_min();
            assertArrayEquals(expected,actual_arr,1e-9f);
        }

        @Test
        @DisplayName("Testing array of integers")
        public void test_arr4(){
            float [] test_arr ={1000,2000,-3000,500,750};
            test.inittest_numbers(test_arr,5);
            float [] expected = {2000f,-3000f};
            float [] actual_arr =test.max_min();
            assertArrayEquals(expected,actual_arr,1e-9f);
        }

    }



    @AfterEach
    public void clean() {
        test=null;
    }

}
