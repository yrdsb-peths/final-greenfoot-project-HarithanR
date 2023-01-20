
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The laser the player shoots upon pressing space.
 * 
 * Harithan Raveendran 
 * January 2023
 */
public class PlayerLaser extends Actor
{
    //Sets up integers, a sound file and an timer for the classes below.
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
        playLaserx = getX();
        playLasery = getY();

        playLasery = playLasery - 4;

        setLocation(playLaserx, playLasery);
      

        destroyShip(); 
    }
    
    //Allows the laser to destroy every ship it touches. Also removes it upon reaching the edge of the world.
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
