import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver2 extends World
{

    /**
     * Constructor for objects of class GameOver2.
     * 
     */
    public GameOver2()
    {    
        super(900, 600, 1); 
        
        Greenfoot.playSound("dark-souls-you-died-sound-effect.mp3");

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        Retry2 retry = new Retry2();
        addObject(retry,532,476);
    }
}
