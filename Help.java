import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Help extends Buttons
{   
    
    public Help ()
    {
    GreenfootImage MyImage = getImage(); 
    int MyNewHeight = 50; 
    int MyNewWidth = 150; 
    MyImage.scale(MyNewWidth, MyNewHeight);
    }
   
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
          Buttons.music5.play();
          //StartScreen.music.stop();
          //how.play();
          Greenfoot.setWorld(new HowToPlay());
          
          
          
          
        }
    }    
}

