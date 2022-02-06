import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Drink here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drink extends Actor
{
    int counter = 0;
    int max = 300;
    /**
     * Act - do whatever the Drink wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("drink.png"));
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/3, image.getHeight()/3);
        checkCollect();
        if (counter == max) getWorld().removeObject(this);
        counter++;
    }
    public void checkCollect()
    {
        Actor touch = getOneObjectAtOffset(0, 0, Mimo.class);
        //Actor b = getOneIntersectingObject(Enemy.class);
        if(touch != null)
        {
            Greenfoot.playSound("lose.wav");
            Score.count = 0;
            getWorld().removeObject(this);
            Greenfoot.setWorld(new CreditsScreen());
        }
    }
}
