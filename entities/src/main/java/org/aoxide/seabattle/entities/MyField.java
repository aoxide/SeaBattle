package org.aoxide.seabattle.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mstatsen
 */
public class MyField extends Field
{
    private final List<Ship> ships = new ArrayList<>();
    
    public MyField()
    {
        super();
    }
            
    public MyField(boolean AutoGenerateShips)
    {
        this();
        
        if (AutoGenerateShips)
        {
            //TODO: AutoGenerateShips
        }
    }
    
    public Ship GetShipAt(int X, int Y)
    {
        for(Ship s: ships)
        {
            if (s.GetDeck(X, Y) != null)
                    return s;
        }
        
        return null;
    }
    
    public List<Ship> getShips()
    {
        return ships;
    }
}
