public class ConferenceRoom extends Room {
    private String conference_room_name;

    public ConferenceRoom(String conference_room_name) {
        this.conference_room_name = conference_room_name;
    }


    public String getConference_room_name() {
        return conference_room_name;
    }

    public void setConference_room_name(String conference_room_name) {
        this.conference_room_name = conference_room_name;
    }

}
