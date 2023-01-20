import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A version of playerShip used for both the game over and title screens.
 * 
 * Harithan Raveendran
 * January 2023
 */
public class DecorationPlayerShip extends Actor
{
    /**
     * Act - do whatever the DecorationPlayerShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       
    }
    
    //Sets the image's size.
    public DecorationPlayerShip()
    {
       GreenfootImage image = getImage();
       image.scale(image.getWidth() - 580, image.getHeight() - 730);
       setImage(image); 
    }
}
