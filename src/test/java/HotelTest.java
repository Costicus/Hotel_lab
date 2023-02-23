import org.junit.Before;
import org.junit.Test;

public class HotelTest {

    Hotel California;

    @Before

    public void before(){
        Bedroom bedroomPenthouse = new Bedroom(1, RoomTypes.SINGLE);
        California = new Hotel();
        California.setBedrooms(bedroomPenthouse);
    }

}
