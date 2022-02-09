import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2Forest extends World
{

    /**
     * Constructor for objects of class Level2Forest.
     * 
     */
    public Level2Forest()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Land land = new Land();
        addObject(land,450,580);
        NarutoPlayer2 narutoPlayer2 = new NarutoPlayer2();
        addObject(narutoPlayer2,111,411);
        //Branches
        Branch branch = new Branch();
        addObject(branch,110,466);
        Branch branch2 = new Branch();
        addObject(branch2,701,469);

        Branch branch4 = new Branch();
        addObject(branch4,285,365);
        Branch branch5 = new Branch();
        addObject(branch5,107,281);
        Branch branch6 = new Branch();
        addObject(branch6,786,311);

        Branch branch8 = new Branch();
        addObject(branch8,304,151);
        Branch branch9 = new Branch();
        addObject(branch9,766,179);
        Branch branch10 = new Branch();
        addObject(branch10,105,115);

        Branch3 branch32 = new Branch3();
        addObject(branch32,429,468);
        Branch3 branch33 = new Branch3();
        addObject(branch33,540,377);
        Branch3 branch37 = new Branch3();
        addObject(branch37,511,236);

        //Food
        Food food = new Food();
        addObject(food,720,431);
        Food food2 = new Food();
        addObject(food2,242,447);
        Food food3 = new Food();
        addObject(food3,79,205);
        Food food4 = new Food();
        addObject(food4,724,140);
        Food food5 = new Food();
        addObject(food5,740,275);
        Food food6 = new Food();
        addObject(food6,299,328);
        Food food7 = new Food();
        addObject(food7,115,205);
        Food food8 = new Food();
        addObject(food8,283,111);
        Food food9 = new Food();
        addObject(food9,506,135);
        Food food11 = new Food();
        addObject(food11,127,536);
        Food food12 = new Food();
        addObject(food12,210,536);
        Food food13 = new Food();
        addObject(food13,504,345);
        Food food14 = new Food();
        addObject(food14,431,345);
        Food food15 = new Food();
        addObject(food15,584,195);
        Food food16 = new Food();
        addObject(food16,447,135);
        Food food17 = new Food();
        addObject(food17,258,263);
        Food food18 = new Food();
        addObject(food18,842,465);
        Food food19 = new Food();
        addObject(food19,806,141);
        Food food20 = new Food();
        addObject(food20,593,513);
        Food food22 = new Food();
        addObject(food22,780,533);
        Food food21 = new Food();
        addObject(food21,348,532);
        food21.setLocation(356,534);
        //Enemies
        Ninja ninja = new Ninja();
        addObject(ninja,426,520);
        Ninja ninja2 = new Ninja();
        addObject(ninja2,841,520);
        //Door
        FinalDoor finalDoor = new FinalDoor();
        addObject(finalDoor,84,52);

        
        
    }
}
