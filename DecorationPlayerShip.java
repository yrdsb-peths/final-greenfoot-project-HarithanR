import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DecorationPlayerShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public DecorationPlayerShip()
    {
       GreenfootImage image = getImage();
       image.scale(image.getWidth() - 580, image.getHeight() - 730);
       setImage(image); 
    }
}
