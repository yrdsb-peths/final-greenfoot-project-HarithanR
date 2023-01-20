import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The laser the third enemy ship fires.
 * 
 * Harithan Raveendran
 * January 2023
 */
public class EnemyLaser extends Actor
{

    /**
     * Sets the laser's coordinates. Also allows it to move.
     */

    public void act()
    {
        int x = getX();
        int y  = getY();

        y = y + 7;

        setLocation(x, y);
        
        //Removes the laser upon reaching the edge of the world.
        if (y > getWorld().getHeight()){
            getWorld().removeObject(this);
        }
        //Decreases the user's lives and disappears upon touching the player ship.
        else if(isTouching(PlayerShip.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
            world.decreaseLife();
        }
    }

}

