/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld.organisms;

import java.awt.Point;
import java.util.Random;
import virtualworld.World;
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
    public abstract void collision(); //to samo, co wyżej
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
    
    public Organism getNewOrganism(ORGANISM_TYPE type) {
        switch(type) {
            case WOLF:
                break;
            case SHEEP:
                break;
            case ANTHELOPE:
                break;
            case FOX:
                break;
            case TURTLE:
                break;
            case GRASS:
                break;
            case GUARANA:
                break;
            case SOW_THISTLE:
                return new SowThistle(world);
                break;
            case DEADLY_NIGHTSHADE:
                break;
            default:
                throw new AssertionError(type.name());
        }
                
    }
}
