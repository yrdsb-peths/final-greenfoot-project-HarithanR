import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The credits screen. Shows the assets used and the creators they belong to.
 * 
 * Harithan Raveendran 
 * January 2023
 */
public class Credits extends World
{
    //The lines of text used to display words in the credits screen.
    Label titleLabel = new Label("Credits:", 50);
    Label credits1 = new Label("Ansimuz:Background", 30);
    Label credits2 = new Label("MillionthVector:Player Ship", 30);
    Label credits3 = new Label("Rawdanitsu:Lasers", 30);
    Label credits4 = new Label("Skorpio:Enemy Ships", 30);
    Label credits5 = new Label("Master484:Explosions", 30);
    Label leave = new Label("Press C to return to the main menu", 30);
    /**
     * Adds previously mentioned lines of text to the world.
     * 
     */
    public Credits()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 75, 20);
        addObject(credits1, 118, 60);
        addObject(credits2, 150, 120);
        addObject(credits3, 105, 180);
        addObject(credits4, 115, 240);
        addObject(credits5, 125, 300);
        addObject(leave, 190, 360);
        prepare();
    }
    
    //Adds background stars and the assets to the world.
    public void prepare()
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
        extrasMyWorld2.setLocation(279,223);
        CreditsExplosion creditsExplosion = new CreditsExplosion();
        addObject(creditsExplosion,279,303);
        extrasMyWorld2.setLocation(272,177);
        CreditsEnemyShip1 creditsEnemyShip1 = new CreditsEnemyShip1();
        addObject(creditsEnemyShip1,252,240);
        extrasMyWorld3.setLocation(304,283);
        CreditsEnemyShip3 creditsEnemyShip3 = new CreditsEnemyShip3();
        addObject(creditsEnemyShip3,409,240);
        extrasMyWorld2.setLocation(302,179);
        CreditsEnemyShip2 creditsEnemyShip2 = new CreditsEnemyShip2();
        addObject(creditsEnemyShip2,328,240);
        extrasMyWorld2.setLocation(386,182);
        extrasMyWorld2.setLocation(323,177);
        extrasMyWorld2.setLocation(342,195);
        extrasMyWorld2.setLocation(388,212);
        extrasMyWorld2.setLocation(334,168);
        extrasMyWorld2.setLocation(403,219);
        extrasMyWorld2.setLocation(337,179);
        extrasMyWorld2.setLocation(346,166);
        extrasMyWorld2.setLocation(228,140);
        CreditsEnemyLaser creditsEnemyLaser = new CreditsEnemyLaser();
        addObject(creditsEnemyLaser,220,180);
        extrasMyWorld2.setLocation(320,142);
        CreditsPlayerLaser creditsPlayerLaser = new CreditsPlayerLaser();
        addObject(creditsPlayerLaser,240,182);
        extrasMyWorld2.setLocation(223,183);
        extrasMyWorld2.setLocation(241,184);
        extrasMyWorld3.setLocation(281,302);
        extrasMyWorld2.setLocation(265,251);
        extrasMyWorld2.setLocation(351,243);
        extrasMyWorld6.setLocation(427,246);
        extrasMyWorld7.setLocation(325,120);
        CreditsPlayerShip creditsPlayerShip = new CreditsPlayerShip();
        addObject(creditsPlayerShip,325,120);
    }
    
    //A method that allows the user to go back to the main menu upon pressing "c".
    public void act()
    {
        if(Greenfoot.isKeyDown("c"))
        {
            Titlescreen title = new Titlescreen();
            Greenfoot.setWorld(title);
        }
    }
}
