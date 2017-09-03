/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld.organisms.plants;

import virtualworld.World;

/**
 *
 * @author Aleksandra
 */
public class Grass extends Plant {
    
    public Grass(World world){
        this.force = 0;
        this.initiative = 0;
        this.world = world;
    }

    @Override
    public void drawing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
