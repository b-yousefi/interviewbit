package interviewbit.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcelColumnTitleTest {

    @Test
    public void convertToTitle() {
        ExcelColumnTitle excelColumnTitle = new ExcelColumnTitle();

        assertEquals("Z", excelColumnTitle.convertToTitle(26));
    }
}