package com.anticheat.combat.data;

import java.util.HashMap;
import java.util.Map;

public class PlayerData {
    // Tracking violations for players
    private Map<String, Integer> violationTracker;
    // Storing combat metrics
    private Map<String, Integer> combatMetrics;
    // Managing player state
    private String playerState;

    public PlayerData() {
        violationTracker = new HashMap<>();
        combatMetrics = new HashMap<>();
        playerState = "IDLE"; // default state
    }

    // Methods to track violations
    public void addViolation(String playerId) {
        violationTracker.put(playerId, violationTracker.getOrDefault(playerId, 0) + 1);
    }

    public int getViolations(String playerId) {
        return violationTracker.getOrDefault(playerId, 0);
    }

    // Methods to track combat metrics
    public void addCombatMetric(String playerId, int metric) {
        combatMetrics.put(playerId, combatMetrics.getOrDefault(playerId, 0) + metric);
    }

    public int getCombatMetric(String playerId) {
        return combatMetrics.getOrDefault(playerId, 0);
    }

    // Player state management
    public void setPlayerState(String state) {
        this.playerState = state;
    }

    public String getPlayerState() {
        return playerState;
    }
}