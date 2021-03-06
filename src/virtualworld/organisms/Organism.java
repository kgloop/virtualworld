/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld.organisms;

import java.awt.Point;
import java.util.Random;
import virtualworld.World;
import virtualworld.organisms.animals.Antelope;
import virtualworld.organisms.animals.Fox;
import virtualworld.organisms.animals.Sheep;
import virtualworld.organisms.animals.Turtle;
import virtualworld.organisms.animals.Wolf;
import virtualworld.organisms.plants.DeadlyNightshade;
import virtualworld.organisms.plants.Grass;
import virtualworld.organisms.plants.Guarana;
import virtualworld.organisms.plants.SowThistle;

/**
 *
 * @author Aleksandra
 */
public abstract class Organism {
    protected int force; //jeżeli protected to klasy dziedziczące po klasie Organism wiedzą, czym jest pole force
    protected int initiative;
    protected Point position;
    protected World world;
    protected ORGANISM_TYPE type;
    
    public abstract void action(); //abstrakcyjna metoda void, która musi być zawarta w każdej klasie dziedziczącej po klasie Organism
    public abstract void collision(Organism organism); //to samo, co wyżej
    public abstract void drawing(); //to samo, co wyżej
    
    public void setPosition(Point position){
        this.position = position;
    }
    
    public Point getPosition(){
        return this.position;
    }
    
    protected Point getNewPosition(){
        Random rand = new Random();         
        int step = rand.nextInt(7)+1;  
        Point newPosition = new Point(this.position);
        if(step == 1){
            newPosition.x--;
            newPosition.y--;
        }
        else if(step == 2){
            newPosition.y--;
        }
        else if(step == 3){
            newPosition.x++;
            newPosition.y--;
        }
        else if(step == 4){
            newPosition.x--;
        }
        else if(step == 5){
            newPosition.x++;
        }
        else if(step == 6){
            newPosition.x--;
            newPosition.y++;
        }
        else if(step == 7){
            newPosition.y++;
        }
        else if(step == 8){
            newPosition.x++;
            newPosition.y++;
        }
        return newPosition;
    }
    
    public enum ORGANISM_TYPE{
        WOLF,
        SHEEP,
        ANTHELOPE,
        FOX,
        TURTLE,
        GRASS,
        GUARANA,
        SOW_THISTLE,
        DEADLY_NIGHTSHADE
    }
    
    public ORGANISM_TYPE getType(){
        return this.type;
    }
    
    public Organism getNewOrganism(ORGANISM_TYPE type, Point position) {
        switch(type) {
            case WOLF:
                return new Wolf(world, position);
            case SHEEP:
                return new Sheep(world, position);
            case ANTHELOPE:
                return new Antelope(world, position);
            case FOX:
                return new Fox(world, position);
            case TURTLE:
                return new Turtle(world, position);
            case GRASS:
                return new Grass(world, position);
            case GUARANA:
                return new Guarana(world, position);
            case SOW_THISTLE:
                return new SowThistle(world, position);
            case DEADLY_NIGHTSHADE:
                return new DeadlyNightshade(world, position);
            default:
                throw new AssertionError(type.name());
        }
                
    }
    
    public int getForce(){
        return this.force;
    }
}
