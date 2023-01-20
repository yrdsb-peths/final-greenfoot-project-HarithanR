import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The explosion the player ship creates in the game over screen
 * 
 * Harithan Raveendran 
 * January 2023
 */
public class ExplosionPlayer extends Actor
{
    //Sets of an array and two timers for the classes below.
    GreenfootImage[] eExplosion = new GreenfootImage[6];
    SimpleTimer animationTimer = new SimpleTimer();
    SimpleTimer explosionTimer = new SimpleTimer();
    //Animates the explosion.
    public ExplosionPlayer()
    {
        for(int i = 0; i < 6; i++)
        {
            eExplosion[i] = new GreenfootImage("images/Master484_M4848ExplosionSet1/Explosion1-" + i + ".PNG");
            eExplosion[i].scale(100, 100);
        }
        animationTimer.mark();
        setImage(eExplosion[0]);
    }

    int imageIndex = 0;
    //Also animates the explosion.
    public void animateEnemyExplosion()
    {
        if(animationTimer.millisElapsed() < 75)
        {
            return;
        }
        animationTimer.mark();
        setImage(eExplosion[imageIndex]);
        imageIndex = (imageIndex + 1) % eExplosion.length;
    }

    //Removes the explosion when it finishes one cycle.
    public void removeExplosion()
    {
        GameOver gameover = (GameOver) getWorld();
        if(explosionTimer.millisElapsed() >= 500)
        {
            gameover.removeObject(this);
        }

    }
    
    //Implements the previous classes' functions into one singular class.
    public void act()
    {
        animateEnemyExplosion();
        removeExplosion();
    }
}
