import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbStairsTest {

    private final ClimbStairs climbStairs = new ClimbStairs();

    @Test
    void case1() {
        int n = 2;
        assertEquals(2, climbStairs.getPath(n));
    }

    @Test
    void case2() {
        int n = 3;
        assertEquals(3, climbStairs.getPath(n));
    }

    @Test
    void case3() {
        int n = 4;
        assertEquals(5, climbStairs.getPath(n));
    }

    @Test
    void case4() {
        int n = 5;
        assertEquals(8, climbStairs.getPath(n));
    }

}
