import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    public static int count = 0;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage myPic = new GreenfootImage(100, 50);
        myPic.setColor(Color.BLACK);
        myPic.drawRect(0,0,99,49);
        myPic.setColor(Color.WHITE);
        myPic.fillRect(1,1,98,48);
        Font myFont = myPic.getFont();
        myFont = myFont.deriveFont(20);
        myPic.setFont(myFont);
        myPic.setColor(Color.BLACK);
        
        myPic.drawString("Score: "+ Integer.toString(count), 10,25);
        setImage(myPic);
        checkEndGame();
    }
    public void checkEndGame()
    {
        if (count ==10)
            Greenfoot.setWorld(new CreditsScreen());
    }
    public int getScore()
    {
        return count;
    }
    public void updateScore()
    {
        count++;
    }
}
