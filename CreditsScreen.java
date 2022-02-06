import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsScreen extends World
{

    /**
     * Constructor for objects of class CreditsScreen.
     * 
     */
    public CreditsScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        GreenfootImage backdrop = new GreenfootImage("stary_sky.jpg");
        backdrop.scale(getWidth(), getHeight());
        setBackground(backdrop);
        showText("By: Tiger and Zeya (:", 150, 650);
    }
}
