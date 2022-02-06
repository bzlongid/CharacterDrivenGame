import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mimo extends Actor
{
    private int gravity = 0;
    int originalY = 625;
    /**
     * Act - do whatever the Mimo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("mimosa.png"));
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        
        move();
        setLocation(getX(), getY() - gravity);
        checkForJump();
    }
    private void checkForJump()
    {
        boolean a = Greenfoot.isKeyDown("space") && originalY == getY();
        if (a) 
             gravity = 20; // this will make the character jump
        else
        {
            if (originalY != getY())
            {
                gravity--;
            }
            else
            {
                gravity = 0;
            }
        }
    }
    public void move()
    {
        int x = getX();
        int y = getY();
        
        if (Greenfoot.isKeyDown("right"))
            setLocation(x + 2, y);
        
        if (Greenfoot.isKeyDown("left"))
            setLocation(x - 2, y);
            
        if (Greenfoot.isKeyDown("space"))
            setLocation(x, y);
    }
}
