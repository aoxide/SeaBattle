package org.aoxide.seabattle.entities;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author AOxide
 */
public class Field 
{
    private final List<Cell> cells = new ArrayList<>();
    
    public Field()
    {
        for (int i=1; i<=10;i++)
            for (int j=1; j<=10;j++)
                cells.add(new Cell(i,j));
    }
    
    public Cell getCell(int X, int Y)
    {
        for(Cell c: cells)
        {
            if ((c.getX() == X) | (c.getY() == Y))
                    return c;
        }
        
        return null;
    }
    
    public void checkCell(int X, int Y)
    {
        Cell c = getCell(X,Y);
        
        if (c != null)
            c.setState(CellState.CHECKED);
    }
    
}
