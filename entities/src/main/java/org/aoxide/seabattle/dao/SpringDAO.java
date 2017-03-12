/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aoxide.seabattle.dao;

import org.aoxide.seabattle.entities.*;

/**
 *
 * @author AOxide
 */
public class SpringDAO implements DAO
{
    @Override
    public Game CreateGame(long Session1_ID, long Session2_ID)
    {
        return null;
    }
    
    @Override
    public Game OpenGame(long Game_ID)
    {
        return null;
    }
    
    @Override
    public void CreateShip(Game game, long Session_ID, Ship ship) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Shot(Game game, long Session_ID, int X, int Y) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
