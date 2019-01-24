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
<<<<<<< HEAD
        addObject(new Asan(),100,250);
        
        int X1=0,X2=600,Y1=0,Y2=400; 

        int x,y; 

        for(int i=0;i<5;i++){ 

            x = X1 + (int)(Math.random()*((X2-X1)+1)); 

            y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 

            addObject( new tomato(), x, y ); 

        } 

=======
<<<<<<< HEAD
        
        addObject( new Asan(), 100, 250 );
=======
        //showText("てすと",100,100);
         addObject( new Asan(), 100, 250 );
>>>>>>> 9aafe33ffb90e6faa298d904ba2d7e727b202e3a
>>>>>>> 9a668060e58e30bffbbdc47096fb9a477af86fc4
    }
}
