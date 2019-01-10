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
<<<<<<< HEAD
       
        
        if( Greenfoot.isKeyDown( "up" )){
=======
       if( Greenfoot.isKeyDown( "down" )){
            setRotation(90);
            move(4); // Add your action code here.
        }
           if(Greenfoot.isKeyDown("right")){
           setRotation(0); 
           move(4);
        }

        else if( Greenfoot.isKeyDown( "up" )){
>>>>>>> 149a8a233d6ad229e8e263379eda559176c1ed01
            setRotation(270);
            move(10);
        }else if( Greenfoot.isKeyDown( "down" )){
            setRotation(90);
            move(10);
        }
<<<<<<< HEAD
    } }   

=======
        if(Greenfoot.isKeyDown("left")){
        setRotation(180);
        move(4);
    }

    }  

    }    
>>>>>>> 149a8a233d6ad229e8e263379eda559176c1ed01

