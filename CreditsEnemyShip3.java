import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A verson of EnemyShip3 used for credit-related purposes
 * 
 * Harithan Raveendran
 * January 2023
 */
public class CreditsEnemyShip3 extends Actor
{
    /**
     * Act - do whatever the CreditsEnemyShip3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CreditsEnemyShip3()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 75, image.getHeight() - 165);
        setImage(image);
    }
}
