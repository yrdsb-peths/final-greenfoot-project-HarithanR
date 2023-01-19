import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExplosionEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExplosionEnemy extends Actor
{
    GreenfootImage[] eExplosion = new GreenfootImage[6];
    SimpleTimer animationTimer = new SimpleTimer();
    SimpleTimer explosionTimer = new SimpleTimer();
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
    
    public void removeExplosion()
    {
        MyWorld world = (MyWorld) getWorld();
        if(explosionTimer.millisElapsed() >= 500)
        {
            world.removeObject(this);
        }
        
    }
    
    public void act()
    {
        animateEnemyExplosion();
        removeExplosion();
    }
}