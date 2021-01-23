import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalsTriangleTest {

    private final PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    void case1() {
        int n = 5;
        List<List<Integer>> result = new ArrayList<List<Integer>>() {{
            add(new ArrayList<Integer>() {{
                add(1);
            }});
            add(new ArrayList<Integer>() {{
                add(1);
                add(1);
            }});
            add(new ArrayList<Integer>() {{
                add(1);
                add(2);
                add(1);
            }});
            add(new ArrayList<Integer>() {{
                add(1);
                add(3);
                add(3);
                add(1);
            }});
            add(new ArrayList<Integer>() {{
                add(1);
                add(4);
                add(6);
                add(4);
                add(1);
            }});
        }};
        assertEquals(result, pascalsTriangle.generate(n));
    }

    @Test
    void getRowTest() {
        ArrayList<Integer> expected = new ArrayList<Integer>() {{
            add(1);
            add(4);
            add(6);
            add(4);
            add(1);
        }};
        assertEquals(expected, pascalsTriangle.getRow(4));
    }
}
