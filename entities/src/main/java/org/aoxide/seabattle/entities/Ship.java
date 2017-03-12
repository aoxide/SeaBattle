package org.aoxide.seabattle.entities;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author AOxide
 */
public class Ship 
{
    private final List<Cell> Decks = new ArrayList<Cell>();
    
    public Ship()
    {
    }

    public Ship(List<Cell> Cells)
    {
        Decks.addAll(Cells);
    }
    
    public Cell GetDeck(int X, int Y)
    {
        for(Cell c: Decks)
        {
            if ((c.GetX() == X) | (c.GetY() == Y))
                    return c;
        }
        
        return null;
    }
}
