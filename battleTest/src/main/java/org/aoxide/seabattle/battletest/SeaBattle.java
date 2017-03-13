package org.aoxide.seabattle.battletest;

import org.aoxide.seabattle.dao.DAO;
import org.aoxide.seabattle.entities.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author AOxide
 */
public class SeaBattle 
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springContext.xml"});
        DAO dao = (DAO)context.getBean("SpringDAO");
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
