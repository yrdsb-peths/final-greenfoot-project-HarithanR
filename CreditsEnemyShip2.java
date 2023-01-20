import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsEnemyShip2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsEnemyShip2 extends Actor
{
    /**
     * Act - do whatever the CreditsEnemyShip2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CreditsEnemyShip2()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 75, image.getHeight() - 75);
        setImage(image);
    }
}
