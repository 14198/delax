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
    
    private int fruits; 
    
    

    public void HUMAN(){ 

        fruits = 0; 

    } 

     

    public void act()  

    { 

      move(); 

      eat(); 
      
      getImage().scale(150,150);

    }     

    
    public void move() 
    {


        if( Greenfoot.isKeyDown( "up" )){ 

          setRotation(90); 

          move(4); 

      }else if( Greenfoot.isKeyDown( "down" )){ 

          setRotation(270); 

          move(4); 

      }else if( Greenfoot.isKeyDown( "left" )){ 

          setRotation(0); 

          move(4); 

      }else if( Greenfoot.isKeyDown( "right" )){ 

          setRotation(180); 

          move(4); 

      } 
    }
    
    public void eat(){ 

      Actor actor = getOneObjectAtOffset( 0, 0, tomato.class ); 

      if( actor != null ){ 

          fruits++; 

          getWorld().removeObject( actor ); 

          if(fruits >= 10) { 

              getWorld().showText("　　ゲームクリア！", 50, 50); 

              Greenfoot.stop(); 

          }else { 

              getWorld().showText("" +fruits, 480, 363); 

          } 

      } 

    } 
}   

