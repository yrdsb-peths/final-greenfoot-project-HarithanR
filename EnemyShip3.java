import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyShip3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyShip3 extends Actor
{
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
    public EnemyShip3()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 75, image.getHeight() - 165);
        setImage(image);
    }

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
        //creationTimer();
    }

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

    public void createLaser()
    {
        /*spawnLaser.mark();
        if(spawnLaser.millisElapsed() > 550)
        {
        MyWorld world = (MyWorld) getWorld();
        EnemyLaser eLaser = new EnemyLaser();
        world.addObject(eLaser,eShipx, eShipy + 20);      
        }*/

    }

    
    public void creationTimer()
    {

        /*if(spawnTimer.millisElapsed() > 1000)
        {
        spawnTimer.mark();
        MyWorld world = (MyWorld) getWorld();
        world.createShip();
        }*/
    }
}
