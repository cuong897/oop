import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week4Test {
    /**
     * test khi a>b.
     */
    @Test
    public void testMax2Int1() {
        assertEquals(5 , Week4.max2Int(5 , 4));
    }

    /**
     * test a<b.
     */
    @Test
    public void testMax2Int2() {
        assertEquals(5 , Week4.max2Int(4 , 5));

    }

    /**
     * test a,b am.
     */
    @Test
    public void testMax2Int3() {
        assertEquals(-1 , Week4.max2Int(-2 , -1));

    }

    /**
     * a b bang nhau.
     */
    @Test
    public void testMax2Int4() {
        assertEquals(5 , Week4.max2Int(5 , 5));
    }

    /**
     * test a=0,b>0.
     */
    @Test
    public void testMax2Int5() {
        assertEquals(5 , Week4.max2Int(0 , 5));
    }

    /**
     * test mang so duong.
     */
    @Test
    public void testMinArray1() {
        int arra[] = {1 , 5 , 33 , 32233 ,42};
        assertEquals(1 , Week4.minArray(arra));
    }

    /**
     * test mang so am.
     */
    @Test
    public void testMinArray2() {
        int arr[]={-22 , -4 , -3 , -8 , -5};
        assertEquals(-22 , Week4.minArray(arr));
    }

    /**
     * test mang tang .
     */
    @Test
    public void testMinArray3() {
        int arr[]={-34 , -5 , 7 , 8 , 9};
        assertEquals(-34 , Week4.minArray(arr));
    }

    /**
     * test mang giam.
     */
    @Test
    public void testMinArray4() {
        int arr[]={133 , 44 , 0 , -4 , -5 };
        assertEquals(-5 , Week4.minArray(arr));
    }

    /**
     * test mang chi co 1 so.
     */
    @Test
    public void testMinArray5() {
        int arr[]={0 , 0 , 0 , 0 , 0};
        assertEquals(0 , Week4.minArray(arr));
    }

    @Test
    public void testCalculateBMI1() {
    }

    @Test
    public void testCalculateBMI2() {
    }

    @Test
    public void testCalculateBMI3() {
    }

    @Test
    public void testCalculateBMI4() {
    }

    @Test
    public void testCalculateBMI5() {
    }
} 