import greenfoot.*; 

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1Maze extends World
{    
     static GreenfootSound music4 = new GreenfootSound("level1.mp3");
    /*the shape of tha map:
      b:box,f:food,s:shuriken,n:naruto*/
      String[] textMap = {
          "bbbbbbbbbbbbbbbbbbbbbb",
        "btbfs              ffb",
        "bdbb bb  b bbbb   f fb",
        "b b  fb  b bf    fbbbb",
        "bf   fb  b b b      fb",
        "bbbbbbb  bfb b   bbb b",
        "bfbfbfbffbbbfbf  bfb b",
        "b b b bbbb bbbbb b b b",
        "bs               b bfb",
        "b b bbbbbbbbbbbb b bbb",    
        "b bfbf        fb b n",
        "b bbbf fbbbf    fb bbb",
        "b bfbbbbbfbbbb bbb bfb",
        "bfs                  b",
        "bbbbbbbbbbbbbbbbbbbbbb"
        
        
     
    };

    /**
     * Constructor for objects of class MyWorld 
     * 
     */
    public Level1Maze()
    {    
       super(22, 15, 40);
       drawMap();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
   
  
private void drawMap(){
    for(int i=0;i < textMap.length;i++)
    {
        String mapLine =textMap[i];
        for(int j=0;j<mapLine.length();j++)
                {
            char mapChar =mapLine.charAt(j);
            int y=i;
            int x=j;
            switch(mapChar)
                  {
                    case 'b':
                        addObject(new MazeBlock(), x, y);
                        break;
                    case 'f':
                        addObject(new Food(), x, y);
                        break;
                    case 's':
                         addObject(new ShurikenWeapon(), x, y);
                         break;
                    case 'n':
                         addObject(new NarutoPlayer(), x, y);   
                         break;
                    case 't':
                         addObject(new BoxTarget(), x, y);   
                         break;
                    case 'd':
                         addObject(new Door(), x, y);   
                         break;     
                    default:
                         break;
            
                   } 
                }
         }   
    }   
}                   


