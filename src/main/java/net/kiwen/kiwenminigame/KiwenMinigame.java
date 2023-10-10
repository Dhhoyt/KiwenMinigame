package net.kiwen.kiwenminigame;

import java.util.UUID;

public interface KiwenMinigame {

    /**
     * Adds a player to the game.
     * This is how the proxy communicates party information to the minigame.
     * 
     * @param id      The unique id of the
     * @param partyID The ID of the party the player is in
     */
    void addPlayer(UUID id, int partyID);

    /**
     * Calls when the game is ready to begin.
     * All players will be in the server at the point this is called.
     */
    void start();

    /**
     * Stops the game. Will only be ran if the game needs to be stopped externally.
     * This does not need to be called by the minigame
     */
    void stop();

    /**
     * Returns the state of the game
     * 
     * @return True if the minigame is still going on, false otherwise
     */
    boolean isRunning();
}
