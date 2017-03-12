package org.aoxide.seabattle.entities;

/**
 *
 * @author AOxide
 */
public class Game 
{
    private final Field field1;
    private final Field field2;
    private final long session1;
    private final long session2;
    
    public Game(long aSession1, long aSession2)
    {
        session1 = aSession1;
        session2 = aSession2;
        field1 = new Field();
        field2 = new Field();
    }
    
    public Long GetSession1()
    {
        return session1;
    }
    
    public Long GetSession2()
    {
        return session2;
    }
    
    public Field GetField1()
    {
        return field1;
    }
    
    public Field GetField2()
    {
        return field2;
    }
    
    public Field GetField(long session)
    {
        if (session == session1)
            return field1;
        else
        if (session == session2)
            return field2;
        else 
            return null;
                   
    }
}
