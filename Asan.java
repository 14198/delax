import greenfoot.*;

/**
 * Write a description of class Asan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asan extends Actor
{
    /**
     * Act - do whatever the Asan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if( Greenfoot.isKeyDown( "down" )){
            setRotation(90);
            move(4); // Add your action code here.
        }

           if(Greenfoot.isKeyDown("right")){
           setRotation(0); 
           move(4);
        }


        else if( Greenfoot.isKeyDown( "up" )){
            setRotation(270);
            move(10);
        }
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")){
        setRotation(180);
        move(4);
    }
    }    
}

