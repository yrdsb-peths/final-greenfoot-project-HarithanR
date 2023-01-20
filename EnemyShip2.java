import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The second enemy the player faces in the game.
 * 
 * Harithan Raveendran
 * January 2023
 */
public class EnemyShip2 extends Actor
{
    /**
     * Act - do whatever the EnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Sets the image's size.
    public EnemyShip2()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 75, image.getHeight() - 75);
        setImage(image);
    }
    
    //Allows the enemy ship to be move. Also adds class that allows it to be destroyed.
    public void act()
    {
        setLocation(getX(), getY() + 5);
        //outOfBounds();
        destroy2();

        
    }


    /*
     * Allows the enemy ship to be destroyed upon touching the player's lasers, or despawn after reaching the edge of the world.
     * The latter of which decreases the player's life.
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
