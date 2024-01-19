package jdk026.hw6.gameflow;

import jdk026.hw6.rooms.RoomOptions;
import jdk026.hw6.rooms.Rooms;

import java.util.Map;
import java.util.Random;

import static jdk026.hw6.Player.playerChoice;

public class GamePlay {

    public static void gamePlay(Integer step,GameStatistics gameStat) {
        Rooms rooms = new Rooms();
        RoomOptions roomOpt = new RoomOptions(rooms);
        int playerFirstChoice = playerChoice();
//        System.out.print(playerFirstChoice + " " + rooms.getRoomContent(playerFirstChoice) + " ");
        roomOpt.roomChoose(playerFirstChoice);
        Integer [] hostOptions = roomOpt.getRoomOptions().entrySet().stream()
                .filter(entry -> !entry.getValue())
                .map(Map.Entry::getKey)
                .toArray(Integer[]::new);
        int j = 0;
        if(hostOptions.length != 1){
            Random random = new Random();
            j = random.nextInt(0, 2);
        }
        roomOpt.roomChoose(hostOptions[j]);
//        System.out.print(hostOptions[j] + " " + rooms.getRoomContent(hostOptions[j]) + " ");
        Integer playerSecondChoice = roomOpt.getRoomOptions().entrySet().iterator().next().getKey();
        gameStat.addResult(step,rooms.getRoomContent(playerSecondChoice));
//        System.out.println(playerSecondChoice + " " + rooms.getRoomContent(playerSecondChoice) + " ");
    }
}
