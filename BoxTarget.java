import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TargetBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoxTarget extends Commun
{public BoxTarget(){
 
    GreenfootImage myImage =getImage();
  
   
}
public void OverDoor()
    {
        Actor BoxTarget = this.getOneIntersectingObject(NarutoPlayer.class);
        if( BoxTarget != null)
        {
            getWorld().removeObjects(getWorld().getObjects(BoxTarget.class));
            
            Greenfoot.setWorld(new NextLevel());
            
           
        }
    }
    
    /**
     * Act - do whatever the TargetBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   OverDoor();
        // Add your action code here.
        
        
    }    
}
