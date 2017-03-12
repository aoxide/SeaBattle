package org.aoxide.seabattle.entities;

/**
 *
 * @author AOxide
 */
public class Cell 
{
    private final int x;
    private final int y;
    private CellState state;
    
    public Cell(int aX, int aY)
    {
        x = aX;
        y = aY;
        state = CellState.UNCHECKED;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public CellState getState()
    {
        return state;
    }
    
    public void setState(CellState aState)
    {
        state = aState;
    }
}
