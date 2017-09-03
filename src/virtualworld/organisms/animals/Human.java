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
public class Human extends Animal {
    
    public Human(World world){
        super(world);
        this.force = 5;
        this.initiative = 4;
    }
    
    @Override
    public void action(){
        
    }
    
    @Override
    public void collision(){
        
    }

    @Override
    public void drawing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
