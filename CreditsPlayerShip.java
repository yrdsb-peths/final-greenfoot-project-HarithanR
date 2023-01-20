import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A verson of PlayerShip used for credit-related purposes
 * 
 * Harithan Raveendran
 * January 2023
 */
public class CreditsPlayerShip extends Actor
{
    /**
     * Act - do whatever the CreditsPlayerShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CreditsPlayerShip()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 680, image.getHeight() - 830);
        setImage(image);
    }
}
