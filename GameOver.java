import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The screen that occurs whenever the player loses. In other words, loses all three of their lives.
 * 
 * Harithan Raveendran 
 * January 2023
 */
public class GameOver extends World
{
    //Instances of several labels, sounds, an asset and a timer.
    Label titleLabel = new Label("Game Over", 50);
    Label restartLabel = new Label("Press R to restart", 50);
    Label leaveLabel = new Label("Press esc to go back to the menu", 40);
    DecorationPlayerShip decorationPlayerShip = new DecorationPlayerShip();
    SimpleTimer timer = new SimpleTimer();

    GreenfootSound gameOverSound = new GreenfootSound("Sudocolon_Icy_Game_Over.mp3");
    GreenfootSound destroySound = new GreenfootSound("TinyWorlds_explosion.wav");
    /**
     * Marks a timer for the act class and adds several new images to the world. Such as a player ship and the stars in the background.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        timer.mark();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(decorationPlayerShip,285,191);
        decorationPlayerShip.setLocation(300,265);
        ExtrasMyWorld extrasMyWorld = new ExtrasMyWorld();
        addObject(extrasMyWorld,478,69);
        ExtrasMyWorld extrasMyWorld2 = new ExtrasMyWorld();
        addObject(extrasMyWorld2,476,179);
        ExtrasMyWorld extrasMyWorld3 = new ExtrasMyWorld();
        addObject(extrasMyWorld3,467,283);
        ExtrasMyWorld extrasMyWorld4 = new ExtrasMyWorld();
        addObject(extrasMyWorld4,460,326);
        extrasMyWorld3.setLocation(424,324);
        ExtrasMyWorld extrasMyWorld5 = new ExtrasMyWorld();
        addObject(extrasMyWorld5,424,324);
        ExtrasMyWorld extrasMyWorld6 = new ExtrasMyWorld();
        addObject(extrasMyWorld6,459,193);
        ExtrasMyWorld extrasMyWorld7 = new ExtrasMyWorld();
        addObject(extrasMyWorld7,423,99);
        ExtrasMyWorld extrasMyWorld8 = new ExtrasMyWorld();
        addObject(extrasMyWorld8,400,166);
        extrasMyWorld3.setLocation(390,291);
        ExtrasMyWorld extrasMyWorld9 = new ExtrasMyWorld();
        addObject(extrasMyWorld9,390,291);
        extrasMyWorld7.setLocation(314,128);
        ExtrasMyWorld extrasMyWorld10 = new ExtrasMyWorld();
        addObject(extrasMyWorld10,314,128);
        extrasMyWorld8.setLocation(321,236);
        ExtrasMyWorld extrasMyWorld11 = new ExtrasMyWorld();
        addObject(extrasMyWorld11,321,236);
        ExtrasMyWorld extrasMyWorld12 = new ExtrasMyWorld();
        addObject(extrasMyWorld12,304,312);
        extrasMyWorld7.setLocation(331,83);
        ExtrasMyWorld extrasMyWorld13 = new ExtrasMyWorld();
        addObject(extrasMyWorld13,331,83);
        extrasMyWorld12.setLocation(174,316);
        ExtrasMyWorld extrasMyWorld14 = new ExtrasMyWorld();
        addObject(extrasMyWorld14,174,316);
        extrasMyWorld14.setLocation(140,308);
        ExtrasMyWorld extrasMyWorld15 = new ExtrasMyWorld();
        addObject(extrasMyWorld15,140,308);
        ExtrasMyWorld extrasMyWorld16 = new ExtrasMyWorld();
        addObject(extrasMyWorld16,144,180);
        extrasMyWorld10.setLocation(178,76);
        ExtrasMyWorld extrasMyWorld17 = new ExtrasMyWorld();
        addObject(extrasMyWorld17,178,76);
        ExtrasMyWorld extrasMyWorld18 = new ExtrasMyWorld();
        addObject(extrasMyWorld18,262,70);
        ExtrasMyWorld extrasMyWorld19 = new ExtrasMyWorld();
        addObject(extrasMyWorld19,132,167);
        ExtrasMyWorld extrasMyWorld20 = new ExtrasMyWorld();
        addObject(extrasMyWorld20,248,200);
        ExtrasMyWorld extrasMyWorld21 = new ExtrasMyWorld();
        addObject(extrasMyWorld21,224,298);
        extrasMyWorld11.setLocation(244,304);
        ExtrasMyWorld extrasMyWorld22 = new ExtrasMyWorld();
        addObject(extrasMyWorld22,244,304);
        extrasMyWorld10.setLocation(255,154);
        ExtrasMyWorld extrasMyWorld23 = new ExtrasMyWorld();
        addObject(extrasMyWorld23,255,154);
        ExtrasMyWorld extrasMyWorld24 = new ExtrasMyWorld();
        addObject(extrasMyWorld24,201,52);
        ExtrasMyWorld extrasMyWorld25 = new ExtrasMyWorld();
        addObject(extrasMyWorld25,135,61);
        extrasMyWorld17.setLocation(173,44);
        ExtrasMyWorld extrasMyWorld26 = new ExtrasMyWorld();
        addObject(extrasMyWorld26,173,44);
        ExtrasMyWorld extrasMyWorld27 = new ExtrasMyWorld();
        addObject(extrasMyWorld27,177,209);
        ExtrasMyWorld extrasMyWorld28 = new ExtrasMyWorld();
        addObject(extrasMyWorld28,154,335);
        extrasMyWorld16.setLocation(150,209);
        ExtrasMyWorld extrasMyWorld29 = new ExtrasMyWorld();
        addObject(extrasMyWorld29,150,209);
        extrasMyWorld2.setLocation(408,163);
        ExtrasMyWorld extrasMyWorld30 = new ExtrasMyWorld();
        addObject(extrasMyWorld30,408,163);
        ExtrasMyWorld extrasMyWorld31 = new ExtrasMyWorld();
        addObject(extrasMyWorld31,424,88);
        ExtrasMyWorld extrasMyWorld32 = new ExtrasMyWorld();
        addObject(extrasMyWorld32,470,37);
        extrasMyWorld10.setLocation(158,101);
        ExtrasMyWorld extrasMyWorld33 = new ExtrasMyWorld();
        addObject(extrasMyWorld33,158,101);
    }
    
    /*
     * This code consists of several buttons that lead the player to different worlds. It also sets up a timer to make the game over
     * cutscene work.
     */
    public void act()
    {
        //Sends the player to the MyWorld world. In other words, it restarts the game.
        if(Greenfoot.isKeyDown("r"))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
            gameOverSound.stop();
        }
        
        //Sends the player to the main menu.
        if(Greenfoot.isKeyDown("escape"))
        {
            Titlescreen menu = new Titlescreen();
            Greenfoot.setWorld(menu);
            gameOverSound.stop();
        }
        
        //The following series of code is used to play the game over cutscene.
        if(timer.millisElapsed() > 750 && timer.millisElapsed() < 800)
        {
            removeObject(decorationPlayerShip);
            destroySound.play();
            ExplosionPlayer explosion = new ExplosionPlayer();
            addObject(explosion,getWidth()/2,265); 
        }  

        if(timer.millisElapsed() > 2500 && timer.millisElapsed() < 2700)
        {
            addObject(titleLabel, getWidth()/2, 50);
            gameOverSound.play();
        }  
        
        if(timer.millisElapsed() > 6000)
        {
            addObject(restartLabel, getWidth()/2, 100);
            addObject(leaveLabel, getWidth()/2, 150);
        }
    }
}
