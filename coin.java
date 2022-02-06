import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coin extends Actor
{
    /**
     * Act - do whatever the coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("coin.png"));
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        checkCollect();
    }
    public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    public void checkCollect()
    {
        Actor touch = getOneObjectAtOffset(0, 0, Mimo.class);
        //Actor b = getOneIntersectingObject(Enemy.class);
        if(touch != null)
        {
            Greenfoot.playSound("yeet.wav");
            Score.count++;
            getWorld().addObject(new coin(), getRandomNumber(100,1100), getRandomNumber(400,600));
            
            int drinkSpawn = getRandomNumber(1, 5);
            if (drinkSpawn == 3) getWorld().addObject(new Drink(), getRandomNumber(100,1100), getRandomNumber(400,600));
            
            getWorld().removeObject(this);
        }
    }
}
