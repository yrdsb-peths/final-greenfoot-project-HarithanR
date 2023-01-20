import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A verson of EnemyShip1 used for credit-related purposes
 * 
 * Harithan Raveendran
 * January 2023
 */
public class CreditsEnemyShip1 extends Actor
{
    /**
     * Act - do whatever the CreditsEnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CreditsEnemyShip1()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 225, image.getHeight() - 225);
        setImage(image);
    }
}
