import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The ship the user plays as.
 * 
 * @Harithan Raveendran 
 * @January 2023
 */
import greenfoot.*;

public class PlayerShip extends Actor
{
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
            move(-1);
        }
        
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
    }
}
