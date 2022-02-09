import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ninja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ninja extends Obstacles
{
private int direction = 20;
    private void move() 
    { 
        // checking edges  
        if ((direction < 0 && getX() == 0) || (direction > 0 && getX() == getWorld().getWidth()-1)) direction = -direction ;  
        // movement 
        move(direction);            
    }
    
    public void OverNinja()
    {
        Actor Ninja = this.getOneIntersectingObject(NarutoPlayer2.class);
        if( Ninja != null)
        {  
           Next.Level2.stop();
           Greenfoot.setWorld(new GameOver2());
           
          
        } 
    }
    
    
    /**
     * Act - do whatever the Monkey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        OverNinja();
    }    
}
