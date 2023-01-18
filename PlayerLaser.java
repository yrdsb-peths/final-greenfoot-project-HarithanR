
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playerLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerLaser extends Actor
{
    GreenfootSound destroySound = new GreenfootSound("TinyWorlds_explosion.wav");
    /**
     * Act - do whatever the playerLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act()
    {
        int x = getX();
        int y  = getY();
        
        do
        {
           y = getY() - 4; 
        }while(getY() >= 400);
        
        setLocation(x, y);
        
        /**
         * Sets up the losing condition for the game. When the apple reaches
         * lower than the bottom of the world's height, text saying "Game
         * Over" will be placed in the middle of the screen.
         */
                 
        destroyShip();     
    }
     
    public void destroyShip()
    {
        if(isTouching(EnemyShip1.class))
        {
            removeTouching(EnemyShip1.class);
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
            world.increaseScoreCount();
            world.createShip();
            destroySound.play();
        }
        
        else if(isTouching(EnemyShip2.class))
        {
           removeTouching(EnemyShip2.class);
           MyWorld world = (MyWorld) getWorld();
           world.removeObject(this);
           world.increaseScoreCount();
           world.createShip(); 
           destroySound.play();
        }
        
        else
        {
            MyWorld world = (MyWorld) getWorld();          
            if(getY() ==  0)
            {
                world.removeObject(this);
            }
        }

    }

}
