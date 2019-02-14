import greenfoot.*;

/**
 * Write a description of class Bsan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bsan extends Actor
{
    private int rtime = 100;
    private int a = 2;
    /**
     * Act - do whatever the Bsan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //----------敵を自動で動かすプログラム(暫定)----------//
        //**
        rtime--;
        move(a);
        if(rtime == 0 && a>0)
        {
            int A =50;     //乱数で動かす範囲を選定??
            int B = 155;
            int f = A + (int)(Math.random()*((B-A)+1));
            rtime = f;
            int C = -1;
            int D = -3;
            int g = C + (int)(Math.random()*((D-C)-1));
    
            a = g;
            
        }
        if(rtime == 0 && a<0)
        {
            int A =50; //乱数で動かす範囲を選定??
            int B = 155;
            int f = A + (int)(Math.random()*((B-A)+1));
            rtime = f;
            int C = 1;
            int D = 3;
            int g = C + (int)(Math.random()*((D-C)+1));
    
            a = g;
           
        
        }
        //*/
       
         
    }    
}
