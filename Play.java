import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Play extends Buttons
{   static GreenfootSound music4Maze = new GreenfootSound("level1.mp3");
    public Play ()
    {
        
    GreenfootImage MyImage = getImage(); 
    int MyNewHeight = 50; 
    int MyNewWidth = 150; 
    MyImage.scale(MyNewWidth, MyNewHeight);
    }
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
          
           Buttons.music5.play();
            Greenfoot.setWorld(new Level1Maze());
            
            StartScreen.music.stop();
            music4Maze.playLoop();
            
            
            
        }
        
    }    
}
