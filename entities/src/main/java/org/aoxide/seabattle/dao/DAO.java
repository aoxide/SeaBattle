package org.aoxide.seabattle.dao;

import org.aoxide.seabattle.entities.*;

/**
 *
 * @author AOxide
 */
public interface DAO 
{
    public Game CreateGame(long Session1_ID, long Session2_ID);
    public Game OpenGame(long Game_ID);
    public void CreateShip(Game game, long Session_ID, Ship ship);
    public void Shot(Game game, long Session_ID, int X, int Y);
}
