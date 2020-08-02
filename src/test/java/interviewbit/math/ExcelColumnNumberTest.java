package interviewbit.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcelColumnNumberTest {

    @Test
    public void titleToNumber() {
        ExcelColumnNumber excelColumnNumber = new ExcelColumnNumber();

        assertEquals(28, excelColumnNumber.titleToNumber("AB"));
    }
}