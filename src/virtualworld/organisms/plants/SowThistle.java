/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld.organisms.plants;

import java.awt.Point;
import virtualworld.World;

/**
 *
 * @author Aleksandra
 */
public class SowThistle extends Plant{
    
    public SowThistle(World world, Point position){
        this.force = 0;
        this.initiative = 0;
        this.world = world;
        this.type = ORGANISM_TYPE.SOW_THISTLE;
    }
    
    @Override
    public void action(){
        
    }

    @Override
    public void drawing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
