import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorldsunset extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public MyWorldsunset()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(576, 392, 2); 

        
        addObject( new Asan(), 100, 250 );
        
        //----------ここから敵のランダム配置----------//
        
        int A = 250;
        int B = 500;
        int f = A + (int)(Math.random() * ((B-A)+1)); 
        addObject( new Bsan(), f, 230 );
        

        //----------ここからトマトの配置----------//
        int X1=0,X2=600,Y1=0,Y2=400; 

        int x,y; 

        for(int i=0;i<5;i++){ 

            x = X1 + (int)(Math.random()*((X2-X1)+1)); 

            y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 

            addObject( new tomato(), x, y ); 

        } 
         addObject( new peach(), 450,260);


}
}
