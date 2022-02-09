import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWin extends World
{

    /**
     * Constructor for objects of class YouWin.
     * 
     */
    
    public YouWin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        NextLevel.music2.play();

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Retry retry = new Retry();
        addObject(retry,778,539);
    }
}
