import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    int numFrame = 5;
    int idx = 0;
    
    //delay the sprite animation:
    int counter = 0;
    int max = 5;
    
    public void act()
    {
        if (counter == max)
        {
        String num = Integer.toString((idx % numFrame));
        setImage("title" + num + ".gif");
        idx++;
        counter = 0;
        }
        
        counter++;
    }
}
