import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExtrasMyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExtrasMyWorld2 extends Actor
{
    /**
     * Act - do whatever the ExtrasMyWorld2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ExtrasMyWorld2()
    {
       GreenfootImage image = getImage();
       image.scale(image.getWidth() - 50, image.getHeight() - 50);
       setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
