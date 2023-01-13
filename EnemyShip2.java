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
        setLocation(getX(), getY() + 3);
        destroy2();
        /*
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        } 
        */
    }
    public void destroy2()
    {

        if(isTouching(PlayerLaser.class))
        {
            removeTouching(PlayerLaser.class);
            MyWorld2 world2 = (MyWorld2) getWorld();
            world2.removeObject(this);
            world2.decreaseEnemyCount();
            world2.createShip2();             
        }
    }
    
}
