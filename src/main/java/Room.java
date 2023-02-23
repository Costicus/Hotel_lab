import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests_list;

    public Room() {
        guests_list = new ArrayList<Guest>();
    }

    public Guest getGuest(int index) {
        return guests_list.get(index);
    }

    public void updateGuest(Guest inputGuest) {
        this.guests_list.add(inputGuest);
    }

}
