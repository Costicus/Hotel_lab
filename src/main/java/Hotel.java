import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conference_spaces;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conference_spaces = new ArrayList<>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Bedroom bedrooms) {
        this.bedrooms.add(bedrooms);
    }

    public ArrayList<ConferenceRoom> getConference_spaces() {
        return conference_spaces;
    }

    public void setConference_spaces(ConferenceRoom conference_spaces) {
        this.conference_spaces.add(conference_spaces);
    }

    public void check_in_guest_into_bedroom(Guest John, int Bedroom_number) {
        this.bedrooms.get(Bedroom_number).updateGuest(John);

    }
}
