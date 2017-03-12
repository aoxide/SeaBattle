package org.aoxide.seabattle.entities;

import org.aoxide.seabattle.dao.DAO;

/**
 *
 * @author AOxide
 */
public class Game 
{
    private long id;
    private final Field field1;
    private final Field field2;
    private final long session1;
    private final long session2;
    private final DAO dao;
    private GameState state;
    
    public Game(DAO aDao, long aSession1, long aSession2)
    {
        dao = aDao;
        session1 = aSession1;
        session2 = aSession2;
        field1 = new Field();
        field2 = new Field();
        state = GameState.CREATED;
        dao.CreateGame(this);
    }
    
    public Long getSession1()
    {
        return session1;
    }
    
    public Long getSession2()
    {
        return session2;
    }
    
    public Field getField1()
    {
        return field1;
    }
    
    public Field getField2()
    {
        return field2;
    }
    
    public Field getField(long session)
    {
        if (session == session1)
            return field1;
        else
        if (session == session2)
            return field2;
        else 
            return null;
    }
    
    public long getId()
    {
        return id;
    }
    
    public void setId(long aId)
    {
        id = aId;
    }
    
    /**
    *
    * @param session_id - who shot
    */
    public void shot(long session_id, int x, int y)
    {
        dao.Shot(this, session_id, x, y);
        
        if (session_id == session1)
          getField(session2).checkCell(x, y);
        else getField(session1).checkCell(x, y);
                
    }
    
    public GameState getState()
    {
        return state;
    }
}
