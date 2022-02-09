import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 *    
 */
public class Door extends DecorForLevel1
{   public Door(){
 
    GreenfootImage MyImage =getImage();
    
   
}
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        removeDoor();
    }    
    public void removeDoor(){
        if(getWorld().getObjects(Food.class).isEmpty())
        {   
            
            getWorld().removeObjects(getWorld().getObjects(Door.class));
            Buttons.music5.play();
            
        }
        
    }
}
