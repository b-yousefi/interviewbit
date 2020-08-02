package interviewbit.string;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ValidIpAddressesTest {

    @Test
    public void restoreIpAddresses() {
        ValidIpAddresses validIpAddresses = new ValidIpAddresses();
        assertEquals(List.of("255.255.11.135", "255.255.111.35"),
                validIpAddresses.restoreIpAddresses("25525511135"));
    }
}