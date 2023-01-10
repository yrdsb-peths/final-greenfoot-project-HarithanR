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
    public PlayerShip pShip;
    public void act()
    {
        int x = getX();
        int y  = getY();

        setLocation(x, y);
        destroyShip();
        /**
         * Sets up the losing condition for the game. When the apple reaches
         * lower than the bottom of the world's height, text saying "Game
         * Over" will be placed in the middle of the screen.
         */

        MyWorld world = (MyWorld) getWorld();
        
        pShip = new PlayerShip();
        if(Greenfoot.isKeyDown("space"))
        {
            PlayerLaser pLaser = new PlayerLaser();
            addObject(pLaser,getPlayerLocationx,316);
        }

        if(getY() <= -10)
        {
            world.gameOver();
            world.removeObject(this);

        }

                
    }

    public void destroyShip()
    {
        if(isTouching(EnemyShip1.class))
        {
            removeTouching(EnemyShip1.class);
            MyWorld world = (MyWorld) getWorld();
            world.createShip1();             
        }

    }

    public void setEnemyCount(int enemy)
    {
        enemy = enemyCount;
    }
}
