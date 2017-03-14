package org.aoxide.seabattle.entities;

import org.aoxide.seabattle.dao.DAO;

/**
 *
 * @author AOxide
 */
public class Game 
{
    private long id;
    private final long session;
    private final Field myField;
    private final Field foreignField;
    private final DAO dao;
    private GameState state;
    
    public Game(DAO aDao, long aSession)
    {
        dao = aDao;
        session = aSession;
        myField = new MyField();
        foreignField = new Field();
        state = GameState.CREATED;
        dao.CreateGame(this);
    }
    
    public Long getSession()
    {
        return session;
    }
    
    public Field getMyField()
    {
        return myField;
    }
    
    public Field getForeignField()
    {
        return foreignField;
    }
    
    public long getId()
    {
        return id;
    }
    
    public void setId(long aId)
    {
        id = aId;
    }
    
    public void shot(int x, int y)
    {
        dao.Shot(this, session, x, y);
        foreignField.checkCell(x,y);
    }
    
    public GameState getState()
    {
        return state;
    }
}
