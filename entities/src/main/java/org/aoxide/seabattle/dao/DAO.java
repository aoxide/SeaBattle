package org.aoxide.seabattle.dao;

import org.aoxide.seabattle.entities.*;

/**
 *
 * @author AOxide
 */
public interface DAO 
{
    public void CreateGame(Game game);
    public void CreateShip(Game game, long Session_ID, Ship ship);
    public void Shot(Game game, long Session_ID, int X, int Y);
}
