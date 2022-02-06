import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        GreenfootImage backdrop = new GreenfootImage("background1.png");
        backdrop.scale(getWidth(), getHeight());
        setBackground(backdrop);
        
        Score.count = 0;
        addObject(new Score(), 60, 50);
        addObject(new Mimo(), 100, 625);
        addObject(new coin(), 600, 450);
        
        GreenfootSound backgroundMusic = new GreenfootSound("bg.mp3");
        backgroundMusic.playLoop();
    }
}
