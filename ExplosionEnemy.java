import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The explosion the enemy creates upon dying.
 * 
 * Harithan Raveendran
 * January 2023
*/
public class ExplosionEnemy extends Actor
{
    //Sets up an array and two timers for the classes below.
    GreenfootImage[] eExplosion = new GreenfootImage[6];
    SimpleTimer animationTimer = new SimpleTimer();
    SimpleTimer explosionTimer = new SimpleTimer();
    //Animates the explosion
    public ExplosionEnemy()
    {
        for(int i = 0; i < 6; i++)
        {
            eExplosion[i] = new GreenfootImage("images/Master484_M4848ExplosionSet1/Explosion1-" + i + ".PNG");
        }
        animationTimer.mark();
        setImage(eExplosion[0]);
    }

    int imageIndex = 0;
    //Also animates the explosion
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
    
    //Removes the explosion upon finishing one full cycle.
    public void removeExplosion()
    {
        MyWorld world = (MyWorld) getWorld();
        if(explosionTimer.millisElapsed() >= 500)
        {
            world.removeObject(this);
        }

    }
    
    //The class that implements the ones before it to allow them to work.
    public void act()
    {
        animateEnemyExplosion();
        removeExplosion();
    }
}
