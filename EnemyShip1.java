import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyShip1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyShip1 extends Actor
{
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
        /*
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        } 
        */
    }
    public void destroy()
    {

        if(isTouching(PlayerLaser.class))
        {
            removeTouching(PlayerLaser.class);
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
<<<<<<< Updated upstream
            world.decreaseEnemyCount();
            world.createShip1();             
=======
            world.increaseScore();
            world.createShip();             
>>>>>>> Stashed changes
        }
    }
}
