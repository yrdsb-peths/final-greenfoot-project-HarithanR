import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The final enemy the player faces in the game.
 * 
 * Harithan Raveendran 
 * January 2023
 */
public class EnemyShip3 extends Actor
{
    //A few integers, sounds, a timer and a boolean used for the classes below.
    public static int eShipx = 297;
    public static int eShipy = 356;
    SimpleTimer spawnLaser = new SimpleTimer();
    GreenfootSound blastSound = new GreenfootSound("Farfadet46_tir.mp3");
    GreenfootSound destroySound = new GreenfootSound("TinyWorlds_explosion.wav");
    boolean canShoot = true;
    /**
     * Act - do whatever the EnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Sets the image's size.
    public EnemyShip3()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 75, image.getHeight() - 165);
        setImage(image);
    }
    
    /*
     * Allows the enemy ship to move and shoot their laser from time to time. Also implements the destroy class's functions. 
     */
    public void act()
    {
        eShipx = getX();
        eShipy = getY();
        setLocation(eShipx, eShipy + 1);

        //createLaser();
        if(canShoot)
        {
            canShoot = false;

            spawnLaser.mark();
            MyWorld world = (MyWorld) getWorld();
            EnemyLaser eLaser = new EnemyLaser();
            world.addObject(eLaser,eShipx,eShipy + 50);
            blastSound.play();
        }

        if(spawnLaser.millisElapsed() > 850)
        {
            canShoot = true;

        }
        destroy();
        //winTimer.mark();
        //creationTimer();
    }
    
    /*
     * Allows the enemy ship to be destroyed upon touching the player's laser, or despawn after reaching the edge of the world. The
     * latter of which decreases the player's life.
     */ 
    public void destroy()
    {

        if(isTouching(PlayerLaser.class))
        {
            removeTouching(PlayerLaser.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScoreCount();           
            world.createShip();      
            world.removeObject(this);
            destroySound.play();
        }

        else
        {
            MyWorld world = (MyWorld) getWorld();          
            if(getY() >=  380)
            {
                world.decreaseLife();
                world.createShip();
                world.removeObject(this);
            }
        }
    }

}
