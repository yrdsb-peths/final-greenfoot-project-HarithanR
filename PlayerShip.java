import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The ship the user plays as.
 * 
 * @Harithan Raveendran 
 * @January 2023
 */

public class PlayerShip extends Actor
{
    public static int pShipx = 297;
    public static int pShipy = 356;
    boolean canShoot = true;
    GreenfootSound blastSound = new GreenfootSound("Farfadet46_tir.mp3");
    GreenfootSound destroySound = new GreenfootSound("TinyWorlds_explosion.wav");

    /** 
     * Act - do whatever the PlayerShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    SimpleTimer pLaserCooldown = new SimpleTimer();
    SimpleTimer animationTimer = new SimpleTimer();
    public PlayerShip()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 680, image.getHeight() - 830);
        setImage(image); 
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
        {
            move(-8);
            pShipx -= 8;
        }

        else if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
            move(8);
            pShipx += 8;
        }

        if(Greenfoot.isKeyDown("space") && canShoot)
        {
            canShoot = false;

            pLaserCooldown.mark();
            MyWorld world = (MyWorld) getWorld();
            PlayerLaser pLaser = new PlayerLaser();
            world.addObject(pLaser,pShipx,316);
            blastSound.play();
        }

        if(pLaserCooldown.millisElapsed() > 550)
        {
            canShoot = true;
        }
        damage();
    }

    public void damage()
    {
        if(isTouching(EnemyShip1.class))
        {
            removeTouching(EnemyShip1.class);
            MyWorld world = (MyWorld) getWorld();
            ExplosionEnemy explosion = new ExplosionEnemy();
            world.addObject(explosion,pShipx,pShipy - 50);
            if(animationTimer.millisElapsed() == 500)
            {
                world.removeObject(explosion);
            } 
            world.decreaseLife();
            world.createShip();
            destroySound.play();
        }

        if(isTouching(EnemyShip2.class))
        {
            removeTouching(EnemyShip2.class);
            MyWorld world = (MyWorld) getWorld();
            ExplosionEnemy explosion = new ExplosionEnemy();
            world.addObject(explosion,pShipx,pShipy - 50);
            if(animationTimer.millisElapsed() == 500)
            {
                world.removeObject(explosion);
            } 
            world.decreaseLife();
            world.createShip();
            destroySound.play();
        }

        if(isTouching(EnemyShip3.class))
        {
            removeTouching(EnemyShip3.class);
            MyWorld world = (MyWorld) getWorld();
            ExplosionEnemy explosion = new ExplosionEnemy();
            world.addObject(explosion,pShipx,pShipy - 50);
            if(animationTimer.millisElapsed() == 500)
            {
                world.removeObject(explosion);
            } 
            world.decreaseLife();
            world.createShip();
            destroySound.play();
        }
    }

    public void injure()
    {
        if(isTouching(EnemyLaser.class))
        {
            removeTouching(EnemyLaser.class);
            MyWorld world = (MyWorld) getWorld();
            world.decreaseLife();
        }
    }

    public void setPlayerLocation(int px, int py)
    {
        px = pShipx;
        py = pShipy;
    }

    public int getPlayerLocationx(int px)
    {
        return px;
    }

    public int getPlayerLocationy(int py)
    {
        return py;
    }


}
