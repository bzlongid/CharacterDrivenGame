import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        super(1280, 720, 1); 
        GreenfootImage backdrop = new GreenfootImage("background1.png");
        backdrop.scale(getWidth(), getHeight());
        setBackground(backdrop);
        addObject(new Mimo(), 100, 625);
        addObject(new Title(), 670, 200);
    }
}
