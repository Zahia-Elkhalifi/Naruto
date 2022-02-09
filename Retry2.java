import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Retry2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry2 extends Buttons
{
    /**
     * Act - do whatever the Retry2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { if(Greenfoot.mouseClicked(this))
        {
          
        
            Greenfoot.setWorld(new Level2Forest());
            
            Buttons.music5.play();
            Next.Level2.play();
        }
      
    }    
}
