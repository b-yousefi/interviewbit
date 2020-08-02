package interviewbit.string;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrettyJsonTest {

    @Test
    public void prettyJSON() {
        PrettyJson prettyJson = new PrettyJson();
        assertEquals(List.of("[",
                "\t\"foo\",",
                "\t{",
                "\t\t\"bar\":",
                "\t\t[",
                "\t\t\t\"baz\",",
                "\t\t\tnull,",
                "\t\t\t1.0,",
                "\t\t\t2",
                "\t\t]",
                "\t}",
                "]"
                )
                , prettyJson.prettyJSON("[\"foo\",{\"bar\":[\"baz\",null,1.0,2]}]"));
    }
}