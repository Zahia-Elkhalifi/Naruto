import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShipPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NarutoPlayer extends Naruto
   {   static GreenfootSound eating = new GreenfootSound("eat.mp3");
       static GreenfootSound Hit = new GreenfootSound ("Kunai Hit.wav");
 
    public NarutoPlayer(){
 
    GreenfootImage MyImage =getImage();
    
    }
    /**
     * Act - do whatever the ShipPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    
    {   
        move();
        eat();
        hitShuriken();
        hitBox();
    }
      
    public void move() 
    {   
        int y=getY();
        int x=getX();
        
        if(Greenfoot.isKeyDown("up"))
           {  setLocation(x,y-1);
               if(checkObstacle())
             { setLocation(x,y);
                 
              }
             
              
           }
        
        if(Greenfoot.isKeyDown("down"))
           {
             setLocation(x,y+1);
             if(checkObstacle())
             { setLocation(x,y);
              }
           }
        if(Greenfoot.isKeyDown("left"))
          { setLocation(x-1,y);
            if(checkObstacle())
             { setLocation(x,y);
              }
          }
        if(Greenfoot.isKeyDown("right"))
           {setLocation(x+1,y);
            if(checkObstacle())
             { setLocation(x,y);
              }
        }
        
      
        
    }
    
    public boolean checkObstacle()
    {
       
       
       if(isTouching(MazeBlock.class)||isTouching(Door.class))
       {
           return true;
       }
       else{
           return false;
        }
        
    }  
    
    public void eat ()
    {
        if(isTouching(Food.class))
        {   
            removeTouching(Food.class);
             eating.play();
        }
    }
    public void  hitShuriken()
    { 
        if(isTouching(ShurikenWeapon.class))
        { 
            
            Greenfoot.setWorld(new GameOver());
             
           
        }
    }
    public void  hitBox()
    { 
        if(isTouching(BoxTarget.class))
        { 
            Play.music4Maze.stop();
            Greenfoot.setWorld(new NextLevel()); 
            
            
        }
    }
}

