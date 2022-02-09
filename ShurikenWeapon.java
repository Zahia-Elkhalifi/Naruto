import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shuriken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShurikenWeapon extends Obstacles
{       int speed=1;
    public ShurikenWeapon()
    {
        GreenfootImage myImage =getImage();
        int myNewHeight =40;
        int myNewWidth=40;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Shuriken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
       move();
       OverShuriken(); 
    } 
    public void move()
    {
     setLocation(getX()+speed,getY());
     if(checkObstacle())
        {
       speed=-speed;
       setLocation(getX()+speed,getY());
        }
          
    }
    public boolean checkObstacle()
    { 
       if(isTouching(MazeBlock.class)||isTouching(Food.class)||isTouching(BackStartScreen.class))
       { 
           return true;
       }
       else{
           return false;
        }
        
    } 
    public void OverShuriken ()
    {
        Actor ShurikenWeapon = this.getOneIntersectingObject(NarutoPlayer.class); 
        if(ShurikenWeapon != null)
        {   
            Play.music4Maze.stop();
            Greenfoot.setWorld(new GameOver());
            
        }
    }
}
    

