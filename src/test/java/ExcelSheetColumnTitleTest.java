import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnTitleTest {

    private final ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();

    @Test
    void case1() {
        assertEquals("ZY", excelSheetColumnTitle.getTitle(701));
    }
    @Test
    void case2() {
        assertEquals("AZ", excelSheetColumnTitle.getTitle(52));
    }
}