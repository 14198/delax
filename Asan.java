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
    private int clear=0;
    
    

    public void HUMAN(){ 

        fruits = 0; 
        //clear  = clear + 1;

    } 

     

    public void act()  

    { 

     

      eat(); 
      
      getImage().scale(150,150);
        if( Greenfoot.isKeyDown( "up" )){
            setRotation(270);
            move(10);
        }else if( Greenfoot.isKeyDown( "down" )){
            setRotation(90);
            move(10);
        }else if( Greenfoot.isKeyDown( "right" )){
            setRotation(0);
            move(10);
        }else if(Greenfoot.isKeyDown("left")){
            setRotation(180);
            move(10);
        }
    }

   public void eat(){ 

      Actor actor = getOneObjectAtOffset( 0, 0, tomato.class ); 
      Actor peach = getOneObjectAtOffset( 0, 0, peach. class);
      Actor Bsan = getOneObjectAtOffset( 0, 0, Bsan. class);
     

      if( actor != null ){ 

          fruits++; 

          getWorld().removeObject( actor ); 

          if(fruits >= 5) {         //トマトクリア

              //getWorld().showText("　　ゲームクリア！", 50, 50); 
              //Greenfoot.setWorld(new MyWorldsunset());
              
              //Greenfoot.stop(); 

              getWorld().showText("" +fruits, 480, 363); 
          }else { 

              getWorld().showText("" +fruits, 480, 363); 

          } 

      } 
//=================クリア条件============//
  if(peach != null){        //コードは問題ないが、サイズの問題でプログラムで縮小しても元のサイズで判定されてる？？
      clear = clear+1;
      if(clear == 1)
      {
           Greenfoot.setWorld(new MyWorldsunset());
           //clear++;            
           getWorld().showText("" +clear, 50, 50); 
        }
      }else if(clear == 2){
           Greenfoot.setWorld(new Myworldnight());
           //clear++;  
      }else if(clear == 3)
      {
          //clear++;
      }
      if(Bsan != null)
      {
          Greenfoot.stop();
          getWorld().showText("　　ゲームオーバー！", 50, 50); 
      }
   }
}   