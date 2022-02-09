import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Retry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry extends Buttons
{
    /**
     * Act - do whatever the Retry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { if(Greenfoot.mouseClicked(this))
        {
            Buttons.music5.play();
            Greenfoot.setWorld(new Level1Maze());
            NextLevel.music2.stop();
            Play.music4Maze.play();
            
        }
        
    }    
}
