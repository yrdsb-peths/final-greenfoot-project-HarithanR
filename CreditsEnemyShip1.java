import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsEnemyShip1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsEnemyShip1 extends Actor
{
    /**
     * Act - do whatever the CreditsEnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 225, image.getHeight() - 225);
        setImage(image);
    }
}
