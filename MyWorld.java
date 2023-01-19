import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world where all the spaceships reside.
 * 
 * Harithan Raveendran 
 * @December 2022
 */
public class MyWorld extends World
{
    Label scoreLabel;
    Label lifeLabel;
    public int enemyCount = 2;
    public int[] score = {250, 500, 1000};
    public int totalScore = 0;
    public PlayerShip pShip;
    EnemyShip1 ship1;
    EnemyShip2 ship2;
    EnemyShip3 ship3;
    int difficulty = 1;
    public int lives = 3;
    GreenfootSound mainTheme = new GreenfootSound("Matthew_Pablo_Orbital_Colossus.mp3");
    GreenfootSound win = new GreenfootSound("Celestialghost8_Victory.mp3");
    SimpleTimer winTimer = new SimpleTimer();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
 
       
        
        Label titleScoreLabel = new Label("Score:", 30);
        addObject(titleScoreLabel, 75, 45);
        
        scoreLabel = new Label(totalScore, 30);
        addObject(scoreLabel, 150, 45);

        
        Label titleLifeLabel = new Label("Lives: ", 30);
        addObject(titleLifeLabel, 540, 45);
        
        lifeLabel = new Label(lives, 30);
        addObject(lifeLabel, 580, 45);
       
        
        pShip = new PlayerShip();
        addObject(pShip, pShip.pShipx, pShip.pShipy);
        
        createShip();            

