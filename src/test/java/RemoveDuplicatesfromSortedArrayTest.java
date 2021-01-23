import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesfromSortedArrayTest {

    private final RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    void RemoveDuplicatesTest() {

        int[] intArray = {
                1, 1, 2
        };
        assertEquals(2, removeDuplicates.getSize(intArray));
        ;
    }

    @Test
    void RemoveDuplicatesTest2() {

        int[] intArray = {
                0, 0, 1, 1, 1, 2, 2, 3, 3, 4
        };
        assertEquals(5, removeDuplicates.getSize(intArray));
        ;
    }

}
