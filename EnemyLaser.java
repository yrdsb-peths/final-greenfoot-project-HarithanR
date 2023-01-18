import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyLaser extends Actor
{
    
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
           y = getY() + 10; 
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
        if(isTouching(PlayerShip.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
            world.decreaseLife();
        }
        
        else
        {
            MyWorld world = (MyWorld) getWorld();
            if(getY() ==  390)
            {
            
                world.removeObject(this);
            }
        }
        
        /*else
        {
            MyWorld world = (MyWorld) getWorld();          
            if(getY() ==  400)
            {
                world.removeObject(this);
            }
        }*/

    }
}

