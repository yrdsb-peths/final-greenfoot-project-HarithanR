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
    /** 
     * Act - do whatever the PlayerShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlayerShip()
    {
       GreenfootImage image = getImage();
       image.scale(image.getWidth() - 680, image.getHeight() - 830);
       setImage(image); 
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
            pShipx -= 5;
        }
        
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
            pShipx += 5;
        }

        destroyShip();
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
    
   public void destroyShip()
    {
        if(isTouching(EnemyShip1.class))
        {
            removeTouching(EnemyShip1.class);
            MyWorld world = (MyWorld) getWorld();
                         
        }

    }
}
