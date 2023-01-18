import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    Label titleLabel = new Label("Game Over", 50);
    Label restartLabel = new Label("Press R to restart", 50);
    DecorationPlayerShip decorationPlayerShip = new DecorationPlayerShip();
    SimpleTimer titleTimer = new SimpleTimer();
    SimpleTimer shipTimer = new SimpleTimer();
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //addObject(titleLabel, getWidth()/2, 50);
        shipTimer.mark();
        if(shipTimer.millisElapsed() > 300)
        {
            GameOver gameOver = (GameOver) getWorld();
            titleTimer.mark();
            gameOver.removeObject(decorationPlayerShip);
        }
        
        if(titleTimer.millisElapsed() > 700)
        {
            GameOver gameOver = (GameOver) getWorld();
            addObject(titleLabel, getWidth()/2, 50);
        }
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(decorationPlayerShip,285,191);
        decorationPlayerShip.setLocation(300,206);
    }
    
    public void cutscene()
    {
        
    }
}
