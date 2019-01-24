import greenfoot.*;

/**
 * Write a description of class Myworldmorning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Myworldmorning extends World
{

    /**
     * Constructor for objects of class Myworldmorning.
     * 
     */
    public Myworldmorning()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(576, 392, 2); 
        
        addObject( new Asan(), 100, 250 );
        
        //----------ここから敵のランダム配置----------//
        
        int A = 250;
        int B = 500;
        int f = A + (int)(Math.random() * ((B-A)+1)); 
        addObject( new Bsan(), f, 230 );
        
    }
}
