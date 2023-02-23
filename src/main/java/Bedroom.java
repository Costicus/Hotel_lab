public class Bedroom extends Room {
    private int room_number;
    private RoomTypes room_type;

    public Bedroom(int input_room_number, RoomTypes input_room_type) {
        this.room_number = input_room_number;
        this.room_type = input_room_type;
    }


    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public RoomTypes getRoom_type() {
        return room_type;
    }

    public void setRoom_type(RoomTypes room_type) {
        this.room_type = room_type;
    }
}
