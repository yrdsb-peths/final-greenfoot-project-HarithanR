
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playerLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerLaser extends Actor
{
    /**
     * Act - do whatever the playerLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int enemyCount = 30;
    
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
            world.decreaseEnemyCount();
            world.createShip1();                        
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

    public void setEnemyCount(int enemy)
    {
        enemy = enemyCount;
    }
}
