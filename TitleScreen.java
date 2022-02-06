import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        GreenfootImage backdrop = new GreenfootImage("bar.png");
        backdrop.scale(getWidth(), getHeight());
        setBackground(backdrop);
        addObject(new Title(), 670, 200);
        addObject(new TitleTextBox(), 670, 500);
        showText("Press ENTER to start!", 670, 500);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("enter")) 
        {
            Greenfoot.playSound("coin.wav");
            Greenfoot.setWorld(new MainWorld());
        }
    }
}
