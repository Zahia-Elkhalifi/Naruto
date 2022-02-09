import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends World
{

    /**
     * Constructor for objects of class HowToPlay.
     * 
     */
    public HowToPlay()
    {    
        // Create a new world with 900x600 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
       
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        
        addObject(new BackStartScreen(),849,50);
        
    }
}