package jdk026.hw6;

import java.util.Random;

public class Player {

    public static int playerChoice () {
        Random random = new Random();
        return random.nextInt(1, 4);
    }
}
