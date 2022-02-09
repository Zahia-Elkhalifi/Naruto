import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NarutoPlayer2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NarutoPlayer2 extends Naruto
{
     private final int gravity = 12;
    private int speed;
  
    GreenfootSound eating = new GreenfootSound("eat.mp3");
    public void JUMP ()
    {
        speed = 0;
    }
    public NarutoPlayer2()
    {
        GreenfootImage image = getImage();
        
    }  
    public void act() 
    {
       fall();
       walk(); 
       checkCollision();
     
    }

    public void fall()
    {
        setLocation(getX(), getY()+ speed);
        if(isTouchLand())
        {
            speed = 0;
            while (isTouchLand())
            {
                setLocation(getX(), getY()-1);
            }
            setLocation(getX(), getY()+1);
        }
        else speed += gravity;
    }
    
    public void jump()
    {
        speed = -35;
    }
    
    public void walk()
    {
        int y= getY();
        int x= getX();
        if(Greenfoot.isKeyDown("RIGHT")) 
         {
             x+=30;
         }
        if(Greenfoot.isKeyDown("LEFT")) 
         {
             x-=30;
         }
        if(Greenfoot.isKeyDown("UP") && isTouchLand()) jump();
        setLocation(x, y);
    }
    
    public boolean isTouchLand()
    {
        boolean TouchLand= false;
        
        if (getY() > getWorld().getHeight()-20)TouchLand=true;
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        
        if (getOneObjectAtOffset(imageWidth/4, imageHeight/3,Wood.class)!=null ||
            getOneObjectAtOffset(imageWidth/-4, imageHeight/3,Wood.class) !=null)
            TouchLand=true;
            
       
        
        if (getOneObjectAtOffset(imageWidth/2, imageHeight/2,Land.class)!=null || 
            getOneObjectAtOffset(imageWidth/-2, imageHeight/2,Land.class) !=null)
            TouchLand=true;
        
            return TouchLand;
    }
    
    private void checkCollision()
    {
         if (isTouching(Food.class)) 
        {
            NarutoPlayer.eating.play();
            removeTouching(Food.class);
            
            
        }
    }   
}
