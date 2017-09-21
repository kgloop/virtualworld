/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld.organisms.plants;

import java.awt.Point;
import virtualworld.World;
import virtualworld.organisms.Organism;

/**
 *
 * @author Aleksandra
 */
public class Guarana extends Plant {
    
    public Guarana(World word, Point position){
        this.force = 0;
        this.initiative = 0;
        this.world = world;
    }
    
    @Override
    public void collision(Organism organism){
        
    }
    
    @Override
    public void drawing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
