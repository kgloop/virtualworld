/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import virtualworld.organisms.Organism;
import virtualworld.organisms.animals.Wolf;

/**
 *
 * @author Aleksandra
 */
public class World {
    private List<Organism> organisms;
    private static final int WORLD_SIZE = 20;
    
    public World() {
        //this.organisms = new Organism[WORLD_SIZE][WORLD_SIZE]; //określenie rozmiaru tablicy organisms i jednoczesne utworzenie obiektu organisms
        this.organisms = new ArrayList<>();
        this.organisms.add(new Wolf(this, new Point(3,4)));
        this.cleanupOrganisms(); //każdy utworzony nowy świat będzie wyczyszczony z organizmów
    
    }
    
    public void executeTurn(){
        //przejrzeć całą tablicę i jeżeli na aktualnie przeszukiwanym polu istnieje jakikolwiek organizm, wtedy należy wykonać akcję
        for (Organism organism : this.organisms) { //dla każdego organism klasy Organism i dla której listy
            organism.action();
        }
    }
    
    public void drawWorld(){
        
    }

    public List<Organism> getOrganisms(){ 
        return this.organisms;
    }

    private void cleanupOrganisms() {
        this.organisms.clear();
    }
    
    public boolean isOrganismAtPoint(Point position){
      for(Organism organism : this.organisms){
          if(organism.getPosition() == position){
              return true;
          }
      }
      return false;
    }
    
    public Organism getOrganism(Point position){
        for (Organism organism : this.organisms){
            if (organism.getPosition() == position) {
                return organism;
            }
        }
        return null;
    }
    
    public void removeOrganism(Organism organism){
        this.organisms.remove(organism);
    }
}
