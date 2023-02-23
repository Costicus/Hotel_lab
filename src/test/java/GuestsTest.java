import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestsTest {
Guest Alex;

    @Before
    public void before() {
        Alex = new Guest("Alex B");
    }

    @Test
    public void check_has_name() {
        assertEquals("Alex B", Alex.getName());
    }

    @Test
    public void check_set_name() {
        Alex.setName("Alex C");
        assertEquals("Alex C", Alex.getName());
    }
}
