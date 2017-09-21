/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld.organisms.animals;

import java.awt.Point;
import java.util.Random;
import virtualworld.World;
import virtualworld.organisms.Organism;

/**
 *
 * @author Aleksandra
 */
public abstract class Animal extends Organism {
    
    public Animal(World worldWhereAnimalLive, Point position){
        this.world = worldWhereAnimalLive;
        this.position = position;
    }  
    
    @Override
    public void action(){        
        Point newPosition = this.getNewPosition();
        
        if(this.world.isOrganismAtPoint(newPosition)){
            //kolizja na organiźmie
            this.collision(this.world.getOrganism(newPosition));
        }
        else{
            this.setPosition(newPosition); //ustawienie nowej pozycji na Animal (samym sobie)
        }
    }
    
    @Override
    public void collision(Organism organism){
        if(this.getType() != organism.getType()){
            this.differentTypeCollision(organism);
        }
        else {
            //TO DO same types collision
        }
    }
    
    protected void differentTypeCollision(Organism organism){
        if(this.getForce() >= organism.getForce()){
            this.world.removeOrganism(organism);
        }
        else{
            this.world.removeOrganism(this);
        }
    }
}
