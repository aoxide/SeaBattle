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
        Game game = new Game(dao, 0L);
        createShips(game);
        game.shot(5, 5);
    }
    
    public static void createShips(Game game)
    {
        
    }
}
