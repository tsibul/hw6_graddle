package jdk026.hw6.rooms;

import java.util.HashMap;

public class RoomOptions {

    private HashMap<Integer, Boolean> roomOptions;


    public RoomOptions(Rooms rooms) {
        this.roomOptions = new HashMap<Integer, Boolean>() {
            {
                put(1, rooms.getRoomContent(1));
                put(2, rooms.getRoomContent(2));
                put(3, rooms.getRoomContent(3));
            }
        };
    }

    public HashMap<Integer, Boolean> getRoomOptions() {
        return roomOptions;
    }

    public void roomChoose(int i){
       this.roomOptions.remove(i);
    }
}
