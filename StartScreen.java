import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class StartScreen extends World
{
    
    static GreenfootSound music = new GreenfootSound("I Said Im Naruto.mp3");
    
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    
    public  StartScreen()
    {    
        super(900, 600, 1); 
        prepare();
        music.play();
        Greenfoot.start();
        
    }
   

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
     
        addObject(new Play(),597,510);
        addObject(new Help(),259,512);
       
    }
    }
    