        prepare();
       
    }
    public void createShip()
    {
        /**
         * Creates an apple for the player to catch. The apple can appear
         * anywhere randomly on the top of the map. Once it has been
         * caught, another spawns in.
         */
        if(difficulty == 1)
        {
            ship1 = new EnemyShip1();
            int x = Greenfoot.getRandomNumber(600);
            int y = 0;
            addObject(ship1, x, y);
        }
        
        else if(difficulty == 2)
        {
            removeObject(ship1);
            ship2 = new EnemyShip2();
            int x = Greenfoot.getRandomNumber(600);
            int y = 0;
            addObject(ship2, x, y);
        }
        
        else if(difficulty == 3)
        {
            removeObject(ship2);
            ship3 = new EnemyShip3();
            int x = Greenfoot.getRandomNumber(600);
            int y = 0;
            addObject(ship3, x, y);
        }
        
        else if(difficulty == 4)
        {
            removeObject(ship3);
            win.play();
            
            if(winTimer.millisElapsed() > 3000)
            {
                winTimer.mark();
                Label winLabel = new Label("You win!", 50);
                addObject(winLabel, getWidth()/2, getHeight()/2);
            }
        }
    }
    
    public void gameOver()
    {
        /**
         * Creates a lose condition for the player. In other words, once the
         * apple falls out of the player's reach, text saying "Game Over"
         * appears on the screen.
         */
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
     


    public void act()
    {
        mainTheme.play();
        if(lives == 0)
        {
            /*Label defeat = new Label("You Lose!", 100);
            addObject(defeat, getWidth()/2, getHeight()/2);*/
            GameOver gameOver = new GameOver();
            Greenfoot.setWorld(gameOver);
            
            mainTheme.stop();
        }
        
        if(totalScore >= 5000 && totalScore <= 15000)
        {
            difficulty = 2;
        }
        
        else if(totalScore > 15000 && totalScore <= 25000)
        {
            difficulty = 3;
        }
        
        else if(totalScore > 25000)
        {
            difficulty = 4;
            mainTheme.stop();
        }
    }
    
    
    public void decreaseLife()
    {
        lives--;
        lifeLabel.setValue(lives);
 
    }
    
    public void increaseScoreCount()
    {
        if(difficulty == 1)
        {
           totalScore += score[0]; 
        }
        else if(difficulty == 2)
        {
           totalScore += score[1];
        }
        else if(difficulty == 3)
        {
            totalScore += score[2];
        }
        scoreLabel.setValue(totalScore);
   
    }

  
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ExtrasMyWorld extrasMyWorld = new ExtrasMyWorld();
        addObject(extrasMyWorld,478,69);
        ExtrasMyWorld extrasMyWorld2 = new ExtrasMyWorld();
        addObject(extrasMyWorld2,476,179);
        ExtrasMyWorld extrasMyWorld3 = new ExtrasMyWorld();
        addObject(extrasMyWorld3,467,283);
        ExtrasMyWorld extrasMyWorld4 = new ExtrasMyWorld();
        addObject(extrasMyWorld4,460,326);
        extrasMyWorld3.setLocation(424,324);
        ExtrasMyWorld extrasMyWorld5 = new ExtrasMyWorld();
        addObject(extrasMyWorld5,424,324);
        ExtrasMyWorld extrasMyWorld6 = new ExtrasMyWorld();
        addObject(extrasMyWorld6,459,193);
        ExtrasMyWorld extrasMyWorld7 = new ExtrasMyWorld();
        addObject(extrasMyWorld7,423,99);
        ExtrasMyWorld extrasMyWorld8 = new ExtrasMyWorld();
        addObject(extrasMyWorld8,400,166);
        extrasMyWorld3.setLocation(390,291);
        ExtrasMyWorld extrasMyWorld9 = new ExtrasMyWorld();
        addObject(extrasMyWorld9,390,291);
        extrasMyWorld7.setLocation(314,128);
        ExtrasMyWorld extrasMyWorld10 = new ExtrasMyWorld();
        addObject(extrasMyWorld10,314,128);
        extrasMyWorld8.setLocation(321,236);
        ExtrasMyWorld extrasMyWorld11 = new ExtrasMyWorld();
        addObject(extrasMyWorld11,321,236);
        ExtrasMyWorld extrasMyWorld12 = new ExtrasMyWorld();
        addObject(extrasMyWorld12,304,312);
        extrasMyWorld7.setLocation(331,83);
        ExtrasMyWorld extrasMyWorld13 = new ExtrasMyWorld();
        addObject(extrasMyWorld13,331,83);
        extrasMyWorld12.setLocation(174,316);
        ExtrasMyWorld extrasMyWorld14 = new ExtrasMyWorld();
        addObject(extrasMyWorld14,174,316);
        extrasMyWorld14.setLocation(140,308);
        ExtrasMyWorld extrasMyWorld15 = new ExtrasMyWorld();
        addObject(extrasMyWorld15,140,308);
        ExtrasMyWorld extrasMyWorld16 = new ExtrasMyWorld();
        addObject(extrasMyWorld16,144,180);
        extrasMyWorld10.setLocation(178,76);
        ExtrasMyWorld extrasMyWorld17 = new ExtrasMyWorld();
        addObject(extrasMyWorld17,178,76);
        ExtrasMyWorld extrasMyWorld18 = new ExtrasMyWorld();
        addObject(extrasMyWorld18,262,70);
        ExtrasMyWorld extrasMyWorld19 = new ExtrasMyWorld();
        addObject(extrasMyWorld19,132,167);
        ExtrasMyWorld extrasMyWorld20 = new ExtrasMyWorld();
        addObject(extrasMyWorld20,248,200);
        ExtrasMyWorld extrasMyWorld21 = new ExtrasMyWorld();
        addObject(extrasMyWorld21,224,298);
        extrasMyWorld11.setLocation(244,304);
        ExtrasMyWorld extrasMyWorld22 = new ExtrasMyWorld();
        addObject(extrasMyWorld22,244,304);
        extrasMyWorld10.setLocation(255,154);
        ExtrasMyWorld extrasMyWorld23 = new ExtrasMyWorld();
        addObject(extrasMyWorld23,255,154);
        ExtrasMyWorld extrasMyWorld24 = new ExtrasMyWorld();
        addObject(extrasMyWorld24,201,52);
        ExtrasMyWorld extrasMyWorld25 = new ExtrasMyWorld();
        addObject(extrasMyWorld25,135,61);
        extrasMyWorld17.setLocation(173,44);
        ExtrasMyWorld extrasMyWorld26 = new ExtrasMyWorld();
        addObject(extrasMyWorld26,173,44);
        ExtrasMyWorld extrasMyWorld27 = new ExtrasMyWorld();
        addObject(extrasMyWorld27,177,209);
        ExtrasMyWorld extrasMyWorld28 = new ExtrasMyWorld();
        addObject(extrasMyWorld28,154,335);
        extrasMyWorld16.setLocation(150,209);
        ExtrasMyWorld extrasMyWorld29 = new ExtrasMyWorld();
        addObject(extrasMyWorld29,150,209);
        extrasMyWorld2.setLocation(408,163);
        ExtrasMyWorld extrasMyWorld30 = new ExtrasMyWorld();
        addObject(extrasMyWorld30,408,163);
        ExtrasMyWorld extrasMyWorld31 = new ExtrasMyWorld();
        addObject(extrasMyWorld31,424,88);
        ExtrasMyWorld extrasMyWorld32 = new ExtrasMyWorld();
        addObject(extrasMyWorld32,470,37);
        extrasMyWorld10.setLocation(158,101);
        ExtrasMyWorld extrasMyWorld33 = new ExtrasMyWorld();
        addObject(extrasMyWorld33,158,101);
    }

}
