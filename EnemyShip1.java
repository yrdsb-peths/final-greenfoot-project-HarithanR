import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The first enemy the player faces in the game.
 * 
 * Harithan Raveendran
 * January 2023
 */
public class EnemyShip1 extends Actor
{
    //Sets up multiple classes and integers for the code in the classes below.
    SimpleTimer tim1 = new SimpleTimer();
    public static int eShipx = 297;
    public static int eShipy = 356;
    GreenfootSound destroySound = new GreenfootSound("TinyWorlds_explosion.wav");
    /**
     * Act - do whatever the EnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Sets the images size.
    public EnemyShip1()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 225, image.getHeight() - 225);
        setImage(image);
    }

    //Uses classes that allow the enemy ship to move and be killed by the player via laser. Also sets up timer for class below.
    public void act()
    {
        eShipx = getX();
        eShipy = getY();
        setLocation(getX(), getY() + 3);
        tim1.mark();

        destroy();

    }
    
    //Allows the enemy ship to die upon being touched by the player's laser. Also shows an explosion animation upon being destroyed.
    //Also allows the user's lives to be decreased when the ship reaches the end of the world.
    public void destroy()
    {

        if(isTouching(PlayerLaser.class))
        {
            removeTouching(PlayerLaser.class);
            MyWorld world = (MyWorld) getWorld();
            ExplosionEnemy explosion = new ExplosionEnemy();
            world.addObject(explosion,eShipx,eShipy);
            if(tim1.millisElapsed() > 150)
            {
                world.removeObject(explosion);
            } 
            world.removeObject(this);
            destroySound.play();
            world.increaseScoreCount();           
            world.createShip();             
        }
        else
        {
            MyWorld world = (MyWorld) getWorld();          
            if(getY() >=  390)
            {
                world.decreaseLife();
                world.removeObject(this);
                world.createShip();
            }
        }
    }

    //Sets the location of the player and gets the coordinates of the enemy ship.
    public void setPlayerLocation(int ex, int ey)
    {
        ex = eShipx;
        ey = eShipy;
    }

    public int getEnemyLocationx(int ex)
    {
        return ex;
    }

    public int getEnemyLocationy(int ey)
    {
        return ey;
    }

    


}
