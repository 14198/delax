import greenfoot.*;

/**
 * Write a description of class title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class title extends World
{

    /**
     * Constructor for objects of class title.
     * 
     */
    public title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(576, 392, 2);
        addObject(new button(),290,270);
        addObject(new titlegazou(),290,100);
        //showText("ボタン(仮)",280,250); //暫定表示場所

    }
        public void act(){


}
}
