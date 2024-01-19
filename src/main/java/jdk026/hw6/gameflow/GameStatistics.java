package jdk026.hw6.gameflow;

import java.util.HashMap;

public class GameStatistics {
    private HashMap<Integer, Boolean> gameStat;

    public GameStatistics() {
        this.gameStat = new HashMap<Integer, Boolean>();
    }


    public void addResult(Integer i, Boolean result) {
        this.gameStat.put(i, result);
    }

    public void gameStatistics() {
        int trueCount = (int) this.gameStat.values().stream()
                .filter(Boolean::booleanValue)
                .count();
        float trueResults = (float) trueCount / this.gameStat.size() * 100;
        float falseResults = (float) (this.gameStat.size() - trueCount) / this.gameStat.size() * 100;
        System.out.println("from " + this.gameStat.size() + " games:");
        System.out.println("win - " + trueResults + "% " + "lost " + falseResults + "%");
    }

    @Override
    public String toString() {
        return "{ " + String.join(", ", gameStat.values().stream().map(Object::toString).toArray(String[]::new)) + " }";
    }
}
