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
public class Turtle extends Animal {
    
    public Turtle(World world){
        super(world);
        this.force = 2;
        this.initiative = 1;
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
