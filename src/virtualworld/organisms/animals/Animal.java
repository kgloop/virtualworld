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
    private int step;
    public Animal(World worldWhereAnimalLive){
        this.world = worldWhereAnimalLive;
        Point position = new Point(1,1);
    }     
    @Override
    public void action(){        
        Random rand = new Random();         
        this.step = rand.nextInt(7)+1;  
        if(step == 1){
            int x = 0;
            int y = 0;
            if(this.world.getOrganisms()[x][y+1] == null){
                this.world.getOrganisms()[x][y+1] = this;
            }
        else if(step == 2){
            if(this.world.getOrganisms()[x+1][y+1] == null){
                this.world.getOrganisms()[x+1][y+1] = this;
            }
        }
        else if(step == 3){
            if(this.world.getOrganisms()[x+1][y] == null){
                this.world.getOrganisms()[x+1][y] = this;
            }
        }
        else if(step == 4){
            if(this.world.getOrganisms()[x+1][y-1] == null){
                this.world.getOrganisms()[x+1][y-1] = this;
            }
        }
        else if(step == 5){
            if(this.world.getOrganisms()[x][y-1] == null){
                this.world.getOrganisms()[x][y-1] = this;
            }
        }
        else if(step == 6){
            if(this.world.getOrganisms()[x-1][y-1] == null){
                this.world.getOrganisms()[x-1][y-1] = this;
            }
        }
        else if(step == 7){
            if(this.world.getOrganisms()[x-1][y] == null){
                this.world.getOrganisms()[x-1][y] = this;
            }
        }
        else if(step == 8){
            if(this.world.getOrganisms()[x-1][y+1] == null){
                this.world.getOrganisms()[x-1][y+1] = this;
            }
        }
        }
   
    }
    
    @Override
    public void collision(){
        
    }
}
