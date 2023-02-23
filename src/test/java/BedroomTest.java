import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom SleepyBedroom;

    @Before
    public void before() {
        SleepyBedroom = new Bedroom(7, RoomTypes.SINGLE);
    }

    @Test
    public void check_bedroom_has_number() {
        assertEquals(7, SleepyBedroom.getRoom_number());
    }

    @Test
    public void change_bedroom_number() {
        SleepyBedroom.setRoom_number(12);
        assertEquals(12, SleepyBedroom.getRoom_number());
    }

    @Test
    public void add_guest_to_the_room() {
        Guest Ben = new Guest("Benjamin");
        SleepyBedroom.updateGuest(Ben);
        assertEquals(Ben, SleepyBedroom.getGuest(0));
    }

    @Test
    public void check_room_has_type() {
        assertEquals(RoomTypes.SINGLE, SleepyBedroom.getRoom_type());
    }

    @Test
    public void change_room_type() {
        SleepyBedroom.setRoom_type(RoomTypes.FAMILY);
        assertEquals(RoomTypes.FAMILY, SleepyBedroom.getRoom_type());
    }

}
