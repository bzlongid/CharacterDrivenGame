import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleTextBox extends Actor
{
    /**
     * Act - do whatever the TitleText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage box = new GreenfootImage(500, 50);
        box.setColor(Color.GRAY);
        box.fillRect(0,0,500,50);
        setImage(box);
    }
}
