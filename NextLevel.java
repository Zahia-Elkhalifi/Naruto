import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel extends World
{ /**
     * Constructor for objects of class YouWin.
     * 
     */
    static GreenfootSound music2 = new GreenfootSound("end.mp3");
    public NextLevel()
    {    

        super(900, 600, 1); 
        prepare();
         music2.play();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Next Next = new Next();
        addObject(Next,798,539);
        Next.setLocation(790,539);
       
    }
}
