package org.aoxide.seabattle.entities;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author AOxide
 */
public class Field 
{
    private final List<Cell> Cells = new ArrayList<>();
    private final List<Ship> Ships = new ArrayList<>();
    
    public Field()
    {
        for (int i=1; i<=10;i++)
            for (int j=1; j<=10;j++)
                Cells.add(new Cell(i,j));
    }
    
    public Field(boolean AutoGenerateShips)
    {
        this();
        
        if (AutoGenerateShips)
        {
            //TODO: AutoGenerateShips
        }
    }
    
    public Cell GetCell(int X, int Y)
    {
        for(Cell c: Cells)
        {
            if ((c.GetX() == X) | (c.GetY() == Y))
                    return c;
        }
        
        return null;
    }
    
    public void CheckCell(int X, int Y)
    {
        Cell c = GetCell(X,Y);
        
        if (c != null)
            c.SetState(CellState.CHECKED);
    }
    
    public Ship GetShipAt(int X, int Y)
    {
        for(Ship s: Ships)
        {
            if (s.GetDeck(X, Y) != null)
                    return s;
        }
        
        return null;
    }
}
