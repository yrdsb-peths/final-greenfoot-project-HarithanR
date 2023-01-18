import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyShip1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyShip1 extends Actor
{
    SimpleTimer spawnTimer = new SimpleTimer();
    /**
     * Act - do whatever the EnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnemyShip1()
    {
       GreenfootImage image = getImage();
       image.scale(image.getWidth() - 225, image.getHeight() - 225);
       setImage(image);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 2);
        
        
        destroy();
        //creationTimer();
    }
    public void destroy()
    {

        if(isTouching(PlayerLaser.class))
        {
            removeTouching(PlayerLaser.class);
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
            world.increaseScoreCount();           
            world.createShip();             
        }
        else
        {
            MyWorld world = (MyWorld) getWorld();          
            if(getY() ==  390)
            {
                world.decreaseLife();
                world.removeObject(this);
                world.createShip();
            }
        }
    }
    
    /*public void creationTimer()
    {
        
        if(spawnTimer.millisElapsed() > 1000)
        {
            spawnTimer.mark();
            MyWorld world = (MyWorld) getWorld();
            world.createShip();
        }
    }*/
    
    

    
}
