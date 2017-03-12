package org.aoxide.seabattle;

import org.aoxide.seabattle.dao.*;
import org.aoxide.seabattle.entities.*;

/**
 *
 * @author AOxide
 */
public class SeaBattle 
{
    public static void main(String[] args)
    {
        DAO dao = new SpringDAO();
        Game game = new Game(dao, 0L, 1L);
        
        createShips(game,0L);
        createShips(game,1L);
        
        game.shot(0L, 5, 5);
        game.shot(1L, 7, 2);
    }
    
    public static void createShips(Game game, long session_id)
    {
        
    }
}
