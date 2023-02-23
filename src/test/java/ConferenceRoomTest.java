import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom Teviot;

    @Before
    public void before() {
        Teviot = new ConferenceRoom("Teviot");
    }

    @Test
    public void check_conference_room_has_name() {
        assertEquals("Teviot", Teviot.getConference_room_name());
    }

    @Test
    public void change_conference_room_name() {
        Teviot.setConference_room_name("SummerHall");
        assertEquals("SummerHall", Teviot.getConference_room_name());
    }

    @Test
    public void add_guest_to_the_room() {
        Guest Ben = new Guest("Benjamin");
        Teviot.updateGuest(Ben);
        assertEquals(Ben, Teviot.getGuest(0));
    }
}
