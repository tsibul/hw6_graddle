package jdk026.hw6.rooms;

import java.util.Random;

public class Rooms {
    private boolean first;
    private boolean second;
    private boolean third;

    public Rooms() {
        Random random = new Random();
        int roomNoCar = random.nextInt(1, 4);
        switch (roomNoCar) {
            case 1 -> this.first = true;
            case 2 -> this.second = true;
            case 3 -> this.third = true;
        }
    }

    public boolean getRoomContent (int i){
        return switch (i) {
            case 1 -> this.first;
            case 2 -> this.second;
            case 3 -> this.third;
            default -> throw new RuntimeException("Room out of range");
        };

    }
}
