/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld.organisms.animals;

import virtualworld.World;

/**
 *
 * @author Aleksandra
 */
public class Wolf extends Animal {

    public Wolf(World world){
      super(world);
      this.force = 9;
      this.initiative = 5;
    }
    
    @Override
    public void drawing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
