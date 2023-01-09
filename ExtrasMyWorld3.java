import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExtrasMyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExtrasMyWorld3 extends Actor
{
    /**
     * Act - do whatever the ExtrasMyWorld3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ExtrasMyWorld3()
    {
       GreenfootImage image = getImage();
       image.scale(image.getWidth() - 25, image.getHeight() - 25);
       setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
