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
        int spreadingOutProbability = rand.nextInt(100) + 1; //losuję z przedziału 1 do 100 prawdopodobieństwo rozsiania się rośliny
        if (spreadingOutProbability > 60) { //jeżeli prawdopodobieństwo jest większe od określonej liczby
            Point newPosition = this.getNewPosition();
            if(!this.world.isOrganismAtPoint(newPosition)){ //jeżeli nie ma na nowej pozycji organizmu w tym świecie
                Plant plant = (Plant) this.getNewOrganism(this.getType(), this.getNewPosition());
                this.world.getOrganisms().add(plant);
            }
        }   
    }
    
    @Override
    public void collision(){
        
    }


    
}
