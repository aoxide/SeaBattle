package org.aoxide.seabattle.dao;

import org.aoxide.seabattle.entities.*;

/**
 *
 * @author AOxide
 */
public interface DAO 
{
    public void CreateGame(Game game);
    public void OpenGame(Game game);
    public void CreateShip(Game game, long session_id, Ship ship);
    public void Shot(Game game, long session_id, int x, int y);
}
