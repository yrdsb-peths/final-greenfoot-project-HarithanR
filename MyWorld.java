import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world where all the spaceships reside.
 * 
 * Harithan Raveendran 
 * @December 2022
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
    super(600, 400, 1);
    PlayerShip pShip = new PlayerShip();
    addObject(pShip, 300, 300);
    }
}
