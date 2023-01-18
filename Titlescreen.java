import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titlescreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Titlescreen extends World
{
    Label titleLabel = new Label("Space Shooter", 50);
    Label instruction1 = new Label("Use <-- and --> or A and D to move", 30);
    Label instruction2 = new Label("Hold space to shoot", 30);
    Label instruction3 = new Label("Press enter to start the game", 30);
    /**
     * Constructor for objects of class Titlescreen.
     * 
     */
    public Titlescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 20);
        addObject(instruction1, getWidth()/2, 60);
        addObject(instruction2, getWidth()/2, 100);
        addObject(instruction3, getWidth()/2, 140);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        DecorationPlayerShip decorationPlayerShip = new DecorationPlayerShip();
        addObject(decorationPlayerShip,294,238);
        decorationPlayerShip.setLocation(306,245);
        ExtrasMyWorld extrasMyWorld = new ExtrasMyWorld();
        addObject(extrasMyWorld,483,60);
        ExtrasMyWorld extrasMyWorld2 = new ExtrasMyWorld();
        addObject(extrasMyWorld2,341,58);
        extrasMyWorld2.setLocation(298,57);
        ExtrasMyWorld extrasMyWorld3 = new ExtrasMyWorld();
        addObject(extrasMyWorld3,298,57);
        extrasMyWorld2.setLocation(228,57);
        ExtrasMyWorld extrasMyWorld4 = new ExtrasMyWorld();
        addObject(extrasMyWorld4,228,57);
        extrasMyWorld4.setLocation(138,53);
        ExtrasMyWorld extrasMyWorld5 = new ExtrasMyWorld();
        addObject(extrasMyWorld5,138,53);
        ExtrasMyWorld extrasMyWorld6 = new ExtrasMyWorld();
        addObject(extrasMyWorld6,128,185);
        ExtrasMyWorld extrasMyWorld7 = new ExtrasMyWorld();
        addObject(extrasMyWorld7,463,197);
        ExtrasMyWorld extrasMyWorld8 = new ExtrasMyWorld();
        addObject(extrasMyWorld8,474,328);
        ExtrasMyWorld extrasMyWorld9 = new ExtrasMyWorld();
        addObject(extrasMyWorld9,122,316);
        ExtrasMyWorld extrasMyWorld10 = new ExtrasMyWorld();
        addObject(extrasMyWorld10,137,208);
        extrasMyWorld7.setLocation(459,174);
        ExtrasMyWorld extrasMyWorld11 = new ExtrasMyWorld();
        addObject(extrasMyWorld11,459,174);
        ExtrasMyWorld extrasMyWorld12 = new ExtrasMyWorld();
        addObject(extrasMyWorld12,473,58);
        ExtrasMyWorld extrasMyWorld13 = new ExtrasMyWorld();
        addObject(extrasMyWorld13,72,200);
        extrasMyWorld9.setLocation(77,298);
        ExtrasMyWorld extrasMyWorld14 = new ExtrasMyWorld();
        addObject(extrasMyWorld14,77,298);
        extrasMyWorld6.setLocation(160,186);
        ExtrasMyWorld extrasMyWorld15 = new ExtrasMyWorld();
        addObject(extrasMyWorld15,160,186);
        extrasMyWorld8.setLocation(392,322);
        ExtrasMyWorld extrasMyWorld16 = new ExtrasMyWorld();
        addObject(extrasMyWorld16,392,322);
        extrasMyWorld7.setLocation(407,185);
        ExtrasMyWorld extrasMyWorld17 = new ExtrasMyWorld();
        addObject(extrasMyWorld17,407,185);
        extrasMyWorld7.setLocation(378,150);
        ExtrasMyWorld extrasMyWorld18 = new ExtrasMyWorld();
        addObject(extrasMyWorld18,378,150);
        extrasMyWorld11.setLocation(520,223);
        EnemyShip3 enemyShip3 = new EnemyShip3();
        addObject(enemyShip3,520,223);
        extrasMyWorld11.setLocation(599,199);
        removeObject(enemyShip3);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
