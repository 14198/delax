import greenfoot.*;

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(1100, 800, 1); 
        super(600,400,1);
        showText("Spaceでゲームを開始してください",280,350);
        //addObject(new Title(), 600, 400);

    }
    
    public void act(){
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new game1());
            
        }
}
}