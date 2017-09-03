/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld.organisms.plants;

import java.awt.Point;
import java.util.Random;
import virtualworld.organisms.Organism;

/**
 *
 * @author Aleksandra
 */
public abstract class Plant extends Organism {
    
    @Override
    public void action(){
        Random rand = new Random();
        int spreadingOutProbability = rand.nextInt(100) + 1;
        if (spreadingOutProbability > 60) {
            Point newPosition = this.getNewPosition();
            if(!this.world.isOrganismAtPoint(newPosition)){
                Plant plant = this.getNewPlant(this.getType());
                this.world.getOrganisms().add(plant);
            }
        }   
    }
    
    @Override
    public void collision(){
        
    }


    
}
