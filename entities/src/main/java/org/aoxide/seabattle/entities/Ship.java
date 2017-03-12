package org.aoxide.seabattle.entities;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author AOxide
 */
public class Ship 
{
    private final List<Cell> decks = new ArrayList<Cell>();
    
    public Ship()
    {
    }

    public Ship(List<Cell> cells)
    {
        decks.addAll(cells);
    }
    
    public Cell GetDeck(int x, int y)
    {
        for(Cell c: decks)
        {
            if ((c.getX() == x) | (c.getY() == y))
                    return c;
        }
        
        return null;
    }
}
