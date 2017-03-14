package org.aoxide.seabattle.dao;

import org.aoxide.seabattle.entities.*;

/**
 *
 * @author AOxide
 */
public interface DAO 
{
    public void CreateGame(Game game);
    public Game OpenGame(long game_id, long session_id);
    public void CreateShip(Game game, Ship ship);
    public void Shot(Game game, long session_id, int x, int y);
}
