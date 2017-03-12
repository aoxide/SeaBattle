package org.aoxide.seabattle.entities;

/**
 *
 * @author AOxide
 */
public class Cell 
{
    private final int X;
    private final int Y;
    private CellState state;
    
    public Cell(int aX, int aY)
    {
        X = aX;
        Y = aY;
        state = CellState.UNCHECKED;
    }
    
    public int GetX()
    {
        return X;
    }
    
    public int GetY()
    {
        return Y;
    }
    
    public CellState GetState()
    {
        return state;
    }
    
    public void SetState(CellState aState)
    {
        state = aState;
    }
}
