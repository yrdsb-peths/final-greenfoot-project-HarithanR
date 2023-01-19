import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsEnemyShip3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsEnemyShip3 extends Actor
{
    /**
     * Act - do whatever the CreditsEnemyShip3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 75, image.getHeight() - 165);
        setImage(image);
    }
}
