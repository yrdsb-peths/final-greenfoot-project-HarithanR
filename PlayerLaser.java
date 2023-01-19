
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
    SimpleTimer animationTimer = new SimpleTimer();
    public static int playLaserx = 297;
    public static int playLasery = 356;
    /**
     * Act - do whatever the playerLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        //animationTimer.mark();
        playLaserx = getX();
        playLasery = getY();

        playLasery = playLasery - 4;

        /*do
        {
        playLasery = getY() - 4; 
        }while(getY() >= 400);*/

        setLocation(playLaserx, playLasery);
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
            destroySound.play();
            ExplosionEnemy explosion = new ExplosionEnemy();
            world.addObject(explosion,playLaserx,playLasery);
            world.removeObject(this);
            world.increaseScoreCount();
            world.createShip();

        }
        else if(isTouching(EnemyShip2.class))
        {
            removeTouching(EnemyShip2.class);
            MyWorld world = (MyWorld) getWorld();
            destroySound.play();
            ExplosionEnemy explosion = new ExplosionEnemy();
            world.addObject(explosion,playLaserx,playLasery);
            world.removeObject(this);
            world.increaseScoreCount();
            world.createShip(); 
        }
        else if(isTouching(EnemyShip3.class))
        {
            removeTouching(EnemyShip3.class);
            MyWorld world = (MyWorld) getWorld();
            destroySound.play();
            ExplosionEnemy explosion = new ExplosionEnemy();
            world.addObject(explosion,playLaserx,playLasery);
            world.removeObject(this);
            world.increaseScoreCount();
            world.createShip(); 
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
