import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tikus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tikus extends Actor
{
    /**
     * Act - do whatever the Tikus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
    }
    
    public void moveAndTurn()
    {
        move (4);
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    
    public void eat()
    {
        Actor keju;
        keju = getOneObjectAtOffset(0, 0, keju.class);
        if (keju !=null)
        {
            World world;
            world = getWorld();
            world.removeObject(keju);
            addScore();
        }
    }
    
    public void addScore()
    {
        if (!getWorld().getObjects(Counter.class).isEmpty())
        {
            ((Counter) getWorld().getObjects(Counter.class).get(0)).add(1);
        }
    }
}


