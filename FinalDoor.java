import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalDoor extends DecorForLevel2
{
    public FinalDoor()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2 , image.getHeight()/2 );
        setImage(image);
    }
    
    public void OverDoor()
    {
        Actor FinalDoor = this.getOneIntersectingObject(NarutoPlayer2.class);
        if( FinalDoor != null)
        {
            getWorld().removeObjects(getWorld().getObjects(FinalDoor.class));
            Next.Level2.stop();
            Greenfoot.setWorld(new YouWin());
           
        }
    }
 
    public void EndGame()
    {
       if (getWorld().getObjects(Food.class).isEmpty())
       {
           OverDoor();
        
       } 
    }
   
    /**
     * Act - do whatever the Balloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        EndGame();// Add your action code here.
        
    }    
}
 

