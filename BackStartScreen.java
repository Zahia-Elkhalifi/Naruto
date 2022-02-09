import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackStartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackStartScreen extends Buttons{

    public BackStartScreen ()
    {   
        GreenfootImage MyImage = getImage();
        int MyNewHeight = MyImage.getHeight()/18;
        int MyNewWidth = MyImage.getWidth()/18;
        MyImage.scale(MyNewWidth, MyNewHeight);
    }
    /**
     * Act - do whatever the BackStartScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Buttons.music5.play();
            
            Greenfoot.setWorld(new StartScreen()); 
            Level1Maze.music4.stop();
            
        }
    }    
}

