import info.gridworld.actor.Actor;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
public class Swordsman extends Actor implements Character
{
    int lvl;
    int health;
    int yloc;
    int xloc;
    public Swordsman(int y, int x)
    {
        int yloc = y;
        int xloc = x;
    }
    public Swordsman(int rank)
    {
        lvl = 0;
    }
    public String getName()
    {
        return "Swordsman";
    }
    public String getType()
    {
        return "P";
    }
    public int getLevel()
    {
        return 1 + lvl;
    }
    public int getHealth() 
    {
        return 150; 
    }
    public int getAttack() 
    {
        return 75 + (12 * lvl);
    }
    public int getDefense() 
    {
        return 5 + (2 * lvl);
    }
    public int getEvade() 
    {
        return 20; //(out of 100) (chance factor) 
    }
    public int getResM()
    {
        return 0;
    }
    public int getMove() 
    {
        return 2; 
    }
    
}