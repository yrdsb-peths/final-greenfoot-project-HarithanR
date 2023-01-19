import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyShip2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyShip2 extends Actor
{
    /**
     * Act - do whatever the EnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnemyShip2()
    {
       GreenfootImage image = getImage();
       image.scale(image.getWidth() - 75, image.getHeight() - 75);
       setImage(image);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 5);
        //outOfBounds();
        destroy2();
        
        
        
    }
    
    /*public void outOfBounds()
    {
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.decreaseLife();
            world.removeObject(this);
        }
    }*/
    
     /* Act - do whatever the EnemyShip2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void destroy2()
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
            if(getY() >= 380)
            {
                world.decreaseLife();
                world.removeObject(this);
                world.createShip();
            }
        }
        
    }
}
