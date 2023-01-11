import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExtrasMyWorld4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExtrasMyWorld4 extends Actor
{
    /**
     * Act - do whatever the ExtrasMyWorld4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ExtrasMyWorld4()
    {
       GreenfootImage image = getImage();
       image.scale(image.getWidth() - 5, image.getHeight() - 5);
       setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
