import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class MaxNumberTest {
    MaxNumber obj = new MaxNumber();

    @Test
    public void objNotNull(){
        assertNotNull(obj);
    }
    @Test
    public void findMaxTest() {
        int arr[] = { 1, 2, 4, 5, 3, 33 };
        int actual = obj.findMax(arr);
        assertEquals(33, actual);
    }

    @Test
    public void sortByAscendingPos_ValTest(){
        int arr[]={3,5,2,7,3};
        int expected[]={2,3,3,5,7};
        int asc_arr[]=obj.sortByAscending(arr);
        assertArrayEquals(expected,asc_arr);
    }
    @Test
    public void sortByAscendingNeg_ValTest(){
        int arr[]={3,-5,2,-7,3};
        int expected[]={-7,-5,2,3,3};
        int asc_arr[]=obj.sortByAscending(arr);
        assertArrayEquals(expected,asc_arr);
    }
}
