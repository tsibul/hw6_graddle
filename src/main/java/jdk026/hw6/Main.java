package jdk026.hw6;

import jdk026.hw6.gameflow.GameStatistics;


import static jdk026.hw6.gameflow.GamePlay.gamePlay;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        GameStatistics gameStat = new GameStatistics();
        while (i < 10000){
            gamePlay(i, gameStat);
            i++;
        }
    gameStat.gameStatistics();
    }
}